package Bai8;

import java.util.Scanner;

public class Bai8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Nhập vào số hàng và số cột của ma trận
		System.out.print("Nhập vào số hàng: ");
		int n = sc.nextInt();
		System.out.print("Nhập vào số cột: ");
		int m = sc.nextInt();

		// Khởi tạo ma trận với kích thước n*m
		double[][] matran = new double[n][m];

		nhapMaTran(matran);

		inMaTran(matran);

		tongCot(matran);

		demSoPhanTuDuong(matran);

		demSoPhanTuAm(matran);

		timGiaTriNhoNhat(matran);

		sc.close();
	}

	public static void nhapMaTran(double[][] matran) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < matran.length; i++) {
			for (int j = 0; j < matran[i].length; j++) {
				System.out.print("Nhập phần tử thứ [" + i + "][" + j + "]: ");
				matran[i][j] = sc.nextDouble();
			}
		}

		sc.close();
	}

	public static void inMaTran(double[][] matran) {
		for (double[] row : matran) {
			for (double element : row) {
				System.out.print(element + "\t");
			}
			System.out.println();
		}
	}

	public static void tongCot(double[][] matran) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập số cột cần tính tổng: ");
		int c = sc.nextInt();

		if (c >= 1 && c <= matran[0].length) {
			double sum = 0;
			for (double[] row : matran) {
				sum += row[c - 1];
			}

			System.out.println("Tổng các phần tử trên cột " + c + ": " + sum);
		} else {
			System.out.println("Số cột không hợp lệ");
		}

		sc.close();
	}

	public static void demSoPhanTuDuong(double[][] matran) {
		int count = 0;
		for (double[] row : matran) {
			for (double element : row) {
				if (element > 0) {
					count++;
				}
			}
		}
		System.out.println("Số phần tử dương trong ma trận: " + count);
	}

	public static void demSoPhanTuAm(double[][] matran) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập số hàng cần đếm số phần tử âm: ");
		int h = sc.nextInt();

		if (h >= 1 && h <= matran.length) {
			int count = 0;
			for (double element : matran[h - 1]) {
				if (element < 0) {
					count++;
				}
			}

			System.out.println("Số phần tử âm trong hàng " + h + ": " + count);
		} else {
			System.out.println("Số hàng không hợp lệ");
		}

		sc.close();
	}

	public static void timGiaTriNhoNhat(double[][] matran) {
		double min = Double.MAX_VALUE;
		for (double[] row : matran) {
			for (double element : row) {
				if (element < min) {
					min = element;
				}
			}
		}

		System.out.println("Giá trị nhỏ nhất của ma trận: " + min);
	}
}
