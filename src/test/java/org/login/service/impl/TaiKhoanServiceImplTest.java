package org.login.service.impl;

import org.junit.jupiter.api.Test;
import org.login.entity.NhanVien;
import org.login.entity.TaiKhoan;
import org.login.service.NhanVienService;
import org.login.service.TaiKhoanService;

import java.rmi.RemoteException;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class TaiKhoanServiceImplTest {
    private final TaiKhoanService taiKhoanService = new TaiKhoanServiceImpl();
    private final NhanVienService nhanVienService = new NhanVienServiceImpl();

    TaiKhoanServiceImplTest() throws RemoteException {
    }


    @Test
    void addNhanVien() throws RemoteException {
//        NhanVien nhanVien = nhanVienService.getAllTaiKhoan().getFirst();
//        assertNotNull(taiKhoanService.addNhanVien(
//                TaiKhoan.builder()
//                        .nhanVien(nhanVien)
//                        .password("1111")
//                        .userName("LeNgocDung")
//                        .build()
//        ));

    }

    @Test
    void updateTaiKhoan() throws RemoteException {
//        TaiKhoan taiKhoan = taiKhoanService.getTaiKhoan("LeNgocDung");
//        taiKhoan.setPassword("123456");
//        assertNotNull(taiKhoanService.updateTaiKhoan(taiKhoan));
    }
}