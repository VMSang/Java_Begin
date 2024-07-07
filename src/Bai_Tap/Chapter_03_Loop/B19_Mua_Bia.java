package Bai_Tap.Chapter_03_Loop;

import java.util.Scanner;

public class B19_Mua_Bia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = n / 28;
        int sum = cnt;
        while (cnt >= 3) {
            cnt /= 3;
            sum += cnt;
        }
        System.out.println(sum);
    }
}
