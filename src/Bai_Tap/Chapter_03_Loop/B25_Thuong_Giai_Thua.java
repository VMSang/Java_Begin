package Bai_Tap.Chapter_03_Loop;

import java.util.Scanner;

public class B25_Thuong_Giai_Thua {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double sumGiaiThua = 0;
        double giaithua = 1.0;
        for (int i = 1; i <= n; i++) {
            sumGiaiThua += 1.0 / giaithua;
            giaithua *= i;
        }
        System.out.printf("%.4f", sumGiaiThua);
    }
}
