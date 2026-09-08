package iuh.fit.oop.week2.module2.excercise03;

public class App {
	public static void main(String[] args) {
		Cylinder hinhtru1 = null;
		Cylinder hinhtru2 = null;
		Cylinder hinhtru3 = null;
		try {
			hinhtru1 = new Cylinder(-3,8);
			hinhtru2 = new Cylinder(7,-6);
			hinhtru3 = new Cylinder(4.8,2.5);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		System.out.printf("Dien tich xung quanh cua hinh tru:\n"
				+ "Hinh tru 1: %.2f\n"
				+ "Hinh tru 2: %.2f\n"
				+ "Hinh tru 3: %.2f\n",
				hinhtru1.dienTichXungQuanh(),
				hinhtru2.dienTichXungQuanh(),
				hinhtru3.dienTichXungQuanh());
		System.out.printf("Dien tich toan phan cua hinh tru:\n"
				+ "Hinh tru 1: %.2f\n"
				+ "Hinh tru 2: %.2f\n"
				+ "Hinh tru 3: %.2f\n",
				hinhtru1.dienTichToanPhan(),
				hinhtru2.dienTichToanPhan(),
				hinhtru3.dienTichToanPhan());
		System.out.printf("The tich cua hinh tru:\n"
				+ "Hinh tru 1: %.2f\n"
				+ "Hinh tru 2: %.2f\n"
				+ "Hinh tru 3: %.2f\n",
				hinhtru1.theTich(),
				hinhtru2.theTich(),
				hinhtru3.theTich());
	}
}
