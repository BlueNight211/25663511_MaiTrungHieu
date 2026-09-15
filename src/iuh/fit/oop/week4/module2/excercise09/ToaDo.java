package iuh.fit.oop.week4.module2.excercise09;

public class ToaDo {
	private String ten;
	private float x;
	private float y;
	
	public ToaDo() {
		this ("-",0,0);
	}
	
	public ToaDo(String ten, float x, float y) {
		setTen(ten);
		setX(x);
		setY(y);
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		if (ten == null || ten.isEmpty()) {
			this.ten = "-";
		}
		this.ten = ten;
	}

	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}
	
	@Override
	public String toString() {
		return String.format(
				"%s(%.f,%.f)"
				,ten
				,x
				,y);
	}
}	
