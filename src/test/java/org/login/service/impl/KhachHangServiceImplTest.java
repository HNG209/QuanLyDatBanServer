package org.login.service.impl;

import org.junit.jupiter.api.Test;
import org.login.entity.KhachHang;
import org.login.entity.MonAn;
import org.login.service.BanService;
import org.login.service.KhachHangService;

import java.rmi.RemoteException;

import static org.junit.jupiter.api.Assertions.*;

class KhachHangServiceImplTest {
    private final KhachHangService khachHangService = new KhachHangServiceImpl();

    KhachHangServiceImplTest() throws RemoteException {
    }

    @Test
    void themKhachHang() throws RemoteException {
//        KhachHang khachHang = KhachHang.builder()
//                .tenKhachHang("Bao Dat Hung Dung")
//                .cccd("090912345678")
//                .sdt("0986733200")
//                .diaChi("Tam tai TungTungSahur ")
//                .email("gmailGaming@gmail.com")
//                .diemTichLuy(0)
//                .build();
//
//        KhachHang result = khachHangService.themKhachHang(khachHang);
//        assertNotNull(result);

    }

    @Test
    void suaKhachHang() throws RemoteException {
//        KhachHang khachHang = khachHangService.getKHByCCCD("090912345678");
//
//        khachHang.setCccd("091234567890");
//        assertNotNull(khachHangService.suaKhachHang(khachHang));

    }
}