package iuh.fit.oop.week6.module3.excercise02;

import java.time.LocalDate;

public class SachGiaoKhoa extends Sach {
	private TinhTrang tinhTrang;

	public SachGiaoKhoa(String maSach, LocalDate ngayNhap, double donGia, int soLuong, String nhaXuatBan,
			TinhTrang tinhTrang) {
		super(maSach, ngayNhap, donGia, soLuong, nhaXuatBan);
		setTinhTrang(tinhTrang);
	}

	public TinhTrang getTinhTrang() {
		return tinhTrang;
	}

	public void setTinhTrang(TinhTrang tinhTrang) {
		this.tinhTrang = tinhTrang;
	}
	
    public double thanhTien() {
        	double heSo = tinhTrang == TinhTrang.NEW ? 1 : 0.5;
        	return getSoLuong() * getDonGia() * heSo;
    }
	
	@Override
    public String toString() {
        return "Sách giáo khoa | " + thongTinChung()
                + String.format(
                		" | Tình trạng: %s | Thành tiền: %.2f",
                                tinhTrang, 
                                thanhTien());
    }
}
