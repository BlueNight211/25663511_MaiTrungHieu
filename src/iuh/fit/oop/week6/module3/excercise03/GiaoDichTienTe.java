package iuh.fit.oop.week6.module3.excercise03;

import java.time.LocalDate;

public class GiaoDichTienTe extends GiaoDich{
	private double tiGia;
	private LoaiTien loaiTien;
	
	public GiaoDichTienTe(String maGiaoDich, LocalDate ngayGiaoDich, int donGia, int soLuong, double tiGia,
			LoaiTien loaiTien) {
		super(maGiaoDich, ngayGiaoDich, donGia, soLuong);
		this.tiGia = tiGia;
		this.loaiTien = loaiTien;
	}
	
	public double getTiGia() {
		return tiGia;
	}
	public void setTiGia(double tiGia) {
		this.tiGia = tiGia;
	}
	public LoaiTien getLoaiTien() {
		return loaiTien;
	}
	public void setLoaiTien(LoaiTien loaiTien) {
		this.loaiTien = loaiTien;
	}
	
	public double thanhTien() {
		double heSo = loaiTien == LoaiTien.VND ? 1 : tiGia; 
		return getSoLuong() * getDonGia() * heSo;  
	}
	
	@Override
	protected String thongTinRieng() {
		return String.format(
				"Loại tiền: %s | Tỉ giá: %.2f", 
				loaiTien, 
				tiGia);
	}
}
