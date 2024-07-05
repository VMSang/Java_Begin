package Bai_Tap.Chapter_03_Loop;

import java.util.Scanner;

public class B10_Kiem_Tra_So_2022 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nums = sc.nextInt();
        boolean check = false;
        for (int i = 0; i < nums; i++) {
            int x = sc.nextInt();
            if (x == 2022) {
                check = true;
                break;
            }
        }
        if (check) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
