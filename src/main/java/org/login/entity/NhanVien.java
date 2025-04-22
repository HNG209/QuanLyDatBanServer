package org.login.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.login.entity.enums.ChucVu;
import org.login.entity.enums.TrangThaiNhanVien;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.Period;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table
public class NhanVien implements Serializable {
    @Id
    @Column(name = "ma_nhan_vien")
    private String maNhanVien;

    @OneToOne(mappedBy = "nhanVien", fetch = FetchType.EAGER)
    private TaiKhoan taiKhoan; // Mối quan hệ với TaiKhoan

    @Column(nullable = false, name = "ten_nhan_vien")
    private String tenNhanVien;

    @Column(nullable = false)
    private String sdt;

    @Column(nullable = false)
    private String cccd;

    @Column(nullable = false, name = "dia_chi")
    private String diaChi;

    @Column(nullable = false, name = "gioi_tinh")
    private Boolean gioiTinh;

    @Column(nullable = false, name = "ngay_sinh")
    private LocalDate ngaySinh;

    @Column(name = "hinh_anh")
    private String hinhAnh;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, name = "trang_thai_nhan_vien")
    private TrangThaiNhanVien trangThaiNhanVien;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, name = "chuc_vu")
    private ChucVu chucVuNhanVien;
}
