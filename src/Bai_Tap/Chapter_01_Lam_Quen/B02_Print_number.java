package Bai_Tap.Chapter_01_Lam_Quen;

import java.util.Scanner;

public class B02_Print_number {
    public B02_Print_number() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        long y = sc.nextLong();
        sc.nextLine();
        char c = sc.nextLine().charAt(0);
        float f = sc.nextFloat();
        double d = sc.nextDouble();
        System.out.println(x);
        System.out.println(y);
        System.out.println(c);
        System.out.printf("%.2f\n%.9f", f, d);
    }
}
