package org.login.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.login.entity.ChiTietHoaDon;
import org.login.entity.HoaDon;
import org.login.entity.keygenerator.CTHDCompositeKey;
import org.login.hibernate.HibernateUtils;

import javax.persistence.criteria.*;
import java.util.ArrayList;
import java.util.List;

public class ChiTietHoaDonDAO {
    public ChiTietHoaDon luuCTHD(ChiTietHoaDon chiTietHoaDon) {
        Session session = HibernateUtils.getFactory().openSession();
        session.getTransaction().begin();

        session.save(chiTietHoaDon);

        session.getTransaction().commit();
        session.close();
        return chiTietHoaDon;
    }

    public List<ChiTietHoaDon> fetchChiTietHoaDonNative(String maHoaDon) {
        Session session = HibernateUtils.getFactory().openSession();
        session.getTransaction().begin();
        String hql = "SELECT cthd FROM ChiTietHoaDon cthd WHERE cthd.hoaDon.maHoaDon = :maHoaDon";
        List<ChiTietHoaDon> chiTietHoaDonList = session.createQuery(hql, ChiTietHoaDon.class)
                .setParameter("maHoaDon", maHoaDon)
                .getResultList();
        session.getTransaction().commit();
        session.close();
        return chiTietHoaDonList;
    }

    public void deleteChiTietHoaDon(String maHoaDon, String maMonAn) {
        Session session = HibernateUtils.getFactory().openSession();
        try {
            session.getTransaction().begin();


            String hql = "DELETE FROM ChiTietHoaDon cthd WHERE cthd.hoaDon.maHoaDon = :maHoaDon AND cthd.monAn.maMonAn = :maMonAn";
            session.createQuery(hql)
                    .setParameter("maHoaDon", maHoaDon)
                    .setParameter("maMonAn", maMonAn)
                    .executeUpdate();

            session.getTransaction().commit();
        } catch (Exception e) {
            if (session.getTransaction() != null) {
                session.getTransaction().rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
    }



    public void capNhatSoLuong(CTHDCompositeKey key, int soLuong) {
        Session session = HibernateUtils.getFactory().openSession();
        session.clear();
        Transaction transaction = session.getTransaction();
        try {
            transaction.begin();

            ChiTietHoaDon chiTietHoaDon = session.get(ChiTietHoaDon.class, key);

            System.out.println(chiTietHoaDon);
            if(chiTietHoaDon != null) {
                chiTietHoaDon.setSoLuong(soLuong);
//                session.update(chiTietHoaDon);
            }

            session.getTransaction().commit();

        } catch (Exception e) {
            if (transaction.isActive()) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    public ChiTietHoaDon capNhatCTHD(ChiTietHoaDon chiTietHoaDon) {
        Session session = HibernateUtils.getFactory().openSession();
        session.getTransaction().begin();

        session.update(chiTietHoaDon);

        session.getTransaction().commit();
        session.close();
        return chiTietHoaDon;
    }

    public ChiTietHoaDon getCTHD(CTHDCompositeKey key) {
        Session session = HibernateUtils.getFactory().openSession();
        session.getTransaction().begin();

        ChiTietHoaDon chiTietHoaDon = session.get(ChiTietHoaDon.class, key);

        session.getTransaction().commit();
        session.close();
        return chiTietHoaDon;
    }

    public List<ChiTietHoaDon> getCTHDfromHD(HoaDon hoaDon) {
        List<ChiTietHoaDon> list = new ArrayList<>();

        Session session = HibernateUtils.getFactory().openSession();
        session.getTransaction().begin();

        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<ChiTietHoaDon> query = builder.createQuery(ChiTietHoaDon.class);
        Root<ChiTietHoaDon> chiTietHoaDonRoot = query.from(ChiTietHoaDon.class);

        Join<ChiTietHoaDon, HoaDon> joinHD = chiTietHoaDonRoot.join("hoaDon");

        Predicate predicate = builder.equal(joinHD.get("maHoaDon"), hoaDon.getMaHoaDon());

        query.select(chiTietHoaDonRoot).where(predicate);

        list = session.createQuery(query).getResultList();

        session.getTransaction().commit();
        session.close();

        return list;
    }
    public List<ChiTietHoaDon> getChiTietHoaDonByMaHoaDon(String maHoaDon) {
        List<ChiTietHoaDon> chiTietList = null;


        try (Session session = HibernateUtils.getFactory().openSession()) {


            String hql = "FROM ChiTietHoaDon WHERE hoaDon.maHoaDon = :maHoaDon";
            Query<ChiTietHoaDon> query = session.createQuery(hql, ChiTietHoaDon.class);
            query.setParameter("maHoaDon", maHoaDon);

            chiTietList = query.list();


        } catch (Exception e) {

            e.printStackTrace();
        }

        return chiTietList;
    }
}
