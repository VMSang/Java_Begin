package OOP.Basic;

import java.util.Scanner;

public class OOP_B09_Thu_Nhap_Cua_Giao_Vien {
    private String MaNgach;
    private String name;
    private long luongCoBan;

    public OOP_B09_Thu_Nhap_Cua_Giao_Vien(String maNgach, String name, long luongCoBan) {
        MaNgach = maNgach;
        this.name = name;
        this.luongCoBan = luongCoBan;
    }

    public long getHeSo() {
        return Integer.parseInt(this.MaNgach.substring(2, 4));
    }

    public long getphuCap() {
        String chucVu = this.MaNgach.substring(0, 2);
        if (chucVu == "HT") return 2000000;
        else if (chucVu == "HP") return 900000;
        else return 500000;
    }

    public long thuNhap() {
        return this.luongCoBan * getHeSo() + getphuCap();
    }

    public String toString() {
        return this.MaNgach + " " + this.name + " " + getHeSo() + " " + thuNhap();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        OOP_B09_Thu_Nhap_Cua_Giao_Vien a = new OOP_B09_Thu_Nhap_Cua_Giao_Vien(sc.nextLine(), sc.nextLine(), sc.nextLong());
        System.out.println(a);
    }
}
