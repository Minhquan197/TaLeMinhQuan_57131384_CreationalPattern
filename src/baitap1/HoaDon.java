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
public class HoaDon {
    String maHD, ngayBan, tenKH, sanPham, soLuong, donGia, chietKhau;
    
    protected HoaDon(HoaDonHeader header){
        this.maHD = header.maHD;
        this.ngayBan = header.ngayBan;
        this.tenKH = header.tenKH;
    }
    
    protected HoaDon(CTHD cthd){
        this.sanPham = cthd.sanPham;
        this.soLuong = cthd.soLuong;
        this.donGia = cthd.donGia;
        this.chietKhau = cthd.chietKhau; 
    }
    
    public static class HoaDonHeader{
        String maHD, ngayBan, tenKH;
        
        public HoaDonHeader() {
        }
        
        public HoaDonHeader addMaHD(String maHD){
            this.maHD = maHD;
            return this;
        
        }
        
        public HoaDonHeader addNgayBan(String ngayBan){
            this.ngayBan = ngayBan;
            return this;
        }
        
        public HoaDonHeader addTenKH(String tenKH){
            this.tenKH = tenKH;
            return this;
        }
        
        public HoaDon hoaDonHeader(){
            return new HoaDon(this);
        }
        
    }
    
    public static class CTHD{
        String sanPham, soLuong, donGia, chietKhau;
        //ArrayList<String> chiTiet = new ArrayList<>();

        public CTHD() {
        }
        
        public CTHD addSanPham(String sanPham){
            this.sanPham = sanPham;
            return this;            
        }
        
        public CTHD addSoLuong(String soLuong){
            this.soLuong = soLuong;
            return this;
        }
        
        public CTHD addDonGia(String donGia){
            this.donGia = donGia;
            return this;
        }
        
        public CTHD addhietKhau(String chietKhau){
            this.chietKhau = chietKhau;
            return this;
        }
        
        public HoaDon cthd(){
            return new HoaDon(this);
        }
    }

    @Override
    public String toString() {
        return "HoaDon{" + "maHD=" + maHD + ", ngayBan=" + ngayBan + ", tenKH=" + tenKH + '}';
    }
    
    

    
    
    
}
