package org.login.service.impl;

import org.login.dao.NhanVienDAO;
import org.login.entity.NhanVien;
import org.login.service.NhanVienService;

import java.util.List;

public class NhanVienServiceImpl implements NhanVienService {
    private final NhanVienDAO nhanVienDAO = new NhanVienDAO();
    @Override
    public List<NhanVien> getAllTaiKhoan() {
        return nhanVienDAO.getAllTaiKhoan();
    }

    @Override
    public NhanVien getNhanVien(String tenString) {
        return nhanVienDAO.getNhanVien(tenString);
    }

    @Override
    public void addNhanVien(NhanVien nhanVien) {
        nhanVienDAO.addNhanVien(nhanVien);
    }

    @Override
    public void updateNhanVien(NhanVien nhanVien) {
        nhanVienDAO.updateNhanVien(nhanVien);
    }

    @Override
    public void updateNhanVien(String maNhanVienCu, NhanVien nhanVienMoi) {
        nhanVienDAO.updateNhanVien(maNhanVienCu, nhanVienMoi);
    }

    @Override
    public List<NhanVien> getNhanVienWithTaiKhoan() {
        return nhanVienDAO.getNhanVienWithTaiKhoan();
    }
}
