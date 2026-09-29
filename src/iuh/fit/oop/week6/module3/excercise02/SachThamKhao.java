package iuh.fit.oop.week6.module3.excercise02;

import java.time.LocalDate;

public class SachThamKhao extends Sach {
	private double thue;

	public SachThamKhao(String maSach, LocalDate ngayNhap, double donGia, int soLuong, String nhaXuatBan, double thue) {
		super(maSach, ngayNhap, donGia, soLuong, nhaXuatBan);
		this.thue = thue;
	}

	public double getThue() {
		return thue;
	}

	public void setThue(double thue) {
		this.thue = thue;
	}
	
	
	public double thanhTien() {
		return getSoLuong() * getDonGia() + thue;
	}
	
	@Override
	public String toString() {
		return "Sách tham khảo | " + thongTinChung()
        		+ String.format(
        				" | Thuế: %s | Thành tiền: %.2f",
                        	thue, 
                        	thanhTien());
	}
}
