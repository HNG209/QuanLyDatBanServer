package org.login.service;

import org.login.entity.LoaiMonAn;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface LoaiMonService extends Remote {
    public LoaiMonAn themLoaiMonAn(LoaiMonAn loaiMonAn) throws RemoteException;

    public List<LoaiMonAn> getListLoai() throws RemoteException;

    public LoaiMonAn getMaLoaiMon(String id) throws RemoteException;

    public LoaiMonAn getLoaiMonByName(String tenLoai) throws RemoteException;
}
