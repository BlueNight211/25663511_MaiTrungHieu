package iuh.fit.oop.week4.module2.excercise10;

public class SinhVien {
	private String maSV;
	private String hoTen;
	
	public SinhVien(String maSV, String hoTen) {
		setMaSV(maSV);
		setHoTen(hoTen);
	}

	public String getMaSV() {
		return maSV;
	}

	public void setMaSV(String maSV) {
		if (maSV == null || maSV.isEmpty()) {
			this.maSV = "-";
		}
		this.maSV = maSV;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		if (hoTen == null || hoTen.isEmpty()) {
			this.hoTen = "-";
		}
		this.hoTen = hoTen;
	}
	
	@Override
	public String toString() {
		return String.format(
				"%s | %s"
				,maSV
				,hoTen);
	}
}
