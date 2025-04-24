package org.login.service;

import org.login.entity.MonAn;

import java.util.List;

public interface MonAnService {
    public List<MonAn> readAll();
    public List<MonAn> getAllMonAn();
    public List<MonAn> getAllMonAn(int index, int limit);
    public MonAn themMonAn(MonAn monAn);
    public MonAn capNhatMonAn(MonAn monAnMoi);
    public List<String> getListDon();
    public List<MonAn> getMonAnBy(String ten, double giaTT, double giaTD, String loai, int index, int limit);
    public int countMonAnBy(String ten, double giaTT, double giaTD, String loai);
}
