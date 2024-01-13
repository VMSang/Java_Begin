package lab04chatgpt;

public class SubEmployee {
	public static void main(String[] args) {
		Employee nhanvien01 = new Employee();
		Employee nv01 = nhanvien01.nhapThongTin();
		nhanvien01.xuatThongtin(nv01);
	}
}