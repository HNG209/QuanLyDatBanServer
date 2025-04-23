package org.login.service;

import org.login.entity.Ban;
import org.login.entity.HoaDon;

import java.time.LocalDate;
import java.util.List;

public interface HoaDonService {
    public Object[] layDoanhThuVaSoHoaDon(String maNhanVien, LocalDate ngay);
    public List<Object[]> layDoanhThuVaSoHoaDonTheoThang(String maNhanVien, Integer nam);
    public List<Object[]> layDoanhThuVaSoHoaDonTheoQuy(String maNhanVien, int nam);
    public List<Object[]> layDoanhThuVaSoHoaDonTheoNam(String maNhanVien);
    public List<Object[]> layDoanhThuTheoLoaiMonAn(int nam, int quy, int thang);
    public List<Object[]> layDoanhThuLoaiMonAnTheoNgay(String maNV, LocalDate date);
    public List<Integer> layCacNamLapHoaDon(String maNV);
    public List<Object[]> layTop10MonAnTheoDoanhThuVaSoLuongBan();
    public List<HoaDon> getAllHoaDon();
    public HoaDon lapHoaDon(HoaDon hoaDon);
    public HoaDon getHoaDon(String maHD);
    public HoaDon updateHoaDon(HoaDon hoaDon);
    public List<HoaDon> getHoaDonFromBan(Ban ban);
    public List<Object[]> laySoHoaDonTheoTrangThaiHoaDon(String maNV, int nam, int quy, int thang);
    public List<Object[]> laySoHoaDonTheoTrangThaiVaNgay(String maNV, LocalDate ngay);
    public void xoaHoaDon(HoaDon hoaDon);

}
