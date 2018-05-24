package Baitap;
import java.util.Scanner;

public class ArrayDemo_inmang2chieu {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Nhập vào số dòng của ma trận :");
		int a = sc.nextInt();
		System.out.println("Nhập vào số cột của ma trận");
		int b = sc.nextInt();
		
		int [][]arr = new int[a][b];
		System.out.println("Nhập vào các phần tử của ma trận :");
		for(int i=0;i<a;i++) {
			for(int j =0;j<b;j++) {
				System.out.printf("a[%d][%d] = ",i,j);
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("Các phần tử của mảng ma trận 2 chiêu :");
		show(arr);
	}

	public static void show(int arr[][]) {
		for(int i = 0;i<arr.length;i++) {
			for(int j =0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+"");
			}
			System.out.println();
		}
	}
}
