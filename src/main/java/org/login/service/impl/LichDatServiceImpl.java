package org.login.service.impl;

import org.login.dao.LichDatDAO;
import org.login.entity.Ban;
import org.login.entity.LichDat;
import org.login.entity.enums.TrangThaiHoaDon;
import org.login.service.LichDatService;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class LichDatServiceImpl implements LichDatService {
    private final LichDatDAO lichDatDAO = new LichDatDAO();

    @Override
    public void taoLichDat(LichDat lichDat) {
        lichDatDAO.taoLichDat(lichDat);
    }

    @Override
    public void capNhatLichDat(LichDat lichDat) {
        lichDatDAO.capNhatLichDat(lichDat);
    }

    @Override
    public List<LichDat> getDSLichDat() {
        return lichDatDAO.getDSLichDat();
    }

    @Override
    public List<LichDat> getDSLichDatFrom(LocalDate from, LocalDate to, TrangThaiHoaDon trangThaiHoaDon) {
        return lichDatDAO.getDSLichDatFrom(from, to, trangThaiHoaDon);
    }

    @Override
    public List<LichDat> getDSLichDatByStatus(TrangThaiHoaDon trangThaiHoaDon) {
        return lichDatDAO.getDSLichDatByStatus(trangThaiHoaDon);
    }

    @Override
    public List<LichDat> getDSLichDatBy(String maLichDat, LocalDate ngayNhanBan, TrangThaiHoaDon trangThaiHoaDon, String cccd) {
        return lichDatDAO.getDSLichDatBy(maLichDat, ngayNhanBan, trangThaiHoaDon, cccd);
    }

    @Override
    public List<LichDat> getDSLichDatBy(LocalDateTime thoiGianNhanBan, Ban ban) {
        return lichDatDAO.getDSLichDatBy(thoiGianNhanBan, ban);
    }

    @Override
    public List<LichDat> getLichDatIf(Ban ban) {
        return lichDatDAO.getLichDatIf(ban);
    }

    @Override
    public LichDat getLichDat(String maLichDat) {
        return lichDatDAO.getLichDat(maLichDat);
    }
}
