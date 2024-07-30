package OOP;

import java.util.Scanner;

public class OOP_B03_Lop_Sinh_Vien {
    private String MSSV, name, Class, birth;
    private float Gpa;

    OOP_B03_Lop_Sinh_Vien() {
        MSSV = "SV001";
    }

    public void Input(String ten, String lop, String date, float Diem) {
        name = ten;
        Class = lop;
        birth = date;
        Gpa = Diem;
    }

    public void printInput() {
        System.out.print(MSSV + " ");
        System.out.print(name + " ");
        System.out.print(Class + " ");
        System.out.print(birth + " ");
        System.out.printf("%.1f", Gpa);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        OOP_B03_Lop_Sinh_Vien sinhVien1 = new OOP_B03_Lop_Sinh_Vien();
        sinhVien1.Input(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextFloat());
        sinhVien1.printInput();
    }
}
