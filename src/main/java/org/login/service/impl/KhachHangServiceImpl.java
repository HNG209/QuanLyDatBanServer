package org.login.service.impl;

import org.login.dao.KhachHangDAO;
import org.login.entity.KhachHang;
import org.login.service.KhachHangService;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

public class KhachHangServiceImpl extends UnicastRemoteObject implements KhachHangService {
    private final KhachHangDAO khachHangDAO = new KhachHangDAO();

    public KhachHangServiceImpl() throws RemoteException {
    }

    @Override
    public List<Object[]> layDSKhachHang() throws RemoteException{
        return khachHangDAO.layDSKhachHang();
    }

    @Override
    public KhachHang themKhachHang(KhachHang khachHang) throws RemoteException{
        return khachHangDAO.themKhachHang(khachHang);
    }

    @Override
    public KhachHang getKHBySDT(String sdt) throws RemoteException{
        return khachHangDAO.getKHBySDT(sdt);
    }

    @Override
    public KhachHang getKHByCCCD(String cccd) throws RemoteException{
        return khachHangDAO.getKHByCCCD(cccd);
    }

    @Override
    public boolean suaKhachHang(KhachHang khachHang) throws RemoteException{
        return khachHangDAO.suaKhachHang(khachHang);
    }

    @Override
    public KhachHang timKhachHangTheoSDT(String sdt) throws RemoteException{
        return khachHangDAO.timKhachHangTheoSDT(sdt);
    }
}
