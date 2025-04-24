package org.login.service.impl;

import org.login.dao.MonAnDAO;
import org.login.entity.MonAn;
import org.login.service.MonAnService;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

public class MonAnServiceImpl extends UnicastRemoteObject implements MonAnService {
    private final MonAnDAO monAnDAO = new MonAnDAO();

    public MonAnServiceImpl() throws RemoteException {
    }

    @Override
    public List<MonAn> readAll() throws RemoteException {
        return monAnDAO.readAll();
    }

    @Override
    public List<MonAn> getAllMonAn() throws RemoteException {
        return monAnDAO.getAllMonAn();
    }

    @Override
    public List<MonAn> getAllMonAn(int index, int limit) throws RemoteException {
        return monAnDAO.getAllMonAn(index, limit);
    }

    @Override
    public MonAn themMonAn(MonAn monAn) throws RemoteException {
        return monAnDAO.themMonAn(monAn);
    }

    @Override
    public MonAn capNhatMonAn(MonAn monAnMoi) throws RemoteException {
        return monAnDAO.capNhatMonAn(monAnMoi);
    }

    @Override
    public List<String> getListDon() throws RemoteException {
        return monAnDAO.getListDon();
    }

    @Override
    public List<MonAn> getMonAnBy(String ten, double giaTT, double giaTD, String loai, int index, int limit) throws RemoteException {
        return monAnDAO.getMonAnBy(ten, giaTT, giaTD, loai, index, limit);
    }

    @Override
    public int countMonAnBy(String ten, double giaTT, double giaTD, String loai) throws RemoteException {
        return monAnDAO.countMonAnBy(ten, giaTT, giaTD, loai);
    }
}
