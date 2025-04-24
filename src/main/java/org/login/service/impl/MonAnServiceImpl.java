package org.login.service.impl;

import org.login.dao.MonAnDAO;
import org.login.entity.MonAn;
import org.login.service.MonAnService;

import java.util.List;

public class MonAnServiceImpl implements MonAnService {
    private final MonAnDAO monAnDAO = new MonAnDAO();

    @Override
    public List<MonAn> readAll() {
        return monAnDAO.readAll();
    }

    @Override
    public List<MonAn> getAllMonAn() {
        return monAnDAO.getAllMonAn();
    }

    @Override
    public List<MonAn> getAllMonAn(int index, int limit) {
        return monAnDAO.getAllMonAn(index, limit);
    }

    @Override
    public MonAn themMonAn(MonAn monAn) {
        return monAnDAO.themMonAn(monAn);
    }

    @Override
    public MonAn capNhatMonAn(MonAn monAnMoi) {
        return monAnDAO.capNhatMonAn(monAnMoi);
    }

    @Override
    public List<String> getListDon() {
        return monAnDAO.getListDon();
    }

    @Override
    public List<MonAn> getMonAnBy(String ten, double giaTT, double giaTD, String loai, int index, int limit) {
        return monAnDAO.getMonAnBy(ten, giaTT, giaTD, loai, index, limit);
    }

    @Override
    public int countMonAnBy(String ten, double giaTT, double giaTD, String loai) {
        return monAnDAO.countMonAnBy(ten, giaTT, giaTD, loai);
    }
}
