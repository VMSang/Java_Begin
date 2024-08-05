package OOP.Basic;

import java.util.Scanner;

public class OOP_B04_Lop_Nhan_Vien_1 {
    private final String MS = "0001";
    private String name;
    private String gender;
    private String birth;
    private String hometown;
    private String MST;
    private String dateSign;

    public OOP_B04_Lop_Nhan_Vien_1(String name, String gender, String birth, String hometown, String MST, String dateSign) {
        this.name = name;
        this.gender = gender;
        this.birth = birth;
        this.hometown = hometown;
        this.MST = MST;
        this.dateSign = dateSign;
    }

    public String toString() {
        return MS + " " + name + " " + gender + " " + birth + " " + hometown + " " + dateSign;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        OOP_B04_Lop_Nhan_Vien_1 nv = new OOP_B04_Lop_Nhan_Vien_1(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
        System.out.println(nv);
    }
}
