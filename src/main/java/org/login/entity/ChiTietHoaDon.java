package org.login.entity;


import org.login.entity.keygenerator.CTHDCompositeKey;

import javax.persistence.*;
import java.io.Serializable;

@Entity
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

    public CTHDCompositeKey getMaChiTietHoaDon() {
        return maChiTietHoaDon;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public MonAn getMonAn() {
        return monAn;
    }

    public HoaDon getHoaDon() {
        return hoaDon;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public void setMaChiTietHoaDon(CTHDCompositeKey maChiTietHoaDon) {
        this.maChiTietHoaDon = maChiTietHoaDon;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public void setMonAn(MonAn monAn) {
        this.monAn = monAn;
    }

    public void setHoaDon(HoaDon hoaDon) {
        this.hoaDon = hoaDon;
    }

    public double tinhTongCTHD() {
        return monAn.getDonGia() * soLuong;
    }

    @PrePersist
    @PreUpdate
    private void generateCompositeKey() {
        if (monAn != null && hoaDon != null && this.maChiTietHoaDon == null) {
            this.maChiTietHoaDon = new CTHDCompositeKey(hoaDon.getMaHoaDon(), monAn.getMaMonAn());

        }
    }

    @Override
    public String toString() {
        return "ChiTietHoaDon{" +
                "maChiTietHoaDon=" + maChiTietHoaDon +
                ", soLuong=" + soLuong +
                ", monAn=" + monAn +
                ", hoaDon=" + hoaDon +
                '}';
    }
}
