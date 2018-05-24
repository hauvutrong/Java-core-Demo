package Baitap;

import java.util.Scanner;

public class ArrayDemo_inmang1chieu {
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Nhập vào chiều dài của mảng :");
		int n = sc.nextInt();

		int arr[] = new int[n];
		System.out.println("nhập vào thành viên dữ liệu của mảng :");
		for (int i = 0; i < n; i++) {
			System.out.printf("a[%d] =" + "",i);
			arr[i] = sc.nextInt();
		}

		System.out.println("Duyệt mảng 1 chiều:");
		inMang1Chieu(arr);

	}

	public static void inMang1Chieu(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "");
		}
	}

}
