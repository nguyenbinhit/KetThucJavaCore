package Bai7;

import java.util.Arrays;
import java.util.Scanner;

public class Bai7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Nhập vào số lượng phần tử của mảng
		System.out.print("Nhập vào số lượng phần tử của mảng: ");
		int n = sc.nextInt();

		if (!kiemTraN(n)) {
			System.out.println("n không được nhỏ hơn 0 và lớn hơn 50");
		}

		// Khởi tạo mảng với kích thước n
		int[] arr = new int[n];

		// Nhập vào các phần tử của mảng
		for (int i = 0; i < n; i++) {
			System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
			arr[i] = sc.nextInt();
		}

		System.out.println("Mảng các số nguyên: " + Arrays.toString(arr));

		demSoPhanTuChan(arr);

		timGiaTriLonNhat(arr);

		sapXepTangDan(arr);
		
		timKiemPhanTuX(arr);
		
		sc.close();
	}

	public static boolean kiemTraN(int n) {
		if (n < 0 || n > 50) {
			return false;
		}

		return true;
	}

	public static void demSoPhanTuChan(int[] arr) {
		int count = 0;
		for (int i : arr) {
			if (i % 2 == 0) {
				count++;
			}
		}

		System.out.println("Số phần tử chẵn trong mảng là: " + count);
	}

	public static void timGiaTriLonNhat(int[] arr) {
		int max = arr[0];
		for (int i : arr) {
			if (i > max) {
				max = i;
			}
		}

		System.out.println("Giá trị lớn nhất trong mảng là: " + max);
	}

	public static void timKiemPhanTuX(int[] arr) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập giá trị cần tìm: ");
		int x = sc.nextInt();

		boolean isFound = false;
		for (int i : arr) {
			if (i == x) {
				isFound = true;
				break;
			}
		}

		if (isFound) {
			System.out.println(x + " có tồn tại trong mảng");
		} else {
			System.out.println(x + " không tồn tại trong mảng");
		}

		sc.close();
	}

	public static void sapXepTangDan(int[] arr) {
		Arrays.sort(arr);
		System.out.println("Mảng sau khi sắp xếp: " + Arrays.toString(arr));
	}
}
