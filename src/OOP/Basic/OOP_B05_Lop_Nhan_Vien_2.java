package OOP.Basic;

import java.util.Scanner;

public class OOP_B05_Lop_Nhan_Vien_2 {
    private final String MNV = "00001";
    private String name;
    private String gender;
    private String birth;
    private String hometown;
    private String MST;
    private String dateSign;

    public OOP_B05_Lop_Nhan_Vien_2(String name, String gender, String birth, String hometown, String MST, String dateSign) {
        this.name = name;
        this.gender = gender;
        this.birth = birth;
        this.hometown = hometown;
        this.MST = MST;
        this.dateSign = dateSign;
    }

    public void chuanHoaTen() {
        String[] arr = this.name.split("\\s+");
        String newArr = "";
        for (String x : arr) {
            newArr += Character.toUpperCase(x.charAt(0));
            for (int i = 1; i < x.length(); i++) {
                newArr += Character.toLowerCase(x.charAt(i));
            }
            newArr += " ";
        }
        this.name = newArr.trim();
    }

    public void chuanhoaNgaySinh() {
        StringBuilder sb = new StringBuilder(this.birth);
        if (sb.charAt(1) == '/') sb.insert(0, "0");
        if (sb.charAt(4) == '/') sb.insert(3, "0");
        this.birth = sb.toString();
    }

    public void chuanhoaSign() {
        StringBuilder sb = new StringBuilder(this.dateSign);
        if (sb.charAt(1) == '/') sb.insert(0, "0");
        if (sb.charAt(4) == '/') sb.insert(3, "0");
        this.dateSign = sb.toString();
    }

    @Override
    public String toString() {
        return MNV + " " + name + " " + gender + " " + birth + " " + hometown + " " + dateSign;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        OOP_B05_Lop_Nhan_Vien_2 nv = new OOP_B05_Lop_Nhan_Vien_2(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
        nv.chuanHoaTen();
        nv.chuanhoaNgaySinh();
        nv.chuanhoaSign();
        System.out.println(nv);
    }
}
