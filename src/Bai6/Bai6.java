package Bai6;

import java.util.Scanner;

public class Bai6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Nhap vao chuoi s1 bat ky: ");
		String s1 = sc.nextLine();

		System.out.println("Nhap vao chuoi s2 bat ky: ");
		String s2 = sc.nextLine();

		int count = 0;
		int index = 0;
		while (index != -1) {
			index = s1.indexOf(s2, index);
			if (index != -1) {
				count++;
				index += 1;
			}
		}

		System.out.println("So lan chuoi s2 xuat hien trong chuoi s1 la: " + count);

		sc.close();
	}
}
