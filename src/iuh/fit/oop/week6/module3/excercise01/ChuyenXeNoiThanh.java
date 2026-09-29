package iuh.fit.oop.week6.module3.excercise01;

public class ChuyenXeNoiThanh extends ChuyenXe {
	private int soTuyen;
	private double soKmDiDuoc;
	
	public ChuyenXeNoiThanh(String maChuyen, String hoTenTaiXe, String soXe, double doanhThu, int soTuyen,
			double soKmDiDuoc) {
		super(maChuyen, hoTenTaiXe, soXe, doanhThu);
		setSoTuyen(soTuyen);
		setSoKmDiDuoc(soKmDiDuoc);
	}

	public int getSoTuyen() {
		return soTuyen;
	}

	public void setSoTuyen(int soTuyen) {
		this.soTuyen = soTuyen;
	}

	public double getSoKmDiDuoc() {
		return soKmDiDuoc;
	}

	public void setSoKmDiDuoc(double soKmDiDuoc) {
		this.soKmDiDuoc = soKmDiDuoc;
	}
	
	@Override
	public String getThongTinBoSung() {
		 return String.format(
				 "Loại: Nội thành   | Số tuyến: %-10d | Số km: %.2f",
				 soTuyen, 
				 soKmDiDuoc);
	}
}
