package org.login.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.login.entity.Ban;
import org.login.entity.enums.KhuVuc;
import org.login.entity.enums.LoaiBan;
import org.login.entity.enums.TrangThaiBan;
import org.login.hibernate.HibernateUtils;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.List;

public class BanDAO {
    private List<Ban> listBan;

    public List<Ban> readAll() {
        Session session = HibernateUtils.getFactory().openSession();

        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Ban> query = builder.createQuery(Ban.class);
        Root root = query.from(Ban.class);
        query = query.select(root);

        Query q = session.createQuery(query);

        listBan = q.getResultList();

        session.close();

        return this.listBan;
    }

    public List<Ban> readByStatus(TrangThaiBan trangThaiBan){
        Session session = HibernateUtils.getFactory().openSession();

        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Ban> query = builder.createQuery(Ban.class);
        Root root = query.from(Ban.class);
        query = query.select(root);

        Predicate p1;
        switch (trangThaiBan) {
            case BAN_TRONG -> p1 = builder.like(root.get("trangThaiBan").as(String.class), "BAN_TRONG");
            case DANG_PHUC_VU -> p1 = builder.like(root.get("trangThaiBan").as(String.class), "DANG_PHUC_VU");
            default -> p1 = builder.like(root.get("trangThaiBan").as(String.class), "TAM_NGUNG_PHUC_VU");
        }

        query = query.where(p1);
        Query q = session.createQuery(query);

        listBan = q.getResultList();

        session.close();

        return this.listBan;
    }

    public Ban updateBan(Ban ban) {
        Session session = HibernateUtils.getFactory().openSession();
        session.getTransaction().begin();

        session.update(ban);

        session.getTransaction().commit();
        session.close();

        return ban;
    }

    public List<Ban> getListBanTrong() {
        Session session = HibernateUtils.getFactory().openSession();
        session.getTransaction().begin();

        String sql = "SELECT ban FROM Ban ban WHERE ban.trangThaiBan = 'BAN_TRONG'";
        List<Ban> list = session.createQuery(sql, Ban.class).getResultList();

        session.getTransaction().commit();
        session.close();

        return list;
    }

    public List<Ban> getListBanBy(String maBan, TrangThaiBan trangThaiBan, LoaiBan loaiBan, KhuVuc khuVuc) {
        Session session = HibernateUtils.getFactory().openSession();
        session.getTransaction().begin();

        String hql = "SELECT b FROM Ban b WHERE " +
                "(:maBan IS NULL OR b.maBan LIKE :maBan) AND " +
                "(:trangThai IS NULL OR b.trangThaiBan = :trangThai) AND " +
                "(:loaiBan IS NULL OR b.loaiBan = :loaiBan) AND " +
                "(:khuVuc IS NULL OR b.khuVuc = :khuVuc)";
        List<Ban> list = session.createQuery(hql, Ban.class)
                .setParameter("maBan", maBan == null || maBan.isEmpty() ? null : "%" + maBan + "%")
                .setParameter("trangThai", trangThaiBan)
                .setParameter("loaiBan", loaiBan)
                .setParameter("khuVuc", khuVuc).getResultList();;

        session.getTransaction().commit();
        session.close();

        return list;
    }


    public Ban themBan(Ban ban) {
        Session session = HibernateUtils.getFactory().openSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            ban.setMaBan(generateMaBan(ban.getKhuVuc(), ban.getLoaiBan()));
            session.save(ban);
            transaction.commit();
            System.out.println("Thêm bàn mới thành công!");
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
            System.out.println("Thêm bàn thất bại.");
        } finally {
            session.close();
        }
        return ban;
    }


    public Ban capnhatBan(Ban ban) {
        Session session = HibernateUtils.getFactory().openSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();

            // Lấy đối tượng `Ban` từ cơ sở dữ liệu
            Ban currentBan = session.get(Ban.class, ban.getMaBan());
            if (currentBan != null) {
                // Cập nhật các thuộc tính
                currentBan.setTrangThaiBan(ban.getTrangThaiBan());
                currentBan.setKhuVuc(ban.getKhuVuc());
                currentBan.setLoaiBan(ban.getLoaiBan());

                session.update(currentBan); // Lưu thay đổi vào database
                transaction.commit();       // Commit để xác nhận cập nhật
                System.out.println("Cập nhật bàn thành công!");
            } else {
                System.out.println("Không tìm thấy bàn để cập nhật.");
            }
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback(); // Rollback trong trường hợp có lỗi
            }
            e.printStackTrace();
            System.out.println("Cập nhật bàn thất bại.");
        } finally {
            session.close();
        }
        return ban; // Trả về đối tượng đã cập nhật
    }

    public boolean deleteBan(String maBan) {
        Session session = HibernateUtils.getFactory().openSession();
        Transaction transaction = null;
        boolean isDeleted = false;

        try {
            transaction = session.beginTransaction();


            Ban ban = session.get(Ban.class, maBan);
            if (ban != null) {
                session.delete(ban);
                transaction.commit();
                System.out.println("Xóa bàn thành công!");
                isDeleted = true;
            } else {
                System.out.println("Không tìm thấy bàn để xóa.");
            }

        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
            System.out.println("Xóa bàn thất bại.");
        } finally {
            session.close();
        }
        return isDeleted;
    }

    private Long getMaxIdFromDatabaseForTable(String areaPrefix) {
        Session session = HibernateUtils.getFactory().openSession();
        Transaction transaction = null;
        Long maxId = null;

        try {
            transaction = session.beginTransaction();

            String query = "SELECT maBan FROM Ban WHERE maBan LIKE :prefix";
            List<String> maBans = session.createQuery(query)
                    .setParameter("prefix", areaPrefix + "%")
                    .getResultList();

            maxId = maBans.stream()
                    .map(ma -> Long.parseLong(ma.substring(areaPrefix.length())))
                    .max(Long::compare)
                    .orElse(0L);

            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        } finally {
            // Không cần phải đóng session ở đây, sẽ tự động quản lý
        }
        return maxId;
    }

    private String generateMaBan(KhuVuc khuVuc, LoaiBan loaiBan) {
        String areaPrefix = khuVuc.toString(); // Lấy khu vực
        String capacityCode;

        switch (loaiBan) {
            case BAN_2_NGUOI:
                capacityCode = "02";
                break;
            case BAN_5_NGUOI:
                capacityCode = "05";
                break;
            case BAN_10_NGUOI:
                capacityCode = "10";
                break;
            default:
                throw new IllegalArgumentException("Loại bàn không hợp lệ");
        }

        Long maxId = getMaxIdFromDatabaseForTable(areaPrefix + capacityCode);
        Long newIdNumber = (maxId == null) ? 1 : maxId + 1; // Tăng mã lên 1
        return areaPrefix + capacityCode + String.format("%03d", newIdNumber); // Định dạng mã
    }
}
