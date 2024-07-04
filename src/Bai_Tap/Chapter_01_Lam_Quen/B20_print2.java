package Bai_Tap.Chapter_01_Lam_Quen;

import java.util.Scanner;

public class B20_print2 {
    public B20_print2() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.close();
        String output1 = String.format("%06d", N);
        System.out.println(output1);
        String output2 = String.format("%#06d", N);
        System.out.println(output2);
    }
}
