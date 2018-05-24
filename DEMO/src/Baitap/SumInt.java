package Baitap;

import java.util.Scanner;

public class SumInt {
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Nhập vào một số tự nhiên n = ");
		int n = sc.nextInt();
		System.out.println("tổng các chữ số của " + n + " là : " + SumInt.sum(n));

	}

	public static int sum(int n) {
		int sumn = 0;
		do {
			System.out.print(n % 10 +"+");
			sumn += n % 10;
			n /= 10;
		} while (n > 0);

		return sumn;
	}
}
