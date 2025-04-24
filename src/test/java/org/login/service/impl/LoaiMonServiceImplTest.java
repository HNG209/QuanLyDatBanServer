package org.login.service.impl;

import org.junit.jupiter.api.Test;
import org.login.entity.LoaiMonAn;
import org.login.service.LoaiMonService;

import java.rmi.RemoteException;

import static org.junit.jupiter.api.Assertions.*;

class LoaiMonServiceImplTest {
    private final LoaiMonService loaiMonService = new LoaiMonServiceImpl();

    LoaiMonServiceImplTest() throws RemoteException {
    }

    @Test
    void themLoaiMonAn() throws RemoteException {
        assertNotNull(
                loaiMonService.themLoaiMonAn(LoaiMonAn.builder()
                                .tenLoaiMonAn("Bánh mì RAM RAM")
                        .build())
        );
    }
}