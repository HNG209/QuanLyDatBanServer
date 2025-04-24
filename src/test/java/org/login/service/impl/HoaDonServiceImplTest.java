package org.login.service.impl;

import org.junit.jupiter.api.Test;
import org.login.dao.HoaDonDAO;
import org.login.entity.Ban;
import org.login.entity.HoaDon;
import org.login.entity.enums.TrangThaiHoaDon;
import org.login.service.HoaDonService;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class HoaDonServiceImplTest {
    private final HoaDonService hoaDonService = new HoaDonServiceImpl();

    @Test
    void lapHoaDon() {
        HoaDon hoaDon = HoaDon.builder()
                .trangThaiHoaDon(TrangThaiHoaDon.TEST)
                .build();

        assertNotNull(hoaDonService.lapHoaDon(hoaDon));
    }

    @Test
    void updateHoaDon() {
        Optional<HoaDon> hoaDon = hoaDonService.getAllHoaDon().stream().findFirst();

        hoaDon.ifPresent(don -> assertNotNull(hoaDonService.updateHoaDon(don)));
    }
}