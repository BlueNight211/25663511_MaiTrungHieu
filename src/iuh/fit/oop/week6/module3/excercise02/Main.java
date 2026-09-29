package iuh.fit.oop.week6.module3.excercise02;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		ArrayList<Sach> ds = new ArrayList<>();
		ds.add(new SachGiaoKhoa(
				"SGK01", LocalDate.of(2026, 1, 10), 20000.0, 100, "A", TinhTrang.NEW));
		ds.add(new SachGiaoKhoa(
				"SGK02", LocalDate.of(2026, 1, 12), 30000.0, 50, "B", TinhTrang.OLD));
	    ds.add(new SachGiaoKhoa(
	            "SGK03", LocalDate.of(2026, 2, 5), 25000.0, 80, "C", TinhTrang.NEW));
	
	    ds.add(new SachThamKhao(
	            "STK01", LocalDate.of(2026, 1, 15), 40000, 30, "A", 50000));
	    ds.add(new SachThamKhao(
	            "STK02", LocalDate.of(2026, 2, 1), 50000, 20, "B", 40000));
	    ds.add(new SachThamKhao(
	            "STK03", LocalDate.of(2026, 2, 10), 35000, 40, "C", 30000));
	    
	    double tienSachGiaoKhoa = 0;
	    double tienSachThamKhao = 0;
	    Sach sachThanhTienCaoNhat = null;
	    
	    for (Sach s : ds) {
	    	if (s instanceof SachGiaoKhoa) {
	    		tienSachGiaoKhoa += s.thanhTien();
	    	} else if (s instanceof SachThamKhao){
	    		tienSachThamKhao += s.thanhTien();
	    	}
	    }
	    
	    for (Sach s : ds) {
	    	if (sachThanhTienCaoNhat == null || 
	    			sachThanhTienCaoNhat.thanhTien() < s.thanhTien()) {
	    		sachThanhTienCaoNhat = s;
	    	}
	    }
	    
	    System.out.printf("Tổng thành tiền sách giáo khoa: %.2f%n",
                tienSachGiaoKhoa);
	    System.out.printf("Tổng thành tiền sách tham khảo: %.2f%n",
                tienSachThamKhao);

	    Scanner sc = new Scanner(System.in);
	    System.out.print("Nhập tên nhà xuất bản cần tìm: ");
	    
	    String nxbCanTim = sc.nextLine().trim();
	    System.out.println("Sách giáo khoa của nhà xuất bản " + nxbCanTim + ":");
	    
	    boolean timThay = false;

	    for (Sach sach : ds) {
	    	if (sach instanceof SachGiaoKhoa
	    			&& sach.getNhaXuatBan().equalsIgnoreCase(nxbCanTim)) {
	    		System.out.println(sach);
	    		timThay = true;
	    	}
	    }

	    if (!timThay) {
	    	System.out.println("Không tìm thấy sách phù hợp.");
	    }

	    System.out.println("Sách có thành tiền cao nhất:");
	    if (sachThanhTienCaoNhat != null) {
	    	System.out.println(sachThanhTienCaoNhat);
	    }

	    sc.close();
	}
}
