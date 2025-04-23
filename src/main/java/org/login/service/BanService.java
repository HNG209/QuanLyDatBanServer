package org.login.service;

import org.login.entity.Ban;
import org.login.entity.enums.KhuVuc;
import org.login.entity.enums.LoaiBan;
import org.login.entity.enums.TrangThaiBan;

import java.util.List;

public interface BanService {
    public List<Ban> readAll();
    public List<Ban> readByStatus(TrangThaiBan trangThaiBan);
    public Ban updateBan(Ban ban);
    public List<Ban> getListBanTrong();
    public List<Ban> getListBanBy(String maBan, TrangThaiBan trangThaiBan, LoaiBan loaiBan, KhuVuc khuVuc);
    public Ban themBan(Ban ban);
    public Ban capnhatBan(Ban ban);
    public boolean deleteBan(String maBan);
}
