package org.login.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table
public class LichDat implements Serializable {
    @Id
    @Column(name = "ma_lich_dat")
    private String maLichDat;

    @Column(nullable = false, name = "thoi_gian_dat")
    private LocalDateTime thoiGianDat;

    @Column(nullable = false, name = "thoi_gian_nhan_ban")
    private LocalDateTime thoiGianNhanBan;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "ma_khach_hang")
    private KhachHang khachHang;

    @ManyToOne
    @JoinColumn(name = "ma_nhan_vien")
    private NhanVien nhanVien;

    @Column(nullable = false, name = "so_luong_nguoi")
    private int soLuongNguoi;

    @OneToOne
    @JoinColumn(name = "ma_hoa_don")
    private HoaDon hoaDon;

    @Column(name = "tien_coc")
    private double tienCoc;

    @Column(name = "ghi_chu")
    private String ghiChu;
}
