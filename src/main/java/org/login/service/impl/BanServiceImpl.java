package org.login.service.impl;

import org.login.dao.BanDAO;
import org.login.entity.Ban;
import org.login.entity.enums.KhuVuc;
import org.login.entity.enums.LoaiBan;
import org.login.entity.enums.TrangThaiBan;
import org.login.service.BanService;

import java.util.List;

public class BanServiceImpl implements BanService {
    private final BanDAO banDAO = new BanDAO();

    @Override
    public List<Ban> readAll() {
        return banDAO.readAll();
    }

    @Override
    public List<Ban> readByStatus(TrangThaiBan trangThaiBan) {
        return banDAO.readByStatus(trangThaiBan);
    }

    @Override
    public Ban updateBan(Ban ban) {
        return banDAO.updateBan(ban);
    }

    @Override
    public List<Ban> getListBanTrong() {
        return banDAO.getListBanTrong();
    }

    @Override
    public List<Ban> getListBanBy(String maBan, TrangThaiBan trangThaiBan, LoaiBan loaiBan, KhuVuc khuVuc) {
        return banDAO.getListBanBy(maBan, trangThaiBan, loaiBan, khuVuc);
    }

    @Override
    public Ban themBan(Ban ban) {
        return banDAO.themBan(ban);
    }

    @Override
    public Ban capnhatBan(Ban ban) {
        return banDAO.capnhatBan(ban);
    }

    @Override
    public boolean deleteBan(String maBan) {
        return banDAO.deleteBan(maBan);
    }
}
