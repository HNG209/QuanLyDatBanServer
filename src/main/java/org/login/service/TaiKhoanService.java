package org.login.service;

import org.login.entity.TaiKhoan;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface TaiKhoanService extends Remote {
    public TaiKhoan getTaiKhoan(String username) throws RemoteException;

    public TaiKhoan getTaiKhoanNhanVien(String maNhanVien) throws RemoteException;

    public TaiKhoan addNhanVien(TaiKhoan taiKhoan) throws RemoteException;

    public TaiKhoan updateTaiKhoan(TaiKhoan taiKhoan) throws RemoteException;
}
