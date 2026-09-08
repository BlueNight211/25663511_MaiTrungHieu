package iuh.fit.oop.week2.module2.excercise04;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		DiemSinhVien sv1 = null;
		DiemSinhVien sv2 = null;
		DiemSinhVien sv3 = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập mã số của sinh viên sv3:");
		int masv = Integer.parseInt(sc.nextLine());
		System.out.println("Nhập họ và tên của sinh viên sv3:");
		String hoten = sc.nextLine();
		System.out.println("Nhập điểm lý thuyết của sinh viên sv3:");
		double diemlt = Double.parseDouble(sc.nextLine());
		System.out.println("Nhập điểm thực hành của sinh viên sv3:");
		double diemth = Double.parseDouble(sc.nextLine());
		try {
			sv1 = new DiemSinhVien(25663511,"Mai Trung Hiếu",8.5,8.0);
			sv2 = new DiemSinhVien(23654312,"Võ Hoàng Hải",7.5,8.5);
			sv3 = new DiemSinhVien(masv,hoten,diemlt,diemth);
		} catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		System.out.printf("%-10s %-27s %8s %8s %8s\n",
				"masv","hoten","diemlt","diemth","diemtb");
		System.out.println(sv1);
		System.out.println(sv2);
		System.out.println(sv3);
		sc.close();
	}
}
