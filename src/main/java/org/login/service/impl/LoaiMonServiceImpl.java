package org.login.service.impl;

import org.login.dao.LoaiMonDAO;
import org.login.entity.LoaiMonAn;
import org.login.service.LoaiMonService;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

public class LoaiMonServiceImpl extends UnicastRemoteObject implements LoaiMonService {
    private final LoaiMonDAO loaiMonDAO = new LoaiMonDAO();

    public LoaiMonServiceImpl() throws RemoteException {
    }

    @Override
    public LoaiMonAn themLoaiMonAn(LoaiMonAn loaiMonAn) throws RemoteException {
        return loaiMonDAO.themLoaiMonAn(loaiMonAn);
    }

    @Override
    public List<LoaiMonAn> getListLoai() throws RemoteException {
        return loaiMonDAO.getListLoai();
    }

    @Override
    public LoaiMonAn getMaLoaiMon(String id) throws RemoteException {
        return loaiMonDAO.getMaLoaiMon(id);
    }

    @Override
    public LoaiMonAn getLoaiMonByName(String tenLoai) throws RemoteException {
        return loaiMonDAO.getLoaiMonByName(tenLoai);
    }
}
