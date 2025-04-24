package org.login.service.impl;

import org.login.dao.TaiKhoanDAO;
import org.login.entity.TaiKhoan;
import org.login.service.TaiKhoanService;

public class TaiKhoanServiceImpl implements TaiKhoanService {
    private final TaiKhoanDAO taiKhoanDAO = new TaiKhoanDAO();

    @Override
    public TaiKhoan getTaiKhoan(String username) {
        return taiKhoanDAO.getTaiKhoan(username);
    }

    @Override
    public TaiKhoan getTaiKhoanNhanVien(String maNhanVien) {
        return taiKhoanDAO.getTaiKhoan(maNhanVien);
    }

    @Override
    public void addNhanVien(TaiKhoan taiKhoan) {
        taiKhoanDAO.addNhanVien(taiKhoan);
    }

    @Override
    public TaiKhoan updateTaiKhoan(TaiKhoan taiKhoan) {
        return taiKhoanDAO.updateTaiKhoan(taiKhoan);
    }
}
