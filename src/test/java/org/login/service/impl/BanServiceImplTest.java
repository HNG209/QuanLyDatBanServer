package org.login.service.impl;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.login.entity.Ban;
import org.login.entity.enums.KhuVuc;
import org.login.entity.enums.LoaiBan;
import org.login.entity.enums.TrangThaiBan;
import org.login.service.BanService;

import java.rmi.RemoteException;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class BanServiceImplTest {
    private final BanService banService = new BanServiceImpl();

    BanServiceImplTest() throws RemoteException {
    }

    @Test
    void themBan() throws RemoteException {
//        Ban ban = Ban.builder()
//                .khuVuc(KhuVuc.A)
//                .loaiBan(LoaiBan.BAN_2_NGUOI)
//                .trangThaiBan(TrangThaiBan.BAN_TRONG)
//                .build();
//
//        Ban result = banService.themBan(ban);
//        assertNotNull(result);
    }

    @Test
    void capnhatBan() throws RemoteException {
//        Optional<Ban> ban = banService.readAll().stream().findFirst();
//
//        if(ban.isPresent()) {
//            ban.get().setTrangThaiBan(TrangThaiBan.DANG_PHUC_VU);
//            assertNotNull(banService.capnhatBan(ban.get()));
//        }
    }

    @Test
    void deleteBan() throws RemoteException {
//        Optional<Ban> ban = banService.readAll().stream().findFirst();
//
//        ban.ifPresent(value -> {
//            try {
//                assertTrue(banService.deleteBan(value.getMaBan()));
//            } catch (RemoteException e) {
//                throw new RuntimeException(e);
//            }
//        });
    }
}