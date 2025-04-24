package org.login.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.login.entity.keygenerator.CTHDCompositeKey;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table
public class ChiTietHoaDon implements Serializable {

    @EmbeddedId
    private CTHDCompositeKey maChiTietHoaDon;

    @Column(nullable = false, name = "so_luong")
    private int soLuong = 0;

    @Column(name = "ghi_chu")
    private String ghiChu;

    @ManyToOne
    //@OneToOne
    @MapsId("maMonAn")
    @JoinColumn(name = "ma_mon_an", referencedColumnName = "ma_mon_an")
    private MonAn monAn;

    @ManyToOne
    @MapsId("maHoaDon")
    @JoinColumn(name = "ma_hoa_don", referencedColumnName = "ma_hoa_don", nullable = false)
    private HoaDon hoaDon;

    public double tinhTongCTHD() {
        return monAn.getDonGia() * soLuong;
    }
}
