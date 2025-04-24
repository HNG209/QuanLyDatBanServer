package org.login.service;

import org.login.entity.NhanVien;

import java.util.List;

public interface NhanVienService {

    public List<NhanVien> getAllTaiKhoan();
    public NhanVien getNhanVien(String tenString);
    public void addNhanVien(NhanVien nhanVien);
    public void updateNhanVien(NhanVien nhanVien);
    public void updateNhanVien(String maNhanVienCu, NhanVien nhanVienMoi);
    public List<NhanVien> getNhanVienWithTaiKhoan();

}
