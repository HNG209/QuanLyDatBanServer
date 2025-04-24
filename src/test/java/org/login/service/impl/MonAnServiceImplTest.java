package org.login.service.impl;

import org.junit.jupiter.api.Test;
import org.login.entity.LoaiMonAn;
import org.login.entity.MonAn;
import org.login.service.LoaiMonService;
import org.login.service.MonAnService;

import java.rmi.RemoteException;

import static org.junit.jupiter.api.Assertions.*;

class MonAnServiceImplTest {
    private final MonAnService monAnService = new MonAnServiceImpl();
    private final LoaiMonService loaiMonService = new LoaiMonServiceImpl();

    MonAnServiceImplTest() throws RemoteException {
    }

    @Test
    void themMonAn() throws RemoteException {
        LoaiMonAn loaiMonAn = loaiMonService.getListLoai().getFirst();

        assertNotNull(monAnService.themMonAn(
                MonAn.builder()
                        .moTaMonAn("Bánh mì RAM RAM, quái vật bánh mì trỗi dậy")
                        .tenMonAn("Bánh mì RAM RAM")
                        .donGia(15_000.0)
                        .loaiMonAn(loaiMonAn)
                        .build()
        ));
    }

    @Test
    void capNhatMonAn() throws RemoteException {
        MonAn monAn = monAnService.getAllMonAn().getFirst();

        monAn.setTenMonAn("Bánh mì RAM RAM đã trỗi dậy!");

        assertNotNull(monAnService.capNhatMonAn(monAn));
    }
}