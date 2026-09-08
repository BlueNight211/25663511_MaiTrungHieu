package iuh.fit.oop.week2.module2.excercise08;

public class App {
	public static void main(String[] args) {
		Account acc1 = null;
		Account acc2 = null;
		Account acc3 = null;
		try {
			acc1 = new Account(72354, "Ted Murphy", 100000);
	        acc2 = new Account(69713, "Jane Smith", 40000);
	        acc3 = new Account(93757, "Edward Demsey", 700000);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}

        System.out.println("--- THÔNG TIN KHỞI TẠO BAN ĐẦU ---");
        inTieuDe();
        System.out.println(acc1);
        System.out.println(acc2);
        System.out.println(acc3);

        acc1.deposit(250000);
        
        acc2.deposit(500000);
        acc2.withdraw(430000, 2000);

        acc3.addInterest();

        System.out.println("\n--- THÔNG TIN SAU KHI GIAO DỊCH (Gửi, Rút, Tính Lãi) ---");
        inTieuDe();
        System.out.println(acc1);
        System.out.println(acc2);
        System.out.println(acc3);

        System.out.println("\nĐang thực hiện chuyển 100.000đ từ Jane Smith sang Ted Murphy...");
        boolean isTransferSuccess = acc2.transfer(acc1, 100000);
        
        if (isTransferSuccess) {
            System.out.println("Chuyển tiền thành công!");
        } else {
            System.out.println("Chuyển tiền thất bại (Số dư không đủ).");
        }
        System.out.println("\n--- THÔNG TIN SAU KHI CHUYỂN TIỀN ---");
        inTieuDe();
        System.out.println(acc1);
        System.out.println(acc2);
    }

    private static void inTieuDe() {
        System.out.printf("%-15s %-25s %20s\n", "Số Tài Khoản", "Tên Khách Hàng", "Số Dư");
        System.out.println("---------------------------------------------------------------");
    }
}
