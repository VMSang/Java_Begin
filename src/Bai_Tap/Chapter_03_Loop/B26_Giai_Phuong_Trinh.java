package Bai_Tap.Chapter_03_Loop;

import java.util.Scanner;

public class B26_Giai_Phuong_Trinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();
        for (int i = 0; i <= n / a; i++) {
            int r = (n - a * i);
            if (r % b == 0) {
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}
