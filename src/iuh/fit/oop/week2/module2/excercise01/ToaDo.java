package iuh.fit.oop.week2.module2.excercise01;

public class ToaDo {
	private String ten;
	private double x;
	private double y;
	
	public ToaDo() {
		this("-",0.0,0.0);
	}
	
	public ToaDo(String ten, double x, double y) {
		setTen(ten);
		setX(x);
		setY(y);
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		if (ten.equals("") || ten == null) {
			setTen("-");
		}
		else {
			this.ten = ten;
		}
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	
	public String getThongTin() {
		return ten + "(" + x + "," + y + ")";
	}
	
	@Override
	public String toString() {
		return String.format(
				"%s(%.2f,%.2f)"
				,ten
				,x
				,y);
	}
	
}	
	