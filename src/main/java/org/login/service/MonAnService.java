package org.login.service;

import org.login.entity.MonAn;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface MonAnService extends Remote {
    public List<MonAn> readAll() throws RemoteException;

    public List<MonAn> getAllMonAn() throws RemoteException;

    public List<MonAn> getAllMonAn(int index, int limit) throws RemoteException;

    public MonAn themMonAn(MonAn monAn) throws RemoteException;

    public MonAn capNhatMonAn(MonAn monAnMoi) throws RemoteException;

    public List<String> getListDon() throws RemoteException;

    public List<MonAn> getMonAnBy(String ten, double giaTT, double giaTD, String loai, int index, int limit) throws RemoteException;

    public int countMonAnBy(String ten, double giaTT, double giaTD, String loai) throws RemoteException;
}
