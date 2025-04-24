package org.login.service.impl;

import org.login.dao.ChiTietHoaDonDAO;
import org.login.entity.ChiTietHoaDon;
import org.login.entity.HoaDon;
import org.login.entity.keygenerator.CTHDCompositeKey;
import org.login.service.CTHDService;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

public class CTHDServiceImpl extends UnicastRemoteObject implements CTHDService {
    private final ChiTietHoaDonDAO chiTietHoaDonDAO = new ChiTietHoaDonDAO();

    public CTHDServiceImpl() throws RemoteException {
    }

    @Override
    public List<ChiTietHoaDon> getAll() throws RemoteException {
        return chiTietHoaDonDAO.getAll();
    }

    @Override
    public ChiTietHoaDon luuCTHD(ChiTietHoaDon chiTietHoaDon) throws RemoteException {
        return chiTietHoaDonDAO.luuCTHD(chiTietHoaDon);
    }

    @Override
    public List<ChiTietHoaDon> fetchChiTietHoaDonNative(String maHoaDon) throws RemoteException {
        return chiTietHoaDonDAO.fetchChiTietHoaDonNative(maHoaDon);
    }

    @Override
    public void deleteChiTietHoaDon(String maHoaDon, String maMonAn) throws RemoteException {
        chiTietHoaDonDAO.deleteChiTietHoaDon(maHoaDon, maMonAn);
    }

    @Override
    public void capNhatSoLuong(CTHDCompositeKey key, int soLuong) throws RemoteException {
        chiTietHoaDonDAO.capNhatSoLuong(key, soLuong);
    }

    @Override
    public ChiTietHoaDon capNhatCTHD(ChiTietHoaDon chiTietHoaDon) throws RemoteException {
        return chiTietHoaDonDAO.capNhatCTHD(chiTietHoaDon);
    }

    @Override
    public ChiTietHoaDon getCTHD(CTHDCompositeKey key) throws RemoteException {
        return chiTietHoaDonDAO.getCTHD(key);
    }

    @Override
    public List<ChiTietHoaDon> getCTHDfromHD(HoaDon hoaDon) throws RemoteException {
        return chiTietHoaDonDAO.getCTHDfromHD(hoaDon);
    }

    @Override
    public List<ChiTietHoaDon> getChiTietHoaDonByMaHoaDon(String maHoaDon) throws RemoteException {
        return chiTietHoaDonDAO.getChiTietHoaDonByMaHoaDon(maHoaDon);
    }
}
