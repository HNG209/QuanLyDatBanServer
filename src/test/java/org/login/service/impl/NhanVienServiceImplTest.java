package org.login.service.impl;

import org.junit.jupiter.api.Test;
import org.login.entity.KhachHang;
import org.login.entity.NhanVien;
import org.login.entity.enums.ChucVu;
import org.login.entity.enums.TrangThaiNhanVien;
import org.login.service.KhachHangService;
import org.login.service.NhanVienService;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class NhanVienServiceImplTest {
    private final NhanVienService nhanVienService = new NhanVienServiceImpl();

    @Test
    void addNhanVienTest() {
        NhanVien nhanVien = NhanVien.builder()
                .tenNhanVien("Crocodilo")
                .cccd("090912345678")
                .sdt("0986733200")
                .diaChi("Tralalelo")
                .gioiTinh(true)
                .ngaySinh(LocalDate.now())
                .hinhAnh("")
                .chucVuNhanVien(ChucVu.NHAN_VIEN)
                .trangThaiNhanVien(TrangThaiNhanVien.DANG_LAM)
                .build();

        NhanVien result = nhanVienService.addNhanVien(nhanVien);
        assertNotNull(result);
    }

    @Test
    void updateNhanVien() {
        NhanVien nhanVien = nhanVienService.getAllTaiKhoan().getFirst();
        nhanVien.setTenNhanVien("Nguyễn Văn B");
        nhanVien.setNgaySinh(LocalDate.of(2000, 6, 20));
        nhanVien.setDiaChi("456 Trần Phú, Q.5");
        nhanVien.setGioiTinh(true);
        nhanVien.setHinhAnh("avatar_b.jpg");
        nhanVien.setSdt("0988765432");
        nhanVien.setCccd("123456789012");
        nhanVien.setTrangThaiNhanVien(TrangThaiNhanVien.DANG_LAM);
        nhanVien.setChucVuNhanVien(ChucVu.NHAN_VIEN);

        NhanVien result = nhanVienService.updateNhanVien(nhanVien);
        assertNotNull(result);


//        String maNhanVienCu = "NV0001";
//
//        NhanVien nhanVienMoi = new NhanVien();
//        nhanVienMoi.setTenNhanVien("Nguyễn Văn B");
//        nhanVienMoi.setNgaySinh(LocalDate.of(2000, 6, 20));
//        nhanVienMoi.setDiaChi("456 Trần Phú, Q.5");
//        nhanVienMoi.setGioiTinh(true);
//        nhanVienMoi.setHinhAnh("avatar_b.jpg");
//        nhanVienMoi.setSdt("0988765432");
//        nhanVienMoi.setCccd("123456789012");
//        nhanVienMoi.setTrangThaiNhanVien(TrangThaiNhanVien.DANG_LAM);
//        nhanVienMoi.setChucVuNhanVien(ChucVu.NHAN_VIEN);
//
//        nhanVienService.updateNhanVien(maNhanVienCu, nhanVienMoi);
//
//        NhanVien updatedNhanVien = session.get(NhanVien.class, maNhanVienCu);
//        assertNotNull(updatedNhanVien);
//        assertEquals("Nguyễn Văn B", updatedNhanVien.getTenNhanVien());
//        assertEquals("0988765432", updatedNhanVien.getSdt());
    }
}