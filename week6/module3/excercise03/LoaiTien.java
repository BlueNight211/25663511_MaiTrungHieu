package iuh.fit.oop.week6.module3.excercise03;

public enum LoaiTien {
	VND("Tiền Việt Nam"),
	USD("Tiền USD"),
	EURO("Tiền Euro");
	
	private String c;
	
	LoaiTien(String c){
		this.c = c;
	}
	
	public String getC() {
		return c;
	}
}
