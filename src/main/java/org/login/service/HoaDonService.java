package org.login.service;

import org.login.entity.Ban;
import org.login.entity.HoaDon;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.time.LocalDate;
import java.util.List;

public interface HoaDonService extends Remote {
    public Object[] layDoanhThuVaSoHoaDon(String maNhanVien, LocalDate ngay) throws RemoteException;

    public List<Object[]> layDoanhThuVaSoHoaDonTheoThang(String maNhanVien, Integer nam) throws RemoteException;

    public List<Object[]> layDoanhThuVaSoHoaDonTheoQuy(String maNhanVien, int nam) throws RemoteException;

    public List<Object[]> layDoanhThuVaSoHoaDonTheoNam(String maNhanVien) throws RemoteException;

    public List<Object[]> layDoanhThuTheoLoaiMonAn(int nam, int quy, int thang) throws RemoteException;

    public List<Object[]> layDoanhThuLoaiMonAnTheoNgay(String maNV, LocalDate date) throws RemoteException;

    public List<Integer> layCacNamLapHoaDon(String maNV) throws RemoteException;

    public List<Object[]> layTop10MonAnTheoDoanhThuVaSoLuongBan() throws RemoteException;

    public List<HoaDon> getAllHoaDon() throws RemoteException;

    public HoaDon lapHoaDon(HoaDon hoaDon) throws RemoteException;

    public HoaDon getHoaDon(String maHD) throws RemoteException;

    public HoaDon updateHoaDon(HoaDon hoaDon) throws RemoteException;

    public List<HoaDon> getHoaDonFromBan(Ban ban) throws RemoteException;

    public List<Object[]> laySoHoaDonTheoTrangThaiHoaDon(String maNV, int nam, int quy, int thang) throws RemoteException;

    public List<Object[]> laySoHoaDonTheoTrangThaiVaNgay(String maNV, LocalDate ngay) throws RemoteException;

    public void xoaHoaDon(HoaDon hoaDon) throws RemoteException;
}
