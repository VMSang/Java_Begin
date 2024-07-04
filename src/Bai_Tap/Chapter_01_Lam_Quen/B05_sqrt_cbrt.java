package Bai_Tap.Chapter_01_Lam_Quen;

import java.util.Scanner;

public class B05_sqrt_cbrt {
    public B05_sqrt_cbrt() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        System.out.printf("%.2f\n%.3f", Math.sqrt(n), Math.cbrt(n));
    }
}