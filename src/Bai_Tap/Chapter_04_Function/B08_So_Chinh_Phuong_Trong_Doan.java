package Bai_Tap.Chapter_04_Function;

import java.util.Scanner;

public class B08_So_Chinh_Phuong_Trong_Doan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        a = (long) Math.ceil(Math.sqrt(a));
        b = (long) Math.sqrt(b);
        for (long i = a; i <= b; i++) {
            System.out.print(i * i + " ");
        }
    }
}
