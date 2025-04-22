package org.login.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table
public class KhachHang implements Serializable {

    @Id
    @Column(name = "ma_khach_hang")
    private String maKhachHang;

    @Column(nullable = false, name = "ten_khach_hang")
    private String tenKhachHang;

    @Column
    private String cccd;

    private String sdt;

    @Column(name = "dia_chi")
    private String diaChi;

    private String email;

    @Column(name = "diem_tich_luy")
    private int diemTichLuy = 0;
}
