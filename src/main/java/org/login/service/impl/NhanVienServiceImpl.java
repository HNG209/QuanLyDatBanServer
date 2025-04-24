package org.login.service.impl;

import org.login.dao.NhanVienDAO;
import org.login.entity.NhanVien;
import org.login.service.NhanVienService;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

public class NhanVienServiceImpl extends UnicastRemoteObject implements NhanVienService {
    private final NhanVienDAO nhanVienDAO = new NhanVienDAO();

    public NhanVienServiceImpl() throws RemoteException {
    }

    @Override
    public List<NhanVien> getAllTaiKhoan() throws RemoteException {
        return nhanVienDAO.getAllTaiKhoan();
    }

    @Override
    public NhanVien getNhanVien(String tenString) throws RemoteException {
        return nhanVienDAO.getNhanVien(tenString);
    }

    @Override
    public NhanVien addNhanVien(NhanVien nhanVien) throws RemoteException {
        return nhanVienDAO.addNhanVien(nhanVien);
    }

    @Override
    public NhanVien updateNhanVien(NhanVien nhanVien) throws RemoteException {
        return nhanVienDAO.updateNhanVien(nhanVien);
    }

    @Override
    public void updateNhanVien(String maNhanVienCu, NhanVien nhanVienMoi) throws RemoteException {
        nhanVienDAO.updateNhanVien(maNhanVienCu, nhanVienMoi);
    }

    @Override
    public List<NhanVien> getNhanVienWithTaiKhoan() throws RemoteException {
        return nhanVienDAO.getNhanVienWithTaiKhoan();
    }
}
