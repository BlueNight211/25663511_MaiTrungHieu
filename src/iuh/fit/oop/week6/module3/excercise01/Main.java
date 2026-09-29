package iuh.fit.oop.week6.module3.excercise01;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList<ChuyenXe> cx = new ArrayList<>();
		
		cx.add(new ChuyenXeNoiThanh(
				"CX1","Nguyễn Văn A","51A-12345",5,28,40));
		
		cx.add(new ChuyenXeNoiThanh(
				"CX2","Trần Văn B","51B-67890",7,31,54));
		
		cx.add(new ChuyenXeNgoaiThanh(
				"CX3","Lê Văn Cường","50A-11111",10,"Đà Nẵng",3));
		
		cx.add(new ChuyenXeNgoaiThanh(
				"CX4","Phạm Văn Dũng","50B-22222",20,"Hà Nội",5));
		
		double tongDoanhThu = 0;
        double doanhThuNoiThanh = 0;
        double doanhThuNgoaiThanh = 0;
		
		for (ChuyenXe xe : cx) {
			System.out.println(xe);
			
			tongDoanhThu += xe.getDoanhThu();
			
			if (xe instanceof ChuyenXeNgoaiThanh) {
				doanhThuNoiThanh += xe.getDoanhThu();
			} else {
				doanhThuNgoaiThanh += xe.getDoanhThu();
			}
		}
		System.out.println("Tổng doanh thu cho tất cả các chuyến xe: " + tongDoanhThu);
		System.out.println("Tổng doanh thu cho chuyến xe nội thành: " + doanhThuNoiThanh);
		System.out.println("Tổng doanh thu cho chuyến xe ngoại thành:" + doanhThuNgoaiThanh);
	}
}
