package Bai_Tap.Chapter_03_Loop;

import java.util.Scanner;

public class B05_Tong_Ngich_Dao_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double sum = 0;
        for (int i = 1; i <= n; i += 1) {
            sum += 1.0 / (i * 2);
        }
        System.out.printf("%.5f", sum);
    }
}
