package org.login.service.impl;

import org.login.dao.LichDatDAO;
import org.login.entity.Ban;
import org.login.entity.LichDat;
import org.login.entity.enums.TrangThaiHoaDon;
import org.login.service.LichDatService;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class LichDatServiceImpl extends UnicastRemoteObject implements LichDatService {
    private final LichDatDAO lichDatDAO = new LichDatDAO();

    public LichDatServiceImpl() throws RemoteException {
    }

    @Override
    public LichDat taoLichDat(LichDat lichDat) throws RemoteException {
        return lichDatDAO.taoLichDat(lichDat);
    }

    @Override
    public LichDat capNhatLichDat(LichDat lichDat) throws RemoteException {
        return lichDatDAO.capNhatLichDat(lichDat);
    }

    @Override
    public List<LichDat> getDSLichDat() throws RemoteException {
        return lichDatDAO.getDSLichDat();
    }

    @Override
    public List<LichDat> getDSLichDatFrom(LocalDate from, LocalDate to, TrangThaiHoaDon trangThaiHoaDon) throws RemoteException {
        return lichDatDAO.getDSLichDatFrom(from, to, trangThaiHoaDon);
    }

    @Override
    public List<LichDat> getDSLichDatByStatus(TrangThaiHoaDon trangThaiHoaDon) throws RemoteException {
        return lichDatDAO.getDSLichDatByStatus(trangThaiHoaDon);
    }

    @Override
    public List<LichDat> getDSLichDatBy(String maLichDat, LocalDate ngayNhanBan, TrangThaiHoaDon trangThaiHoaDon, String cccd) throws RemoteException {
        return lichDatDAO.getDSLichDatBy(maLichDat, ngayNhanBan, trangThaiHoaDon, cccd);
    }

    @Override
    public List<LichDat> getDSLichDatBy(LocalDateTime thoiGianNhanBan, Ban ban) throws RemoteException {
        return lichDatDAO.getDSLichDatBy(thoiGianNhanBan, ban);
    }

    @Override
    public List<LichDat> getLichDatIf(Ban ban) throws RemoteException {
        return lichDatDAO.getLichDatIf(ban);
    }

    @Override
    public LichDat getLichDat(String maLichDat) throws RemoteException {
        return lichDatDAO.getLichDat(maLichDat);
    }
}
