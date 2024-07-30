package Bai_Tap.Chapter_04_Function;

import java.util.Scanner;

public class B06_Tong_Uoc_So {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long sum = 1 + n;
        for (long i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                sum += i;
                //check so chinh phuong
                if (i != n / i)
                    sum += n / i;
            }
        }
        System.out.println(sum);
    }
}
