package iuh.fit.oop.week6.module3.excercise01;

public abstract class ChuyenXe {
	protected String maChuyen;
	protected String hoTenTaiXe;
	protected String soXe;
	protected double doanhThu;
	
	public ChuyenXe(String maChuyen, String hoTenTaiXe, String soXe, double doanhThu) {
		setMsChuyen(maChuyen);
		setHoTenTaiXe(hoTenTaiXe);
		setSoXe(soXe);
		setDoanhThu(doanhThu);
	}

	public String getMaChuyen() {
		return maChuyen;
	}

	public void setMsChuyen(String maChuyen) {
		this.maChuyen = maChuyen;
	}

	public String getHoTenTaiXe() {
		return hoTenTaiXe;
	}

	public void setHoTenTaiXe(String hoTenTaiXe) {
		this.hoTenTaiXe = hoTenTaiXe;
	}

	public String getSoXe() {
		return soXe;
	}

	public void setSoXe(String soXe) {
		this.soXe = soXe;
	}

	public double getDoanhThu() {
		return doanhThu;
	}

	public void setDoanhThu(double doanhThu) {
		this.doanhThu = doanhThu;
	}

	protected String thongTinChung() {
        return String.format(
                "Mã chuyến: %-3s | Tài xế: %-14s | Số xe: %-10s | Doanh thu: %-6.2f",
                maChuyen, hoTenTaiXe, soXe, doanhThu
        );
    }

    public abstract String getThongTinBoSung();

    @Override
    public String toString() {
        return thongTinChung() + " | " + getThongTinBoSung();
    }
}
