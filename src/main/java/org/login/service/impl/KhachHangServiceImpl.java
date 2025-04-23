package org.login.service.impl;

import org.login.dao.KhachHangDAO;
import org.login.entity.KhachHang;
import org.login.service.KhachHangService;

import java.util.List;

public class KhachHangServiceImpl implements KhachHangService {
    private final KhachHangDAO khachHangDAO = new KhachHangDAO();

    @Override
    public List<Object[]> layDSKhachHang() {
        return khachHangDAO.layDSKhachHang();
    }

    @Override
    public KhachHang themKhachHang(KhachHang khachHang) {
        return khachHangDAO.themKhachHang(khachHang);
    }

    @Override
    public KhachHang getKHBySDT(String sdt) {
        return khachHangDAO.getKHBySDT(sdt);
    }

    @Override
    public KhachHang getKHByCCCD(String cccd) {
        return khachHangDAO.getKHByCCCD(cccd);
    }

    @Override
    public boolean suaKhachHang(KhachHang khachHang) {
        return khachHangDAO.suaKhachHang(khachHang);
    }

    @Override
    public KhachHang timKhachHangTheoSDT(String sdt) {
        return khachHangDAO.timKhachHangTheoSDT(sdt);
    }
}
