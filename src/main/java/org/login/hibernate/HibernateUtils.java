package org.login.hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;
import org.login.entity.*;
import org.login.entity.keygenerator.DailyCounter;
import org.login.entity.keygenerator.DailyCustomerCounter;

import java.util.Properties;

public class HibernateUtils {
    private static final SessionFactory FACTORY;

    static {
        Configuration configuration = new Configuration();

        Properties properties = new Properties();
        properties.put(Environment.DIALECT, "org.hibernate.dialect.MySQL8Dialect");
        properties.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
        properties.put(Environment.URL, "jdbc:mysql://localhost/tobo1?createDatabaseIfNotExist=true");
        properties.put(Environment.USER, System.getenv("MYSQL_USER"));
        properties.put(Environment.PASS, System.getenv("MYSQL_PASSWORD"));
        properties.put(Environment.HBM2DDL_AUTO, "update");
        properties.put(Environment.SHOW_SQL, "true");

        configuration.setProperties(properties);
        configuration.addAnnotatedClass(NhanVien.class);
        configuration.addAnnotatedClass(TaiKhoan.class);
        configuration.addAnnotatedClass(LoaiMonAn.class);
        configuration.addAnnotatedClass(Ban.class);
        configuration.addAnnotatedClass(MonAn.class);
        configuration.addAnnotatedClass(KhachHang.class);
        configuration.addAnnotatedClass(BaoCao.class);
        configuration.addAnnotatedClass(HoaDon.class);
        configuration.addAnnotatedClass(ChiTietHoaDon.class);
        configuration.addAnnotatedClass(LichDat.class);
        configuration.addAnnotatedClass(DailyCounter.class);
        configuration.addAnnotatedClass(DailyCustomerCounter.class);
        ServiceRegistry registry = new StandardServiceRegistryBuilder()
                .applySettings(configuration.getProperties())   
                .build();

        FACTORY = configuration.buildSessionFactory(registry);
    }


    // phan them vao
//    public static SessionFactory getSessionFactory() {
//        return sessionFactory;
//    }
//    private static final SessionFactory sessionFactory = buildSessionFactory();
//
//    private static SessionFactory buildSessionFactory() {
//        try {
//            // Tạo SessionFactory từ file cấu hình hibernate.cfg.xml
//            return new Configuration().configure().buildSessionFactory();
//        } catch (Throwable ex) {
//            throw new ExceptionInInitializerError(ex);
//        }
//    }
    //------------------------------------------------
    public static SessionFactory getFactory(){
        return FACTORY;
    }
}
