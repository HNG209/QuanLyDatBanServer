package org.login.service.impl;

import org.login.dao.HoaDonDAO;
import org.login.entity.Ban;
import org.login.entity.HoaDon;
import org.login.service.HoaDonService;

import javax.swing.*;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.time.LocalDate;
import java.util.List;

public class HoaDonServiceImpl extends UnicastRemoteObject implements HoaDonService {
    private final HoaDonDAO hoaDonDAO = new HoaDonDAO();

    public HoaDonServiceImpl() throws RemoteException {
    }

    @Override
    public Object[] layDoanhThuVaSoHoaDon(String maNhanVien, LocalDate ngay) throws RemoteException {
        return hoaDonDAO.layDoanhThuVaSoHoaDon(maNhanVien, ngay);
    }

    @Override
    public List<Object[]> layDoanhThuVaSoHoaDonTheoThang(String maNhanVien, Integer nam) throws RemoteException {
        return hoaDonDAO.layDoanhThuVaSoHoaDonTheoThang(maNhanVien, nam);
    }

    @Override
    public List<Object[]> layDoanhThuVaSoHoaDonTheoQuy(String maNhanVien, int nam) throws RemoteException {
        return hoaDonDAO.layDoanhThuVaSoHoaDonTheoQuy(maNhanVien, nam);
    }

    @Override
    public List<Object[]> layDoanhThuVaSoHoaDonTheoNam(String maNhanVien) throws RemoteException {
        return hoaDonDAO.layDoanhThuVaSoHoaDonTheoNam(maNhanVien);
    }

    @Override
    public List<Object[]> layDoanhThuTheoLoaiMonAn(int nam, int quy, int thang) throws RemoteException {
        return hoaDonDAO.layDoanhThuTheoLoaiMonAn(nam, quy, thang);
    }

    @Override
    public List<Object[]> layDoanhThuLoaiMonAnTheoNgay(String maNV, LocalDate date) throws RemoteException {
        return hoaDonDAO.layDoanhThuLoaiMonAnTheoNgay(maNV, date);
    }

    @Override
    public List<Integer> layCacNamLapHoaDon(String maNV) throws RemoteException {
        return hoaDonDAO.layCacNamLapHoaDon(maNV);
    }

    @Override
    public List<Object[]> layTop10MonAnTheoDoanhThuVaSoLuongBan() throws RemoteException {
        return hoaDonDAO.layTop10MonAnTheoDoanhThuVaSoLuongBan();
    }

    @Override
    public List<HoaDon> getAllHoaDon() throws RemoteException {
        return hoaDonDAO.getAllHoaDon();
    }

    @Override
    public HoaDon lapHoaDon(HoaDon hoaDon) throws RemoteException {
        return hoaDonDAO.lapHoaDon(hoaDon);
    }

    @Override
    public HoaDon getHoaDon(String maHD) throws RemoteException {
        return hoaDonDAO.getHoaDon(maHD);
    }

    @Override
    public HoaDon updateHoaDon(HoaDon hoaDon) throws RemoteException {
        return hoaDonDAO.updateHoaDon(hoaDon);
    }

    @Override
    public List<HoaDon> getHoaDonFromBan(Ban ban) throws RemoteException {
        return hoaDonDAO.getHoaDonFromBan(ban);
    }

    @Override
    public List<Object[]> laySoHoaDonTheoTrangThaiHoaDon(String maNV, int nam, int quy, int thang) throws RemoteException {
        return hoaDonDAO.laySoHoaDonTheoTrangThaiHoaDon(maNV, nam, quy, thang);
    }

    @Override
    public List<Object[]> laySoHoaDonTheoTrangThaiVaNgay(String maNV, LocalDate ngay) throws RemoteException {
        return hoaDonDAO.laySoHoaDonTheoTrangThaiVaNgay(maNV, ngay);
    }

    @Override
    public void xoaHoaDon(HoaDon hoaDon) throws RemoteException {
        hoaDonDAO.xoaHoaDon(hoaDon);
    }

    @Override
    public double tinhTongTien(HoaDon hoaDon) {
        return hoaDonDAO.tinhTongTien(hoaDon);
    }
}
