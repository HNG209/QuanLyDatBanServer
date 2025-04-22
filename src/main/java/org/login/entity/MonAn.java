package org.login.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.login.entity.enums.TrangThaiMonAn;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table
public class MonAn implements Serializable {

    @Id
    @Column(name = "ma_mon_an")
    private String maMonAn;

    @ManyToOne
    @JoinColumn(name = "ma_loai_mon_an")
    private LoaiMonAn loaiMonAn;

    @Column(name = "ten_mon_an")
    private String tenMonAn;

    @Column(name = "don_gia")
    private double donGia;

    @Column(name = "don_vi_tinh")
    private String donViTinh;

    @Column(name = "hinh_anh")
    private String hinhAnh;

    @Column(name = "trang_thai_mon_an")
    @Enumerated(EnumType.STRING)
    private TrangThaiMonAn trangThaiMonAn;

    @Column(name = "mo_ta_mon_an")
    private String moTaMonAn;
}


