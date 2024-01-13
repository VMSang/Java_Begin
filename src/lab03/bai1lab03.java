package lab03;

import java.util.Scanner;

public class bai1lab03 {
    public static boolean snt(int a) {
        if (a < 2) {
            return false;
        } else {
            for (int i = 2; i <= Math.sqrt(a); i++) {
                if (a%i== 0) {
                    return false;
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhap vao so nguyen: ");
        int a = scanner.nextInt();
        
        if (snt(a)) {
            System.out.println("dung, la so nguyen to");
        } else {
            System.out.println("khong la so nguyen to");
        }
        scanner.close();
    }
}
