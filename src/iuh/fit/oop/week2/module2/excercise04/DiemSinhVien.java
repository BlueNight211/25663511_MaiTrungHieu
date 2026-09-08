package iuh.fit.oop.week2.module2.excercise04;

public class DiemSinhVien {
	private int msv;
	private String hoTen;
	private double DiemLT;
	private double DiemTH;
	
	public DiemSinhVien() {
		this(1,"-",0.0,0.0);
	}
	
	public DiemSinhVien(int msv, String hoTen, double diemLT, double diemTH) {
		setMsv(msv);
		setHoTen(hoTen);
		setDiemLT(diemLT);
		setDiemTH(diemTH);
	}

	public int getMsv() {
		return msv;
	}

	public void setMsv(int msv) {
		if (msv <= 0) {
			setMsv(1);
		}
		else {
			this.msv = msv;
		}
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		if (hoTen == null || hoTen.equals("")) {
			setHoTen("-");
		}
		else {
			this.hoTen = hoTen;
		}
	}

	public double getDiemLT() {
		return DiemLT;
	}

	public void setDiemLT(double diemLT) {
		if (DiemLT < 0 || DiemLT > 10) {
			setDiemLT(0.0);
		}
		else {
			DiemLT = diemLT;
		}
	}

	public double getDiemTH() {
		return DiemTH;
	}

	public void setDiemTH(double diemTH) {
		if (DiemTH < 0 || DiemTH > 10) {
			setDiemTH(0.0);
		}
		else {
			DiemTH = diemTH;
		}
	}

	public double TB() {
		return (getDiemLT() + getDiemTH()) / 2;
	}
	
	@Override
	public String toString() {
		return String.format(
				"%-10d %-30s %5.2f %8.2f %8.2f"
				,msv
				,hoTen
				,DiemLT
				,DiemTH
				,TB());
	}
}
