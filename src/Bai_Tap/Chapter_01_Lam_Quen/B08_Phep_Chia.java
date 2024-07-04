package Bai_Tap.Chapter_01_Lam_Quen;

import java.util.Scanner;

public class B08_Phep_Chia {
    public B08_Phep_Chia() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(b / a);
        System.out.printf("%.2f", (double) b / (double) a);
    }
}
