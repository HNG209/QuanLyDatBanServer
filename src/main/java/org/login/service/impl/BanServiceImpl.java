package org.login.service.impl;

import org.login.dao.BanDAO;
import org.login.entity.Ban;
import org.login.entity.enums.KhuVuc;
import org.login.entity.enums.LoaiBan;
import org.login.entity.enums.TrangThaiBan;
import org.login.service.BanService;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

public class BanServiceImpl extends UnicastRemoteObject implements BanService {
    private final BanDAO banDAO = new BanDAO();

    public BanServiceImpl() throws RemoteException {
    }

    @Override
    public List<Ban> readAll() throws RemoteException {
        return banDAO.readAll();
    }

    @Override
    public List<Ban> readByStatus(TrangThaiBan trangThaiBan) throws RemoteException {
        return banDAO.readByStatus(trangThaiBan);
    }

    @Override
    public Ban updateBan(Ban ban) throws RemoteException {
        return banDAO.updateBan(ban);
    }

    @Override
    public List<Ban> getListBanTrong() throws RemoteException {
        return banDAO.getListBanTrong();
    }

    @Override
    public List<Ban> getListBanBy(String maBan, TrangThaiBan trangThaiBan, LoaiBan loaiBan, KhuVuc khuVuc) throws RemoteException {
        return banDAO.getListBanBy(maBan, trangThaiBan, loaiBan, khuVuc);
    }

    @Override
    public Ban themBan(Ban ban) throws RemoteException {
        return banDAO.themBan(ban);
    }

    @Override
    public Ban capnhatBan(Ban ban) throws RemoteException {
        return banDAO.capnhatBan(ban);
    }

    @Override
    public boolean deleteBan(String maBan) throws RemoteException {
        return banDAO.deleteBan(maBan);
    }
}
