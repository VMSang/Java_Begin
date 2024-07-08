package Bai_Tap.Chapter_03_Loop;

import java.util.Scanner;

public class B24_Uoc_Chung_Lon_Nhat_Cua_Giai_Thua {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt();
        long b = sc.nextInt();

        long MIN = Math.min(a, b);
        long sum = 1;
        for (int i = 1; i <= MIN; i++) {
            sum *= i;
        }
        System.out.println(sum);
    }
}
