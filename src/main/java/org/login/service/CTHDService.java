package org.login.service;

import org.login.entity.ChiTietHoaDon;
import org.login.entity.HoaDon;
import org.login.entity.keygenerator.CTHDCompositeKey;

import java.util.List;

public interface CTHDService {
    public List<ChiTietHoaDon> getAll();
    public ChiTietHoaDon luuCTHD(ChiTietHoaDon chiTietHoaDon);
    public List<ChiTietHoaDon> fetchChiTietHoaDonNative(String maHoaDon);
    public void deleteChiTietHoaDon(String maHoaDon, String maMonAn);
    public void capNhatSoLuong(CTHDCompositeKey key, int soLuong);
    public ChiTietHoaDon capNhatCTHD(ChiTietHoaDon chiTietHoaDon);
    public ChiTietHoaDon getCTHD(CTHDCompositeKey key);
    public List<ChiTietHoaDon> getCTHDfromHD(HoaDon hoaDon);
    public List<ChiTietHoaDon> getChiTietHoaDonByMaHoaDon(String maHoaDon);
}
