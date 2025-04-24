package org.login.service.impl;

import org.junit.jupiter.api.Test;
import org.login.entity.TaiKhoan;

import java.rmi.RemoteException;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class TaiKhoanServiceImplTest {
    private final TaiKhoanServiceImpl taiKhoanService = new TaiKhoanServiceImpl();

    TaiKhoanServiceImplTest() throws RemoteException {
    }


    @Test
    void addNhanVien() throws RemoteException {
        assertNotNull(taiKhoanService.addNhanVien(
                TaiKhoan.builder()
                        .password("1111")
                        .userName("LeNgocDung")
                        .build()
        ));

    }

    @Test
    void updateTaiKhoan() throws RemoteException {
        TaiKhoan taiKhoan = taiKhoanService.getTaiKhoan("LeNgocDung");
        taiKhoan.setPassword("123456");
        assertNotNull(taiKhoanService.updateTaiKhoan(taiKhoan));
    }
}