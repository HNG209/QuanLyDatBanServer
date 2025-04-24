package org.login.service.impl;

import org.junit.jupiter.api.Test;
import org.login.entity.ChiTietHoaDon;
import org.login.entity.HoaDon;
import org.login.entity.MonAn;
import org.login.service.CTHDService;
import org.login.service.HoaDonService;
import org.login.service.MonAnService;

import static org.junit.jupiter.api.Assertions.*;

class CTHDServiceImplTest {
    private final HoaDonService hoaDonService = new HoaDonServiceImpl();
    private final CTHDService cthdService = new CTHDServiceImpl();
    private final MonAnService monAnService = new MonAnServiceImpl();

    @Test
    void luuCTHD() {
        HoaDon hoaDon = hoaDonService.getAllHoaDon().getFirst();
        MonAn monAn = monAnService.getAllMonAn().getFirst();

        ChiTietHoaDon chiTietHoaDon = new ChiTietHoaDon();
        chiTietHoaDon.setSoLuong(2);
        chiTietHoaDon.setHoaDon(hoaDon);
        chiTietHoaDon.setMonAn(monAn);

        assertNotNull(cthdService.luuCTHD(chiTietHoaDon));
    }

    @Test
    void capNhatCTHD() {
        ChiTietHoaDon chiTietHoaDon = cthdService.getAll().getFirst();

        chiTietHoaDon.setSoLuong(100);

        assertNotNull(cthdService.capNhatCTHD(chiTietHoaDon));
    }
}