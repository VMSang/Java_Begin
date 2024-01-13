package OOp;

public class chainhua {
	public static void main(String[] args) {
		Product chainhua = new Product();
		chainhua.nhapThongTin("Aquafina", 20000, 0.5);
		chainhua.xuatThongTin(chainhua);
		System.out.println("thue la: " + chainhua.getTaxPrice(chainhua));
	}

}
