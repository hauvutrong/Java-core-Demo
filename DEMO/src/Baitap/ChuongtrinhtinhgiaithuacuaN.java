package Baitap;

import java.util.Scanner;

public class ChuongtrinhtinhgiaithuacuaN {
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Nhập vào số tự nhiên N = ");
		int n = sc.nextInt();
		System.out.println("Gia thửa của số " + n + " là " +ChuongtrinhtinhgiaithuacuaN.tingiaithua(n));
		

	}

	public static int tingiaithua(int n) {
		int giaithua = 1;
		if (n == 0 || n == 1) {
			giaithua = 1;
			return giaithua;
		} else {
			for (int i = 2; i <= n; i++) {
				giaithua *= i;
			}

		}
		return giaithua;
	}

}
