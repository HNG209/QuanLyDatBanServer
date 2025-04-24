package org.login.service.impl;

import org.login.dao.LoaiMonDAO;
import org.login.entity.LoaiMonAn;
import org.login.service.LoaiMonService;

import java.util.List;

public class LoaiMonServiceImpl implements LoaiMonService {
    private final LoaiMonDAO loaiMonDAO = new LoaiMonDAO();

    @Override
    public LoaiMonAn themLoaiMonAn(LoaiMonAn loaiMonAn) {
        return loaiMonDAO.themLoaiMonAn(loaiMonAn);
    }

    @Override
    public List<LoaiMonAn> getListLoai() {
        return loaiMonDAO.getListLoai();
    }

    @Override
    public LoaiMonAn getMaLoaiMon(String id) {
        return loaiMonDAO.getMaLoaiMon(id);
    }

    @Override
    public LoaiMonAn getLoaiMonByName(String tenLoai) {
        return loaiMonDAO.getLoaiMonByName(tenLoai);
    }
}
