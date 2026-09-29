package iuh.fit.oop.week6.module3.excercise02;

public enum TinhTrang {
	NEW("Mới"),
	OLD("Cũ");
	
	private String c;
	
	TinhTrang(String c) {
		this.c = c;
	}
	
	public String getC() {
		return c;
	}
}
