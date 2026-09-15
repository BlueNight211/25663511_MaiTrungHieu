package iuh.fit.oop.week4.module2.excercise09;

public class HinhTron {
	private ToaDo tam;
	private double banKinh;
	
	public HinhTron() {
		this(new ToaDo(),0);
	}
	
	public HinhTron(ToaDo tam, double banKinh) {
		setTam(tam);
		setBanKinh(banKinh);
	}

	public ToaDo getTam() {
		return tam;
	}

	public void setTam(ToaDo tam) {
		this.tam = tam;
	}

	public double getBanKinh() {
		return banKinh;
	}

	public void setBanKinh(double banKinh) {
		this.banKinh = banKinh;
	}
	
	public double tinhChuVi() {
		return banKinh*2*Math.PI;
	}
	
	public double tinhDienTich() {
		return banKinh*banKinh*Math.PI;
	}
	
	@Override
	public String toString() {
		return String.format(
				"Diện tích và chu vi hìnsh tròn tâm %s có bán kính %sm là %.2f và %.2f"
				,tam.toString()
				,banKinh
				,tinhDienTich()
				,tinhChuVi());
	}
}
