package Bai_Tap.Chapter_04_Function;

import java.util.Scanner;

public class B05_Smith {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (Smith(n))
            System.out.println("YES");
        else
            System.out.println("NO");
    }

    public static long sumDigit(long n) {
        long sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static boolean Smith(long n) {
        long tmp = n; //để check snt
        long sumDigitN = sumDigit(n);
        long sumtsnv = 0;
        for (long i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                long plus = sumDigit(i);
                while (n % i == 0) {
                    sumtsnv += plus;
                    n /= i;
                }
            }
        }
        if (n == tmp)
            return false;
        else if (n > 1) {
            sumtsnv += sumDigit(n);
        }
        return sumtsnv == sumDigitN;
    }
}
