package iuh.fit.oop.week2.module2.excercise05;

public class App {
	public static void main(String[] args) {
		HinhTamGiac h1 = null;
		HinhTamGiac h2 = null;
		HinhTamGiac h3 = null;
		HinhTamGiac h4 = null;
		HinhTamGiac h5 = null;
		try {
			h1 = new HinhTamGiac(-3,4,5);
			h2 = new HinhTamGiac(1,2,4);
			h3 = new HinhTamGiac(2,6,7);
			h4 = new HinhTamGiac(4,4,3);
			h5 = new HinhTamGiac(4,4,4);
		} catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		System.out.printf("%-8s %-8s %-8s %-22s %-10s %-10s\n", 
                "Cạnh a","Cạnh b","Cạnh c","Kiểu tam giác"
                ,"Chu vi", "Diện tích");
		System.out.println(h1);
		System.out.println(h2);
		System.out.println(h3);
		System.out.println(h4);
		System.out.println(h5);
		
	}
}