package Bai5;

import java.util.Scanner;

public class Bai5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Nhap vao chuoi s1 bat ky: ");
		String s1 = sc.nextLine();

		System.out.println("Nhap vao chuoi s2 bat ky: ");
		String s2 = sc.nextLine();

		int a = 0;
		for (int i = 0; i < s1.length(); i++) {
			if (s1.indexOf(s2) != -1) {
				a += 1;
				s1 = s1.substring(s2.length() + i);
			}
		}

		System.out.println(a);

		sc.close();
	}
}
