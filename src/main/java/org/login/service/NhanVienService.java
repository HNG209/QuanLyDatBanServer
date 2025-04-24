package org.login.service;

import org.login.entity.NhanVien;

import java.util.List;

public interface NhanVienService {

    public List<NhanVien> getAllTaiKhoan();
    public NhanVien getNhanVien(String tenString);
    public NhanVien addNhanVien(NhanVien nhanVien);
    public NhanVien updateNhanVien(NhanVien nhanVien);
    public void updateNhanVien(String maNhanVienCu, NhanVien nhanVienMoi);
    public List<NhanVien> getNhanVienWithTaiKhoan();

}
