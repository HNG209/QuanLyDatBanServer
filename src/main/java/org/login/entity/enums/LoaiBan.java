package org.login.entity.enums;

public enum LoaiBan {
    BAN_2_NGUOI("Bàn 2 người"),
    BAN_5_NGUOI("Bàn 5 người"),
    BAN_10_NGUOI("Bàn 10 người");

    private final String name;
    LoaiBan(String s) {
        this.name = s;
    }

    @Override
    public String toString() {
        return name;
    }
}
