package iuh.fit.oop.week2.module2.excercise02;

public class Point {
	private String ten;
	private double x;
	private double y;
	
	public Point() {
		this("O",0.0,0.0);
	}
	
	public Point(String ten, double x, double y) {
		setTen(ten);
		setX(x);
		setY(y);
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		if(ten == null || ten.equals("")) {
			setTen("-");
		}
		else{
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
	
	public void negate() {
		setTen(getTen() + '\'');
		setX(-getX());
		setY(-getY());
	}
	
	public double getDistance() {
		return Math.sqrt(getX() * getX() + getY() * getY());
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
