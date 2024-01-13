package lab02;

import java.util.Scanner;

public class bai01lab02 {
	public static void main(String[] args) {
		System.out.println("bai 1 lab 2");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		if (a == 0 && b == 0) {
			System.out.println("phuong trinh vo so nghiem");
		} else if (a == 0 && b != 0) {
			System.out.println("phuong trin vo nghiem");
		} else {
			int x = -b / a;
			System.out.println("nghiem cua phuong trinh la: " + x);
		}
		scanner.close();
	}
}
