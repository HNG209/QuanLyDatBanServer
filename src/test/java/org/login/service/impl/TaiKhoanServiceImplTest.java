package org.login.service.impl;

import org.junit.jupiter.api.Test;
import org.login.entity.TaiKhoan;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class TaiKhoanServiceImplTest {
    private final TaiKhoanServiceImpl taiKhoanService = new TaiKhoanServiceImpl();


    @Test
    void addNhanVien() {
        assertNotNull(taiKhoanService.addNhanVien(
                TaiKhoan.builder()
                        .password("1111")
                        .userName("LeNgocDung")
                        .build()
        ));

    }

    @Test
    void updateTaiKhoan() {
        TaiKhoan taiKhoan = taiKhoanService.getTaiKhoan("LeNgocDung");
        taiKhoan.setPassword("123456");
        assertNotNull(taiKhoanService.updateTaiKhoan(taiKhoan));
    }
}