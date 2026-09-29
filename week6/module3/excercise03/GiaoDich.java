package iuh.fit.oop.week6.module3.excercise03;

import java.time.LocalDate;

public abstract class GiaoDich {
	private String maGiaoDich;
	private LocalDate ngayGiaoDich;
	private int donGia;
	private int soLuong;
	
	public GiaoDich(String maGiaoDich, LocalDate ngayGiaoDich, int donGia, int soLuong) {
		this.maGiaoDich = maGiaoDich;
		this.ngayGiaoDich = ngayGiaoDich;
		this.donGia = donGia;
		this.soLuong = soLuong;
	}

	public String getMaGiaoDich() {
		return maGiaoDich;
	}

	public void setMaGiaoDich(String maGiaoDich) {
		this.maGiaoDich = maGiaoDich;
	}

	public LocalDate getNgayGiaoDich() {
		return ngayGiaoDich;
	}

	public void setNgayGiaoDich(LocalDate ngayGiaoDich) {
		this.ngayGiaoDich = ngayGiaoDich;
	}

	public int getDonGia() {
		return donGia;
	}

	public void setDonGia(int donGia) {
		this.donGia = donGia;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	
	public abstract double thanhTien();
	protected abstract String thongTinRieng();
	
	protected String thongTinChung() {
		
		return String.format(
				"Mã: %s | Ngày: %s | Đơn giá: %.2f | Số lượng: %d", 
				maGiaoDich,
				ngayGiaoDich,
				donGia,
				soLuong);
	}
	
	@Override
	public String toString() {
		return thongTinChung()
                + " | " + thongTinRieng()
                + String.format(
                		" | Thành tiền: %.2f", 
                		thanhTien());
	}
}
