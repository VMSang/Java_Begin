package Bai_Tap.Chapter_01_Lam_Quen;

import java.util.Scanner;

public class B16_Print {
    public B16_Print() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long y = sc.nextLong();
        long z = sc.nextLong();
        long t = sc.nextLong();
        System.out.println("" + x + "  " + y + "  " + z + "  " + t);
        System.out.println();
        System.out.println("" + y + "--" + z + "--" + x + "--" + t);
        System.out.println();
        System.out.println(2L * x + "," + 3L * y + "," + 4L * z + "," + 5L * t);
        System.out.println();
        System.out.println("KET THUC !!");
    }
}
