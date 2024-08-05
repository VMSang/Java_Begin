package OOP.Basic;

import java.util.Scanner;

public class OOP_B03_Lop_Sinh_Vien {
    private String MSSV, name, Class, birth;
    private float Gpa;

    OOP_B03_Lop_Sinh_Vien() {
        MSSV = "SV001";
    }

//      tạo bằng công cụ
//    public OOP_B03_Lop_Sinh_Vien(String MSSV, String name, String aClass, String birth, float gpa) {
//        this.MSSV = MSSV;
//        this.name = name;
//        Class = aClass;
//        this.birth = birth;
//        Gpa = gpa;
//    }

    public void Input(String ten, String lop, String date, float Diem) {
        name = ten;
        Class = lop;
        birth = date;
        Gpa = Diem;
    }

    public void chuanhoa() {
        StringBuffer sb = new StringBuffer(birth);
        if (sb.charAt(1) == '/') {
            sb.insert(0, "0");
        }
        if (sb.charAt(4) == '/') {
            sb.insert(3, "0");
        }
        birth = sb.toString();
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
        sinhVien1.chuanhoa();
        sinhVien1.printInput();
    }
}
