package Bai_Tap.Chapter_01_Lam_Quen;

import java.util.Scanner;

public class B18_Hoan_Vi_Gia_Tri_Hai_So {
    public B18_Hoan_Vi_Gia_Tri_Hai_So() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long tmp = a;
        a = b;
        b = tmp;
        System.out.println(128L * a + 97L * b + 1000L);
    }
}
