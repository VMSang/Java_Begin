package Bai_Tap.Chapter_03_Loop;

import java.util.Scanner;

public class B20_Bieu_Dien_So_Nguyen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n % 2 == 0) {
            int end = n / 2;
            System.out.println(end);
            for (int i = 0; i < n / 2; i++) {
                System.out.print(2 + " ");
            }
        } else {
            int end = n / 2 - 1;
            System.out.println(end + 1);
            for (int i = 0; i < end; i++) {
                System.out.print(2 + " ");
            }
            System.out.println(3);
        }
    }
}
