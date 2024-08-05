package OOP.Basic;

import java.util.Scanner;

public class OOP_B01_Lop_Phan_So {
    private int tu;
    private int mau;

    public OOP_B01_Lop_Phan_So(int tu, int mau) {
        int UCLN = gcd(tu, mau);
        this.tu = tu / UCLN;
        this.mau = mau / UCLN;
    }

    @Override
    public String toString() {
        return tu + "/" + mau;
    }

    public int gcd(int a, int b) {
        return (b == 0) ? a : gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        OOP_B01_Lop_Phan_So phanso = new OOP_B01_Lop_Phan_So(sc.nextInt(), sc.nextInt());
        System.out.println(phanso);
    }
}
