package org.login.service;

import org.login.entity.KhachHang;

import java.util.List;

public interface KhachHangService {
    public List<Object[]> layDSKhachHang();
    public KhachHang themKhachHang(KhachHang khachHang);
    public KhachHang getKHBySDT(String sdt);
    public KhachHang getKHByCCCD(String cccd);
    public boolean suaKhachHang(KhachHang khachHang);
    public KhachHang timKhachHangTheoSDT(String sdt);
}
