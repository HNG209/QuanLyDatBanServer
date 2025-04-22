package org.login.dao;

import org.hibernate.Session;
import org.login.entity.BaoCao;
import org.login.entity.NhanVien;
import org.login.hibernate.HibernateUtils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class BaoCaoDAO {
    public boolean themBaoCao(BaoCao baoCao) {
        Session session = HibernateUtils.getFactory().openSession();
        session.getTransaction().begin();
        baoCao.setMaBaoCao(generateCustomId(baoCao.getNhanVien()));
        session.persist(baoCao);
        session.getTransaction().commit();
        session.close();
        return true;
    }

    private String generateCustomId(NhanVien nhanVien) {
        // Define your starting prefix (e.g., "ID-")
        String prefix = "BC" + nhanVien.getMaNhanVien();

        // Get the current date-time series
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
        String dateTimeSeries = LocalDateTime.now().format(formatter);

        // Combine prefix and date-time series
        return prefix + dateTimeSeries;
    }
}
