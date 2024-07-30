package Bai_Tap.Chapter_04_Function;

import java.util.Scanner;

public class B011_So_Thuan_Nguyen_To {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();

        long cnt = 0;
        for (long i = a; i <= b; i++) {
            if (digit(i) && prime(i) && Sumdigit(i))
                cnt++;
        }
        System.out.println(cnt);
    }

    public static boolean prime(long n) {
        for (long i = 2; i * i <= n; i++) {
            if (n % i == 0)
                return false;
        }
        return n > 1;
    }

    public static boolean Sumdigit(long n) {
        long sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return prime(sum);
    }

    public static boolean digit(long n) {
        while (n > 0) {
            long x = n % 10;
            if (x != 2 && x != 3 && x != 5 && x != 7)
                return false;
            n /= 10;
        }
        return true;
    }
}
