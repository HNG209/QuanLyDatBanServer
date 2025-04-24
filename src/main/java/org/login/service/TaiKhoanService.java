package org.login.service;

import org.login.entity.TaiKhoan;

public interface TaiKhoanService {
    public TaiKhoan getTaiKhoan(String username);
    public TaiKhoan getTaiKhoanNhanVien(String maNhanVien);
    public void addNhanVien(TaiKhoan taiKhoan);
    public TaiKhoan updateTaiKhoan(TaiKhoan taiKhoan);
}
