package Bai_Tap.Chapter_01_Lam_Quen;

import java.util.Scanner;

public class B12_Fxy {
    public B12_Fxy() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long y = sc.nextLong();
        System.out.println(5L * x + 2L * y + x * y);
    }
}
