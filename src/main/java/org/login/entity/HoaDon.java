package org.login.entity;

import lombok.*;
import org.login.dao.ChiTietHoaDonDAO;
import org.login.dao.HoaDonDAO;
import org.login.dao.KhachHangDAO;
import org.login.entity.enums.TrangThaiHoaDon;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table
public class HoaDon implements Serializable {
    @Getter
    @Id
    @Column(name = "ma_hoa_don")
    private String maHoaDon;

    @Setter
    @Getter
    @Column(nullable = false, name = "ngay_lap")
    private LocalDate ngayLap;

    @Getter
    @Setter
    @ManyToOne
    @JoinColumn(name = "ma_ban")
    private Ban ban;

    @OneToMany(mappedBy = "hoaDon", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<ChiTietHoaDon> chiTietHoaDon;

    @Setter
    @ManyToOne
    @JoinColumn(name = "ma_khach_hang")
    private KhachHang khachHang;

    @Setter
    @ManyToOne
    @JoinColumn(name = "ma_nhan_vien")
    private NhanVien nhanVien;

    @Setter
    @Enumerated(EnumType.STRING)
    @Column(name = "trang_thai_hoa_don")
    private TrangThaiHoaDon trangThaiHoaDon = TrangThaiHoaDon.CHUA_THANH_TOAN;

    @Setter
    @Column(name = "phu_thu")
    private double phuThu;

    @Column(name = "tong_tien")
    private double tongTien;

    @Column(name = "chiet_khau")
    private double chietKhau;

    @Transient
    private final HoaDonDAO hoaDonDAO = new HoaDonDAO();

    @PrePersist
    @PreUpdate
    public void trigger() {
        if(trangThaiHoaDon == TrangThaiHoaDon.DA_THANH_TOAN){
            tongTien = hoaDonDAO.tinhTongTien(this) + phuThu - chietKhau;
            if(khachHang != null){
                khachHang.setDiemTichLuy(khachHang.getDiemTichLuy() + (int)(tongTien * 1 / 1000.0));

                KhachHangDAO khachHangDAO = new KhachHangDAO();
                khachHangDAO.suaKhachHang(khachHang);
            }
        }
    }

//    public double tinhTongTien() {
////        chiTietHoaDonDAO = new ChiTietHoaDonDAO();
////        tongTien = chiTietHoaDonDAO.fetchChiTietHoaDonNative(maHoaDon).stream().mapToDouble(ChiTietHoaDon::tinhTongCTHD).sum();
////        return tongTien;
//        return 0;
//    }
}
