package iuh.fit.oop.week2.module2.excercise06;


public class ThongTinDangKyXe {
	private String chuXe;
	private String loaiXe;
	private double triGiaXe;
	private int dungTich;

	public ThongTinDangKyXe() {
		this("Chưa xác định","Chưa xác định",0,0);
	}
	
	public ThongTinDangKyXe(String chuXe, String loaiXe, double triGiaXe, int dungTich) {
		setChuXe(chuXe);
		setLoaiXe(loaiXe);
		setTriGiaXe(triGiaXe);
		setDungTich(dungTich);
	}

	public String getChuXe() {
		return chuXe;
	}

	public void setChuXe(String chuXe) {
		if (chuXe == null || chuXe.trim().isEmpty()) {
			this.chuXe = "Chưa xác định";
		}
		else {
			this.chuXe = chuXe;
		}
	}

	public String getLoaiXe() {
		return loaiXe;
	}

	public void setLoaiXe(String loaiXe) {
		if (loaiXe == null || loaiXe.trim().isEmpty()) {
			this.loaiXe = "Chưa xác định";
		}
		else {
			this.loaiXe = loaiXe;
		}
	}

	public double getTriGiaXe() {
		return triGiaXe;
	}

	public void setTriGiaXe(double triGiaXe) {
		if (triGiaXe < 0) {
			throw new IllegalArgumentException("Lỗi: Trị giá xe không được nhỏ hơn 0");
		}
		else {
			this.triGiaXe = triGiaXe;
		}
	}

	public int getDungTich() {
		return dungTich;
	}

	public void setDungTich(int dungTich) {
		if (dungTich < 0) {
			throw new IllegalArgumentException("Lỗi: Dung tích xylanh không được nhỏ hơn 0");
		}
		this.dungTich = dungTich;
	}
	
	public double tinhThueTruocBa() {
		if (dungTich <= 100) {
			return triGiaXe*0.01;
		} 
		else if (dungTich <= 200) {
			return triGiaXe*0.03;
		}
		else return triGiaXe*0.05;
	}
	
	@Override
	public String toString() {
		return String.format("%-22s %-15s %12d %20.2f %20.2f"
				,chuXe
				,loaiXe
				,dungTich
				,triGiaXe
				,tinhThueTruocBa());
	}
	
}
