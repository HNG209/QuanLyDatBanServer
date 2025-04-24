package org.login.rmi;

import org.login.entity.MonAn;
import org.login.service.*;
import org.login.service.impl.*;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class RMIServer {
    public static void main(String[] args) throws NamingException, RemoteException {
        Context context = new InitialContext();
        LocateRegistry.createRegistry(2909);

        BanService banService = new BanServiceImpl();
        CTHDService cthdService = new CTHDServiceImpl();
        HoaDonService hoaDonService = new HoaDonServiceImpl();
        KhachHangService khachHangService = new KhachHangServiceImpl();
        LichDatService lichDatService = new LichDatServiceImpl();
        LoaiMonService loaiMonService = new LoaiMonServiceImpl();
        MonAnService monAnService = new MonAnServiceImpl();
        NhanVienService nhanVienService = new NhanVienServiceImpl();
        TaiKhoanService taiKhoanService = new TaiKhoanServiceImpl();

        String host = System.getenv("HOST_NAME");

        context.bind("rmi://"+ host + ":2909/banService", banService);
        context.bind("rmi://"+ host + ":2909/cthdService", cthdService);
        context.bind("rmi://"+ host + ":2909/hoaDonService", hoaDonService);
        context.bind("rmi://"+ host + ":2909/khachHangService", khachHangService);
        context.bind("rmi://"+ host + ":2909/lichDatService", lichDatService);
        context.bind("rmi://"+ host + ":2909/monAnService", monAnService);
        context.bind("rmi://"+ host + ":2909/loaiMonService", loaiMonService);
        context.bind("rmi://"+ host + ":2909/nhanVienService", nhanVienService);
        context.bind("rmi://"+ host + ":2909/taiKhoanService", taiKhoanService);

        System.out.println("Server is running...");
    }
}
