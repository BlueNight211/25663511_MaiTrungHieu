package iuh.fit.oop.week6.module3.excercise01;

public class ChuyenXeNgoaiThanh extends ChuyenXe {
	private String noiDen;
	private int soNgayDiDuoc;
	
	public ChuyenXeNgoaiThanh(String maChuyen, String hoTenTaiXe, String soXe, double doanhThu, String noiDen,
			int soNgayDiDuoc) {
		super(maChuyen, hoTenTaiXe, soXe, doanhThu);
		setNoiDen(noiDen);
		setSoNgayDiDuoc(soNgayDiDuoc);
	}

	public String getNoiDen() {
		return noiDen;
	}

	public void setNoiDen(String noiDen) {
		this.noiDen = noiDen;
	}

	public int getSoNgayDiDuoc() {
		return soNgayDiDuoc;
	}

	public void setSoNgayDiDuoc(int soNgayDiDuoc) {
		this.soNgayDiDuoc = soNgayDiDuoc;
	}
	
	@Override
	public String getThongTinBoSung() {
		return String.format(
				 "Loại: Ngoại thành | Nơi đến: %-11s | Số ngày đi được: %d",
				 noiDen, 
				 soNgayDiDuoc);
	}
}
