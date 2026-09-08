package iuh.fit.oop.week2.module2.excercise01;

public class App {
	public static void main(String[] args) {
		ToaDo diemA = null;
		ToaDo diemB = null;
		try {
			diemA = new ToaDo("",3.5,5);
			diemB = new ToaDo("B",-6,-5.5);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		System.out.println(diemA.getThongTin());
		System.out.println(diemB);
	}
}
