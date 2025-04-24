package org.login.service.impl;

import org.login.dao.TaiKhoanDAO;
import org.login.entity.TaiKhoan;
import org.login.service.TaiKhoanService;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class TaiKhoanServiceImpl extends UnicastRemoteObject implements TaiKhoanService {
    private final TaiKhoanDAO taiKhoanDAO = new TaiKhoanDAO();

    public TaiKhoanServiceImpl() throws RemoteException {
    }

    @Override
    public TaiKhoan getTaiKhoan(String username) throws RemoteException {
        return taiKhoanDAO.getTaiKhoan(username);
    }

    @Override
    public TaiKhoan getTaiKhoanNhanVien(String maNhanVien) throws RemoteException {
        return taiKhoanDAO.getTaiKhoan(maNhanVien);
    }

    @Override
    public TaiKhoan addNhanVien(TaiKhoan taiKhoan) throws RemoteException {
        return taiKhoanDAO.addNhanVien(taiKhoan);
    }

    @Override
    public TaiKhoan updateTaiKhoan(TaiKhoan taiKhoan) throws RemoteException {
        return taiKhoanDAO.updateTaiKhoan(taiKhoan);
    }
}
