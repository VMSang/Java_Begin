package Bai_Tap.Chapter_03_Loop;

import java.util.Scanner;

public class B08_Liet_Ke_So_Chinh_Phuong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        //time limited
//        for (long i = 1; i < n; i++) {
//            long sq = (long) Math.sqrt(i);
//            if (sq * sq == i) {
//                System.out.print(i + " ");
//            }
//        }

        for (long i = 1; i * i < n; i++) {
            System.out.println(i * i + " ");
        }
    }
}
