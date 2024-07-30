package Bai_Tap.Chapter_04_Function;

import java.util.Scanner;

public class B01_Kiem_Tra_So_Nguyen_To {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        if (check(n))
            System.out.println("YES");
        else
            System.out.println("NO");
    }

    public static boolean check(long n) {
        for (long i = 2; i * i <= n; i++) {
            if (n % i == 0)
                return false;
        }
        return n > 2;
    }
}
