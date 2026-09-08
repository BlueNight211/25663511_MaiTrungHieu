package iuh.fit.oop.week2.module2.excercise02;

public class App {
	public static void main(String[] args) {
		Point diemA = null;
		try {
			diemA = new Point("",3.5,5);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		System.out.println(diemA);
		diemA.negate();
		System.out.println("Diem doi xung cua A qua O:" + diemA);
		System.out.printf("Khoang cach tu %s den goc O: %.2f",diemA.getTen(),diemA.getDistance());
	}
}
