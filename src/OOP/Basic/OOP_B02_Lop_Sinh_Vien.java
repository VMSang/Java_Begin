package OOP.Basic;

import java.util.Scanner;

public class OOP_B02_Lop_Sinh_Vien {
    private final String name, ngayThangNam;
    private final float Diem1, Diem2, Diem3;

    OOP_B02_Lop_Sinh_Vien(String ten_sv, String ngayThangNam_sv, float Diem1_sv, float Diem2_sv, float Diem3_sv) {
        name = ten_sv;
        ngayThangNam = ngayThangNam_sv;
        Diem1 = Diem1_sv;
        Diem2 = Diem2_sv;
        Diem3 = Diem3_sv;
    }

    public void printInfor() {
        System.out.print(name + " " + ngayThangNam + " ");
        System.out.printf("%.1f", Diem1 + Diem2 + Diem3);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        OOP_B02_Lop_Sinh_Vien SinhVien1 = new OOP_B02_Lop_Sinh_Vien(sc.nextLine(), sc.nextLine(), sc.nextFloat(), sc.nextFloat(), sc.nextFloat());
        SinhVien1.printInfor();
    }
}
