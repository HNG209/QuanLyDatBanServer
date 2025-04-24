package org.login.service.impl;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.login.entity.Ban;
import org.login.entity.enums.KhuVuc;
import org.login.entity.enums.LoaiBan;
import org.login.entity.enums.TrangThaiBan;
import org.login.service.BanService;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class BanServiceImplTest {
    private final BanService banService = new BanServiceImpl();

    @Test
    void themBan() {
        Ban ban = Ban.builder()
                .khuVuc(KhuVuc.A)
                .loaiBan(LoaiBan.BAN_2_NGUOI)
                .trangThaiBan(TrangThaiBan.BAN_TRONG)
                .build();

        Ban result = banService.themBan(ban);
        assertNotNull(result);
    }

    @Test
    void capnhatBan() {
        Optional<Ban> ban = banService.readAll().stream().findFirst();

        if(ban.isPresent()) {
            ban.get().setTrangThaiBan(TrangThaiBan.DANG_PHUC_VU);
            assertNotNull(banService.capnhatBan(ban.get()));
        }
    }

    @Test
    void deleteBan() {
        Optional<Ban> ban = banService.readAll().stream().findFirst();

        ban.ifPresent(value -> assertTrue(banService.deleteBan(value.getMaBan())));
    }
}