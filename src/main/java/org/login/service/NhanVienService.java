package org.login.service;

import org.login.entity.NhanVien;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface NhanVienService extends Remote {

    public List<NhanVien> getAllTaiKhoan() throws RemoteException;

    public NhanVien getNhanVien(String tenString) throws RemoteException;

    public NhanVien addNhanVien(NhanVien nhanVien) throws RemoteException;

    public NhanVien updateNhanVien(NhanVien nhanVien) throws RemoteException;

    public void updateNhanVien(String maNhanVienCu, NhanVien nhanVienMoi) throws RemoteException;

    public List<NhanVien> getNhanVienWithTaiKhoan() throws RemoteException;
}
