package org.login.service;

import org.login.entity.LoaiMonAn;

import java.util.List;

public interface LoaiMonService {
    public void themLoaiMonAn(LoaiMonAn loaiMonAn);
    public List<LoaiMonAn> getListLoai();
    public LoaiMonAn getMaLoaiMon(String id);
    public LoaiMonAn getLoaiMonByName(String tenLoai);
}
