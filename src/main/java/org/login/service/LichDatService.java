package org.login.service;

import org.login.entity.Ban;
import org.login.entity.LichDat;
import org.login.entity.enums.TrangThaiHoaDon;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public interface LichDatService {
    public LichDat taoLichDat(LichDat lichDat);
    public LichDat capNhatLichDat(LichDat lichDat);
    public List<LichDat> getDSLichDat();
    public List<LichDat> getDSLichDatFrom(LocalDate from, LocalDate to, TrangThaiHoaDon trangThaiHoaDon);
    public List<LichDat> getDSLichDatByStatus(TrangThaiHoaDon trangThaiHoaDon);
    public List<LichDat> getDSLichDatBy(String maLichDat, LocalDate ngayNhanBan, TrangThaiHoaDon trangThaiHoaDon, String cccd);
    public List<LichDat> getDSLichDatBy(LocalDateTime thoiGianNhanBan, Ban ban);
    public List<LichDat> getLichDatIf(Ban ban);
    public LichDat getLichDat(String maLichDat);
}
