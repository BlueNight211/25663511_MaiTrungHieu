package iuh.fit.oop.week4.module2.excercise10;

public class LopHocPhan {
	private String maLHP;
	private String tenLHP;
	private String tenGV;
	private String thongTinLopHoc;
	private SinhVien[] dsSV;
	
	public LopHocPhan(String maLHP, String tenLHP, String tenGV, String thongTinLopHoc, SinhVien[] dsSV) {
		this.maLHP = maLHP;
		this.tenLHP = tenLHP;
		this.tenGV = tenGV;
		this.thongTinLopHoc = thongTinLopHoc;
		this.dsSV = dsSV;
	}

	public String getMaLHP() {
		return maLHP;
	}

	public void setMaLHP(String maLHP) {
		this.maLHP = maLHP;
	}

	public String getTenLHP() {
		return tenLHP;
	}

	public void setTenLHP(String tenLHP) {
		this.tenLHP = tenLHP;
	}

	public String getTenGV() {
		return tenGV;
	}

	public void setTenGV(String tenGV) {
		this.tenGV = tenGV;
	}

	public String getThongTinLopHoc() {
		return thongTinLopHoc;
	}

	public void setThongTinLopHoc(String thongTinLopHoc) {
		this.thongTinLopHoc = thongTinLopHoc;
	}

	public SinhVien[] getDsSV() {
		return dsSV;
	}

	public void setDsSV(SinhVien[] dsSV) {
		this.dsSV = dsSV;
	}
	
	public int getSoLuongSV() {
		if (dsSV == null) {
			return 0;
		}
		return dsSV.length;
	}
	
	@Override
	public String toString() {
		return String.format(
				"- Mã LHP: %s\n"
				+ "- Tên LHP: %s\n"
				+ "- GV giảng dạy: %s\n"
				+ "- Thông tin buổi học: %s\n"
				,maLHP
				,tenLHP
				,tenGV
				,thongTinLopHoc);
	}
}
