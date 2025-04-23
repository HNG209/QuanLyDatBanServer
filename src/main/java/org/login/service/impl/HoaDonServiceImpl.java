package org.login.service.impl;

import org.login.dao.HoaDonDAO;
import org.login.entity.Ban;
import org.login.entity.HoaDon;
import org.login.service.HoaDonService;

import javax.swing.*;
import java.time.LocalDate;
import java.util.List;

public class HoaDonServiceImpl implements HoaDonService {
    private final HoaDonDAO hoaDonDAO = new HoaDonDAO();

    @Override
    public Object[] layDoanhThuVaSoHoaDon(String maNhanVien, LocalDate ngay) {
        return hoaDonDAO.layDoanhThuVaSoHoaDon(maNhanVien, ngay);
    }

    @Override
    public List<Object[]> layDoanhThuVaSoHoaDonTheoThang(String maNhanVien, Integer nam) {
        return hoaDonDAO.layDoanhThuVaSoHoaDonTheoThang(maNhanVien, nam);
    }

    @Override
    public List<Object[]> layDoanhThuVaSoHoaDonTheoQuy(String maNhanVien, int nam) {
        return hoaDonDAO.layDoanhThuVaSoHoaDonTheoQuy(maNhanVien, nam);
    }

    @Override
    public List<Object[]> layDoanhThuVaSoHoaDonTheoNam(String maNhanVien) {
        return hoaDonDAO.layDoanhThuVaSoHoaDonTheoNam(maNhanVien);
    }

    @Override
    public List<Object[]> layDoanhThuTheoLoaiMonAn(int nam, int quy, int thang) {
        return hoaDonDAO.layDoanhThuTheoLoaiMonAn(nam, quy, thang);
    }

    @Override
    public List<Object[]> layDoanhThuLoaiMonAnTheoNgay(String maNV, LocalDate date) {
        return hoaDonDAO.layDoanhThuLoaiMonAnTheoNgay(maNV, date);
    }

    @Override
    public List<Integer> layCacNamLapHoaDon(String maNV) {
        return hoaDonDAO.layCacNamLapHoaDon(maNV);
    }

    @Override
    public List<Object[]> layTop10MonAnTheoDoanhThuVaSoLuongBan() {
        return hoaDonDAO.layTop10MonAnTheoDoanhThuVaSoLuongBan();
    }

    @Override
    public List<HoaDon> getAllHoaDon() {
        return hoaDonDAO.getAllHoaDon();
    }

    @Override
    public HoaDon lapHoaDon(HoaDon hoaDon) {
        return hoaDonDAO.lapHoaDon(hoaDon);
    }

    @Override
    public HoaDon getHoaDon(String maHD) {
        return hoaDonDAO.getHoaDon(maHD);
    }

    @Override
    public HoaDon updateHoaDon(HoaDon hoaDon) {
        return hoaDonDAO.updateHoaDon(hoaDon);
    }

    @Override
    public List<HoaDon> getHoaDonFromBan(Ban ban) {
        return hoaDonDAO.getHoaDonFromBan(ban);
    }

    @Override
    public List<Object[]> laySoHoaDonTheoTrangThaiHoaDon(String maNV, int nam, int quy, int thang) {
        return hoaDonDAO.laySoHoaDonTheoTrangThaiHoaDon(maNV, nam, quy, thang);
    }

    @Override
    public List<Object[]> laySoHoaDonTheoTrangThaiVaNgay(String maNV, LocalDate ngay) {
        return hoaDonDAO.laySoHoaDonTheoTrangThaiVaNgay(maNV, ngay);
    }

    @Override
    public void xoaHoaDon(HoaDon hoaDon) {
        hoaDonDAO.xoaHoaDon(hoaDon);
    }
}
