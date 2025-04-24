package org.login.service;

import org.login.entity.Ban;
import org.login.entity.LichDat;
import org.login.entity.enums.TrangThaiHoaDon;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public interface LichDatService extends Remote {
    public LichDat taoLichDat(LichDat lichDat) throws RemoteException;

    public LichDat capNhatLichDat(LichDat lichDat) throws RemoteException;

    public List<LichDat> getDSLichDat() throws RemoteException;

    public List<LichDat> getDSLichDatFrom(LocalDate from, LocalDate to, TrangThaiHoaDon trangThaiHoaDon) throws RemoteException;

    public List<LichDat> getDSLichDatByStatus(TrangThaiHoaDon trangThaiHoaDon) throws RemoteException;

    public List<LichDat> getDSLichDatBy(String maLichDat, LocalDate ngayNhanBan, TrangThaiHoaDon trangThaiHoaDon, String cccd) throws RemoteException;

    public List<LichDat> getDSLichDatBy(LocalDateTime thoiGianNhanBan, Ban ban) throws RemoteException;

    public List<LichDat> getLichDatIf(Ban ban) throws RemoteException;

    public LichDat getLichDat(String maLichDat) throws RemoteException;
}
