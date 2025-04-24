package org.login.service;

import org.login.entity.Ban;
import org.login.entity.enums.KhuVuc;
import org.login.entity.enums.LoaiBan;
import org.login.entity.enums.TrangThaiBan;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface BanService extends Remote {
    public List<Ban> readAll() throws RemoteException;

    public List<Ban> readByStatus(TrangThaiBan trangThaiBan) throws RemoteException;

    public Ban updateBan(Ban ban) throws RemoteException;

    public List<Ban> getListBanTrong() throws RemoteException;

    public List<Ban> getListBanBy(String maBan, TrangThaiBan trangThaiBan, LoaiBan loaiBan, KhuVuc khuVuc) throws RemoteException;

    public Ban themBan(Ban ban) throws RemoteException;

    public Ban capnhatBan(Ban ban) throws RemoteException;

    public boolean deleteBan(String maBan) throws RemoteException;
}
