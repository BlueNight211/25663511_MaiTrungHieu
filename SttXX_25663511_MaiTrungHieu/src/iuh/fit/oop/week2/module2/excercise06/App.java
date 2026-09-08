package iuh.fit.oop.week2.module2.excercise06;

public class App {
	public static void main(String[] args) {
		ThongTinDangKyXe[] danhSachXe = new ThongTinDangKyXe[3];
		try {
			danhSachXe[0] = new ThongTinDangKyXe("Nguyễn Thu Loan", "Future Neo", 35000000.00, 100);
			danhSachXe[1] = new ThongTinDangKyXe("Lê Minh Tính", "Ford Ranger", 250000000.00, 3000);
			danhSachXe[2] = new ThongTinDangKyXe("Nguyễn Minh Triết", "Landscape", 1000000000.00, 1500);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
			return;
		}
		System.out.printf("%-22s %-15s %12s %20s %20s\n", 
                "Tên chủ xe", "Loại xe", "Dung tích", "Trị giá", "Thuế phải nộp");
        System.out.println("===============================================================================================");
        
        for (ThongTinDangKyXe xe : danhSachXe) {
        	if (xe != null) {
        		System.out.println(xe);
        	}
        }
	}
}
