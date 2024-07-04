package Bai_Tap.Chapter_01_Lam_Quen;

import java.util.Scanner;

public class B03_Print_expression {
    public B03_Print_expression() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long y = sc.nextLong();
        long z = sc.nextLong();
        long t = sc.nextLong();
        System.out.println(x + " " + y + "," + z + "," + x + "," + t);
        System.out.println(x + y + z + t);
        long cal = x - y + z * t;
        System.out.println(cal);
    }
}
