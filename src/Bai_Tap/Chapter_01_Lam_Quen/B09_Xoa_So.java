package Bai_Tap.Chapter_01_Lam_Quen;

import java.util.Scanner;

public class B09_Xoa_So {
    public B09_Xoa_So() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        n /= 10L;
        n /= 10L;
        n /= 10L;
        System.out.println(n);
    }
}