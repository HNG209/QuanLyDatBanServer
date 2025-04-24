package org.login.service;

import org.login.entity.ChiTietHoaDon;
import org.login.entity.HoaDon;
import org.login.entity.keygenerator.CTHDCompositeKey;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface CTHDService extends Remote {
    public List<ChiTietHoaDon> getAll() throws RemoteException;

    public ChiTietHoaDon luuCTHD(ChiTietHoaDon chiTietHoaDon) throws RemoteException;

    public List<ChiTietHoaDon> fetchChiTietHoaDonNative(String maHoaDon) throws RemoteException;

    public void deleteChiTietHoaDon(String maHoaDon, String maMonAn) throws RemoteException;

    public void capNhatSoLuong(CTHDCompositeKey key, int soLuong) throws RemoteException;

    public ChiTietHoaDon capNhatCTHD(ChiTietHoaDon chiTietHoaDon) throws RemoteException;

    public ChiTietHoaDon getCTHD(CTHDCompositeKey key) throws RemoteException;

    public List<ChiTietHoaDon> getCTHDfromHD(HoaDon hoaDon) throws RemoteException;

    public List<ChiTietHoaDon> getChiTietHoaDonByMaHoaDon(String maHoaDon) throws RemoteException;
}
