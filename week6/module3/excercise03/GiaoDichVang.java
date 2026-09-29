package iuh.fit.oop.week6.module3.excercise03;

import java.time.LocalDate;

public class GiaoDichVang extends GiaoDich {
	private String loaiVang;

	public GiaoDichVang(String maGiaoDich, LocalDate ngayGiaoDich, int donGia, int soLuong, String loaiVang) {
		super(maGiaoDich, ngayGiaoDich, donGia, soLuong);
		this.loaiVang = loaiVang;
	}

	public String getLoaiVang() {
		return loaiVang;
	}

	public void setLoaiVang(String loaiVang) {
		this.loaiVang = loaiVang;
	}
	
	public double thanhTien() {
		return getSoLuong() * getDonGia();
	}
	
	@Override
	protected String thongTinRieng() {
		return String.format(
				"Loại vàng: ", 
				loaiVang);
	}
}
