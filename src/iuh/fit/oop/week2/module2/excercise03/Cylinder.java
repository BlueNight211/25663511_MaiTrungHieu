package iuh.fit.oop.week2.module2.excercise03;

public class Cylinder {
	private double bankinh;
	private double chieucao;
	
	public Cylinder() {
		this (0.0,0.0);
	}
	
	public Cylinder(double bankinh, double chieucao) {
		setBankinh(bankinh);
		setChieucao(chieucao);
	}
	
	public double getBankinh() {
		return bankinh;
	}

	public void setBankinh(double bankinh) {
		if(bankinh< 0) {
			setBankinh(0.0);
		}
		else {
			this.bankinh = bankinh;
		}
	}

	public double getChieucao() {
		return chieucao;
	}

	public void setChieucao(double chieucao) {
		if(chieucao < 0) {
			setChieucao(0.0);
		}
		else {
			this.chieucao = chieucao;
		}
	}

	@Override
	public String toString() {
		return String.format("Chieu cao: %.2f - Ban kinh: %.2f"
				,bankinh
				,chieucao);
	}
	private double chuViDay() {
		return 2 * bankinh * Math.PI;
	}
	
	private double dienTichDay() {
		return Math.pow(bankinh, 2) * Math.PI;
	}
	
	public double dienTichXungQuanh() {
		return chieucao * 2 * chuViDay();
	}
	
	public double dienTichToanPhan() {
		return dienTichXungQuanh() * 2 * dienTichDay();
	}
	
	public double theTich() {
		return dienTichDay() * chieucao;
	}
}
