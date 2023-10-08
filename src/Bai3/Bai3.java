package Bai3;

import java.util.Scanner;

public class Bai3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.err.println("Nhap vao 2 so nguyen bat ky tu ban phim");

		System.err.print("So thu nhat: ");
		int a = sc.nextInt();
		sc.nextLine();
		
		System.err.print("So thu hai: ");
		int b = sc.nextInt();
		sc.nextLine();

		int tich = tich(a, b);
		System.out.println("Tich cua 2 so tren la: " + tich);

		int tong = tong(a, b);
		System.out.println("Tong cua 2 so tren la: " + tong);

		int hieu = hieu(a, b);
		System.out.println("Hieu cua 2 so tren la: " + hieu);

		float thuong = thuong(a, b);
		System.out.println("Thuong cua 2 so tren la: " + thuong);

		sc.close();
	}
	
	private static int tich(int a, int b) {
		return a * b;
	}

	private static int tong(int a, int b) {
		return a + b;
	}

	private static int hieu(int a, int b) {
		return a - b;
	}

	private static float thuong(int a, int b) {
		return (float) (a / b);
	}
}
