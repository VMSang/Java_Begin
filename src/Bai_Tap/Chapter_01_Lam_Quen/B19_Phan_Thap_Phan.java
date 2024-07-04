package Bai_Tap.Chapter_01_Lam_Quen;

import java.util.Scanner;

public class B19_Phan_Thap_Phan {
    public B19_Phan_Thap_Phan() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        System.out.println((int) Math.floor(x));
        System.out.printf("%.2f", x - Math.floor(x));
    }
}
