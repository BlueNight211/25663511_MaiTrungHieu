package iuh.fit.oop.week6.module3.excercise03;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList<GiaoDich> ds = new ArrayList<>();
		
		ds.add(new GiaoDichVang(
                "V001", LocalDate.of(2026, 9, 1), 80_000_000, 2, "Vàng 24K"));
        ds.add(new GiaoDichVang(
                "V002", LocalDate.of(2026, 9, 3), 82_000_000, 1, "Vàng 18K"));
        ds.add(new GiaoDichVang(
                "V003", LocalDate.of(2026, 9, 5), 81_000_000, 3, "Vàng 24K"));

        ds.add(new GiaoDichTienTe(
                "T001", LocalDate.of(2026, 9, 2), 24_500, 1000, 1, LoaiTien.VND));
        ds.add(new GiaoDichTienTe(
                "T002", LocalDate.of(2026, 9, 4), 25_000, 500, 25_000, LoaiTien.USD));
        ds.add(new GiaoDichTienTe(
                "T003", LocalDate.of(2026, 9, 6), 27_000, 300, 27_000, LoaiTien.EURO));
        
        int tongSoLuongVang = 0;
        int tongSoLuongTienTe = 0;
        double tongThanhTienTienTe = 0;
        int soGiaoDichTienTe = 0;

        System.out.println("Các giao dịch có đơn giá lớn hơn 1 tỷ:");

        for (GiaoDich gd : ds) {
            if (gd instanceof GiaoDichVang) {
                tongSoLuongVang += gd.getSoLuong();
            } else if (gd instanceof GiaoDichTienTe) {
                tongSoLuongTienTe += gd.getSoLuong();
                tongThanhTienTienTe += gd.thanhTien();
                soGiaoDichTienTe++;
            }

            if (gd.getDonGia() > 1_000_000_000) {
                System.out.println(gd);
            }
        }

        double trungBinhTienTe = soGiaoDichTienTe == 0
                ? 0
                : tongThanhTienTienTe / soGiaoDichTienTe;

        System.out.println("Tổng số lượng giao dịch vàng: " + tongSoLuongVang);
        System.out.println("Tổng số lượng giao dịch tiền tệ: " + tongSoLuongTienTe);
        System.out.printf("Trung bình thành tiền giao dịch tiền tệ: %.1f%n",
                          trungBinhTienTe);
	}
}
