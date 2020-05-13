/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap1;

/**
 *
 * @author ASUS
 */
public class BaiTap1Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HoaDon hoadonhd = new HoaDon.HoaDonHeader().addMaHD("HD001").addNgayBan("13/05/2020").addTenKH("Khang").hoaDonHeader();
        HoaDon cthd = new HoaDon.CTHD().addSanPham("Sua").addDonGia("15000 vnd").addSoLuong("2").cthd();
        System.out.println(hoadonhd.toString());
        System.out.println(cthd.toString());
    }
    
}
