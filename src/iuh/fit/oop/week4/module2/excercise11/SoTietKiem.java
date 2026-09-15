package iuh.fit.oop.week4.module2.excercise11;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;


public class SoTietKiem {
  	private String maSo;
	private LocalDate ngayMoSo;
	private double soTienGoi;
	private int kyHan;
	private float laiSuat;
	
	public SoTietKiem(String maSo, LocalDate ngayMbSo, double soTienGoi, int kyHan, float laiSuat) {
		this.maSo = maSo;
		this.ngayMoSo = ngayMbSo;
		this.soTienGoi = soTienGoi;
		this.kyHan = kyHan;
		this.laiSuat = laiSuat;
	}

	public String getMaSo() {
		return maSo;
	}

	public void setMaSo(String maSo) {
		this.maSo = maSo;
	}

	public LocalDate getNgayMoSo() {
		return ngayMoSo;
	}

	public void setNgayMoSo(LocalDate ngayMoSo) {
		this.ngayMoSo = ngayMoSo;
	}

	public double getSoTienGoi() {
		return soTienGoi;
	}

	public void setSoTienGoi(double soTienGoi) {
		this.soTienGoi = soTienGoi;
	}

	public int getKyHan() {
		return kyHan;
	}

	public void setKyHan(int kyHan) {
		this.kyHan = kyHan;
	}

	public float getLaiSuat() {
		return laiSuat;
	}

	public void setLaiSuat(float laiSuat) {
		this.laiSuat = laiSuat;
	}
	
	public int tinhSoThangGoiThuc() {
		Period age = Period.between(ngayMoSo, LocalDate.now());
		int dt_nam = age.getYears();
		int dt_thang = age.getMonths();
		int soThangGoi = dt_nam * 12 + dt_thang;
		if (soThangGoi % kyHan == 0) {
			return soThangGoi;
		} else {
			return soThangGoi / kyHan * kyHan;
		}
	}
	s
	public double tinhTienLai() {
		return soTienGoi * laiSuat * tinhSoThangGoiThuc();
	}
	
	@Override
	public String toString() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		return String.format(
				"STK %s[%s-%s]KH %d tháng"
				+ ", số tháng tính lãi: %d, ls %.3f"
				+ ", số tiền:%s --> Tiền lãi: %s"
				,maSo
				,dtf.format(ngayMoSo)
				,dtf.format(LocalDate.now())
				,kyHan 
                ,tinhSoThangGoiThuc() 
                ,laiSuat 
                ,df.format(soTienGoi) 
                ,df.format(tinhTienLai()));
	}
}
