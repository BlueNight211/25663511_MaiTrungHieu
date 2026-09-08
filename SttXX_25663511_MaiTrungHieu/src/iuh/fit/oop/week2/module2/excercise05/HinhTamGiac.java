package iuh.fit.oop.week2.module2.excercise05;

public class HinhTamGiac {
	private double ma;
	private double mb;
	private double mc;
	
	public boolean laTamGiac (double a,double b,double c) {
		return (a > 0 && b > 0 && c > 0) && 
	           (a + b > c) && (a + c > b) && (b + c > a);
	}
	
	public HinhTamGiac() {
		this(0.0,0.0,0.0);
	}
	
	public HinhTamGiac(double ma, double mb, double mc) {
		setMa(ma);
		setMb(mb);
		setMc(mc);
	}

	public double getMa() {
		return ma;
	}

	public void setMa(double ma) {
		if(laTamGiac(ma,getMb(),getMc())) {
			setMa(0.0);
		}
		this.ma = ma;
	}

	public double getMb() {
		return mb;
	}

	public void setMb(double mb) {
		if(laTamGiac(mb,getMa(),getMc())) {
			setMa(0.0);
		}
		this.mb = mb;
	}

	public double getMc() {
		return mc;
	}

	public void setMc(double mc) {
		if(laTamGiac(mc,getMa(),getMb())) {
			setMc(0.0);
		}
		this.mc = mc;
	}
	
	public String kieuTamGiac() {
		if (!laTamGiac(ma,mb,mc)) {
			return "không phải tam giác";
		}
		if (ma == mb && mb == mc) {
			return "đều";
		}
		if (ma == mb || ma == mc || mb == mc) {
			return "cân";
		}
		return "thường";
	}
	
	public double chuVi() {
		if (!laTamGiac(ma,mb,mc)) {
			return 0;
		}
		return ma + mb + mc;
	}
	public double dienTich() {
		if (!laTamGiac(ma,mb,mc)) {
			return 0;
		}
		double p = chuVi() / 2;
		return Math.sqrt(p * (p-ma) * (p-mb) * (p-mc)); 
	}
	@Override
	public String toString() {
		return String.format(
				"%-8.2f %-8.2f %-8.2f %-22s %-10.2f %-10.2f"
				,ma
				,mb
				,mc
				,kieuTamGiac()
				,chuVi()
				,dienTich());
	}
}
