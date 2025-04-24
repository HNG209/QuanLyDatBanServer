package org.login.service;

import org.login.entity.KhachHang;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface KhachHangService extends Remote {
    public List<Object[]> layDSKhachHang() throws RemoteException;

    public KhachHang themKhachHang(KhachHang khachHang) throws RemoteException;

    public KhachHang getKHBySDT(String sdt) throws RemoteException;

    public KhachHang getKHByCCCD(String cccd) throws RemoteException;

    public boolean suaKhachHang(KhachHang khachHang) throws RemoteException;

    public KhachHang timKhachHangTheoSDT(String sdt) throws RemoteException;
}
