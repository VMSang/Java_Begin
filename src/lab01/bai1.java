package lab01;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        System.out.println("bai tap 01");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        float diem = scanner.nextFloat();
        System.out.println("ban ten la: " + name);
        System.out.println("voi so diem la: " + diem);
        scanner.close();
    }
}

