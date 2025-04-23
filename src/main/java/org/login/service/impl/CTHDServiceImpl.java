package org.login.service.impl;

import org.login.dao.ChiTietHoaDonDAO;
import org.login.entity.ChiTietHoaDon;
import org.login.entity.HoaDon;
import org.login.entity.keygenerator.CTHDCompositeKey;
import org.login.service.CTHDService;

import java.util.List;

public class CTHDServiceImpl implements CTHDService {
    private final ChiTietHoaDonDAO chiTietHoaDonDAO = new ChiTietHoaDonDAO();

    @Override
    public ChiTietHoaDon luuCTHD(ChiTietHoaDon chiTietHoaDon) {
        return chiTietHoaDonDAO.luuCTHD(chiTietHoaDon);
    }

    @Override
    public List<ChiTietHoaDon> fetchChiTietHoaDonNative(String maHoaDon) {
        return chiTietHoaDonDAO.fetchChiTietHoaDonNative(maHoaDon);
    }

    @Override
    public void deleteChiTietHoaDon(String maHoaDon, String maMonAn) {
        chiTietHoaDonDAO.deleteChiTietHoaDon(maHoaDon, maMonAn);
    }

    @Override
    public void capNhatSoLuong(CTHDCompositeKey key, int soLuong) {
        chiTietHoaDonDAO.capNhatSoLuong(key, soLuong);
    }

    @Override
    public ChiTietHoaDon capNhatCTHD(ChiTietHoaDon chiTietHoaDon) {
        return chiTietHoaDonDAO.capNhatCTHD(chiTietHoaDon);
    }

    @Override
    public ChiTietHoaDon getCTHD(CTHDCompositeKey key) {
        return chiTietHoaDonDAO.getCTHD(key);
    }

    @Override
    public List<ChiTietHoaDon> getCTHDfromHD(HoaDon hoaDon) {
        return chiTietHoaDonDAO.getCTHDfromHD(hoaDon);
    }

    @Override
    public List<ChiTietHoaDon> getChiTietHoaDonByMaHoaDon(String maHoaDon) {
        return chiTietHoaDonDAO.getChiTietHoaDonByMaHoaDon(maHoaDon);
    }
}
