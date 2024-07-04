package Bai_Tap.Chapter_01_Lam_Quen;

import java.util.Scanner;

public class B04_pow {
    public B04_pow() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        System.out.println((long) Math.pow(x, y));
    }
}