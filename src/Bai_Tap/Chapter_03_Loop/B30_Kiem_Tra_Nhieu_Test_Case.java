package Bai_Tap.Chapter_03_Loop;

import java.util.Scanner;

public class B30_Kiem_Tra_Nhieu_Test_Case {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ts = sc.nextInt();
        while (ts != 0) {
            ts--;
            int x = sc.nextInt();
            if (x % 2 == 0)
                System.out.println("EVEN");
            else
                System.out.println("ODD");
        }
    }
}
