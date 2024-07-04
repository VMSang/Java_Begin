package Bai_Tap.Chapter_01_Lam_Quen;

import java.util.Scanner;

public class B06_ceil_floor_round {
    public B06_ceil_floor_round() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        System.out.println((int) Math.floor(x));
        System.out.println((int) Math.ceil(x));
        System.out.println((int) Math.round(x));
    }
}