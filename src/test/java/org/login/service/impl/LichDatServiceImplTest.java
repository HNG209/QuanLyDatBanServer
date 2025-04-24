package org.login.service.impl;

import org.junit.jupiter.api.Test;
import org.login.entity.LichDat;
import org.login.entity.NhanVien;

import java.time.LocalDate;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class LichDatServiceImplTest {
    private LichDatServiceImpl lichDatService = new LichDatServiceImpl();

    @Test
    void taoLichDat() {
        assertNotNull(lichDatService.taoLichDat(
                LichDat.builder()
                        .thoiGianDat(LocalDateTime.now())
                        .soLuongNguoi(5)
                        .thoiGianNhanBan(LocalDateTime.now())
                        .build()
        ));

    }

    @Test
    void capNhatLichDat() {
      LichDat lichDat= lichDatService.getDSLichDat().get(0);
      assertNotNull(
              lichDatService.capNhatLichDat(lichDat)
      );
    }
}