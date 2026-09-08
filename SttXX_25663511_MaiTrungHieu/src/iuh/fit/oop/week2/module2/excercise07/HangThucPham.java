package iuh.fit.oop.week2.module2.excercise07;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class HangThucPham {
	private String maHang;
    private String tenHang;
    private double donGia;
    private LocalDate ngaySanXuat;
    private LocalDate ngayHetHan;

    public HangThucPham(String maHang) throws Exception {
        setMaHang(maHang);
        this.tenHang = "xxx";
        this.donGia = 0;
        this.ngaySanXuat = LocalDate.now();
        this.ngayHetHan = this.ngaySanXuat;
    }   

    public HangThucPham(String maHang, String tenHang, double donGia, LocalDate ngaySanXuat, LocalDate ngayHetHan) throws Exception {
        setMaHang(maHang);
        setTenHang(tenHang);
        setDonGia(donGia);
        setNgaySanXuat(ngaySanXuat);
        setNgayHetHan(ngayHetHan);
    }

    public String getMaHang() {
        return maHang;
    }

    private void setMaHang(String maHang) throws Exception {
        if (maHang != null && !maHang.trim().isEmpty()) {
            this.maHang = maHang;
        } else {
            throw new Exception("Lỗi: Mã hàng rỗng!");
        }
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        if (tenHang == null || tenHang.trim().isEmpty()) {
            this.tenHang = "xxx";
        } else {
            this.tenHang = tenHang;
        }
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        if (donGia >= 0) {
            this.donGia = donGia;
        } else {
            this.donGia = 0.0;
        }
    }

    public LocalDate getNgaySanXuat() {
        return ngaySanXuat;
    }

    public void setNgaySanXuat(LocalDate ngaySanXuat) {
        if (ngaySanXuat != null && !ngaySanXuat.isAfter(LocalDate.now())) {
            this.ngaySanXuat = ngaySanXuat;
        } else {
            this.ngaySanXuat = LocalDate.now();
        }
    }

    public LocalDate getNgayHetHan() {
        return ngayHetHan;
    }

    public void setNgayHetHan(LocalDate ngayHetHan) {
        if (ngayHetHan != null && ngayHetHan.isAfter(this.ngaySanXuat)) {
            this.ngayHetHan = ngayHetHan;
        } else {
            this.ngayHetHan = this.ngaySanXuat;
        }
    }
    
    public boolean hetHan() {
        return ngayHetHan.isBefore(LocalDate.now());
    }

    @Override
    public String toString() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DecimalFormat df = new DecimalFormat("#,##0.00");
        
        String strNgaySX = dtf.format(ngaySanXuat);
        String strNgayHH = dtf.format(ngayHetHan);
        String strDonGia = df.format(donGia) + "VNĐ";
        String strGhiChu = hetHan() ? "Hàng hết hạn" : "";
        return String.format("%-10s %-12s %21s %12s %16s %18s", 
                maHang, tenHang, strDonGia, strNgaySX, strNgayHH, strGhiChu);
    }
}
