package iuh.fit.oop.week2.module2.excercise07;

import java.time.LocalDate;

public class App {
	public static void main(String[] args) {
        HangThucPham htp1 = null;
        HangThucPham htp2 = null;
        HangThucPham htp3 = null;

        try {
            htp1 = new HangThucPham("001", "Gạo", 100000, 
                    LocalDate.of(2018, 7, 10), 
                    LocalDate.of(2018, 7, 10));
            htp2 = new HangThucPham("002", "Mì", 5000, 
                    LocalDate.of(2018, 3, 1), 
                    LocalDate.of(2018, 9, 1));
            htp3 = new HangThucPham("003", "Nước", 10000, 
                    LocalDate.of(2017, 3, 1), 
                    LocalDate.of(2018, 3, 1));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.printf("%-10s %-15s %18s %15s %15s %11s\n", 
                "Mã_Hàng", "Tên_Hàng", "Đơn_Giá", "Ngày_Sản_Xuất", "Ngày_Hết_Hạn", "Ghi_Chú");
        System.out.println("-----------------------------------------------------------------------------------------------");

        if (htp1 != null) System.out.println(htp1);
        if (htp2 != null) System.out.println(htp2);
        if (htp3 != null) System.out.println(htp3);
    }
}
