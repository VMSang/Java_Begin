package OOP.Basic;

import java.util.Scanner;

public class OOP_B11_Tinh_Luong_Nhan_Vien {
    private final String MaNV;
    private final String name;
    private final Long luongCoBan;
    private final int soNgayCong;
    private final String chucVu;

    public OOP_B11_Tinh_Luong_Nhan_Vien(String name, Long luongCoBan, int soNgayCong, String chucVu) {
        this.MaNV = "NV01";
        this.name = name;
        this.luongCoBan = luongCoBan;
        this.soNgayCong = soNgayCong;
        this.chucVu = chucVu;
    }

    public long thuong() {
        if (this.soNgayCong >= 25) return (20 * this.luongCoBan) / 100;
        else if (this.soNgayCong >= 22) return (10 * this.luongCoBan) / 100;
        else return 0;
    }

    public long phuCapChucVu() {
        return switch (this.chucVu) {
            case "GD" -> 250000;
            case "PGD" -> 200000;
            case "TP" -> 180000;
            case null, default -> 150000;
        };
    }

    public String toString() {
        return MaNV + " " + name + " " + this.luongCoBan * this.soNgayCong + " " + thuong() + " " + phuCapChucVu() + " " + (this.luongCoBan * this.soNgayCong + thuong() + phuCapChucVu());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        Long luongCoBan = sc.nextLong();
        sc.nextLine(); // Bỏ qua dấu Enter còn lại sau khi đọc long
        int soNgayCong = sc.nextInt();
        sc.nextLine(); // Bỏ qua dấu Enter còn lại sau khi đọc int
        String chucVu = sc.nextLine();

        OOP_B11_Tinh_Luong_Nhan_Vien a = new OOP_B11_Tinh_Luong_Nhan_Vien(name, luongCoBan, soNgayCong, chucVu);
        System.out.println(a);
    }

}
