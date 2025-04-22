package org.login.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table
public class BaoCao implements Serializable {

    @Id
    @Column(name = "ma_bao_cao")
    private String maBaoCao;

    @Column(name = "thoi_gian_vao_ca")
    private String thoiGianVaoCa;


    @Column(name = "thoi_gian_ket_ca")
    private String thoiGianKetCa;

    @Column(name = "tien_vao_ca")
    private double tienVaoCa;

    @Column(name = "tong_doanh_thu")
    private double tongDoanhThu;

    @Column(name = "tien_ban_giao")
    private double tienBanGiao;

    @OneToOne
    @JoinColumn(name = "ma_nhan_vien")
    private NhanVien nhanVien;
}
