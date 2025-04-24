package org.login.entity.enums;

public enum TrangThaiHoaDon {
    DA_THANH_TOAN("Đã thanh toán"),
    CHUA_THANH_TOAN("Chưa thanh toán"),
    DA_DAT("Đã đặt"),
    DA_HUY("Đã huỷ"),
    TEST("test");

    private final String name;

    TrangThaiHoaDon(String s) {
        this.name = s;
    }

    @Override
    public String toString() {
        return name;
    }
}
