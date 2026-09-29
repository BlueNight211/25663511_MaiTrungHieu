package iuh.fit.oop.week6.module3.excercise02;

import java.time.LocalDate;

public abstract class Sach {
	protected String maSach;
	protected LocalDate ngayNhap;
	protected double donGia;
	protected int soLuong;
	protected String nhaXuatBan;
	
	public Sach(String maSach, LocalDate ngayNhap, double donGia, int soLuong, String nhaXuatBan) {
		setMaSach(maSach);
		setNgayNhap(ngayNhap);
		setDonGia(donGia);
		setSoLuong(soLuong);
		setNhaXuatBan(nhaXuatBan);
	}

	public String getMaSach() {
		return maSach;
	}

	public void setMaSach(String maSach) {
		this.maSach = maSach;
	}

	public LocalDate getNgayNhap() {
		return ngayNhap;
	}

	public void setNgayNhap(LocalDate ngayNhap) {
		this.ngayNhap = ngayNhap;
	}

	public double getDonGia() {
		return donGia;
	}

	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	public String getNhaXuatBan() {
		return nhaXuatBan;
	}

	public void setNhaXuatBan(String nhaXuatBan) {
		this.nhaXuatBan = nhaXuatBan;
	}
	
	public abstract double thanhTien();
	
	protected String thongTinChung() {
		return String.format(
				"Mã: %s | Ngày nhập: %s | Đơn giá: %.2f | Số lượng: %d | NXB: %s",
                maSach, 
                ngayNhap, 
                donGia, 
                soLuong, 
                nhaXuatBan);
	}
	@Override
	public String toString() {
		return thongTinChung() 
				+ String.format(
						" | Thành tiền: %.2f", 
						thanhTien());
	}
}
