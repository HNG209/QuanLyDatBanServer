package org.login.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.login.entity.NhanVien;
import org.login.entity.TaiKhoan;
import org.login.hibernate.HibernateUtils;

public class TaiKhoanDAO {

    public TaiKhoan getTaiKhoan(String username){
        Session session = HibernateUtils.getFactory().openSession();
        session.getTransaction().begin();

        TaiKhoan taiKhoan = session.find(TaiKhoan.class, username);

        session.getTransaction().commit();
        session.close();
        return taiKhoan;
    }

    public TaiKhoan getTaiKhoanNhanVien(String maNhanVien) {
        Session session = HibernateUtils.getFactory().openSession();
        Transaction transaction = null;
        TaiKhoan taiKhoan = null;

        try {
            transaction = session.beginTransaction();

            // Lấy NhanVien theo maNhanVien
            NhanVien nhanVien = session.get(NhanVien.class, maNhanVien);
            if (nhanVien != null) {
                // Lấy TaiKhoan liên quan đến NhanVien
                taiKhoan = nhanVien.getTaiKhoan();
            }

            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            e.printStackTrace(); // Xử lý lỗi ở đây
        } finally {
            session.close();
        }

        return taiKhoan;
    }

    public TaiKhoan addNhanVien(TaiKhoan taiKhoan) {
        Session session = HibernateUtils.getFactory().openSession();
        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();
            session.save(taiKhoan);
            transaction.commit();
            return taiKhoan;
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
            return null;
        } finally {
            session.close();
        }

    }

    public TaiKhoan updateTaiKhoan(TaiKhoan taiKhoan) {
        Session session = HibernateUtils.getFactory().openSession();
        session.getTransaction().begin();
        String hql = "UPDATE TaiKhoan tk SET tk.password = :matKhau WHERE tk.userName = :tenDN";

        session.createQuery(hql)
                .setParameter("matKhau", taiKhoan.getPassword())
                .setParameter("tenDN", taiKhoan.getUserName())
                        .executeUpdate();

        session.getTransaction().commit();
        session.close();

        return taiKhoan;
    }
}
