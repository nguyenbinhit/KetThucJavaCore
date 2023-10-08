package Bai2;

import java.util.Scanner;

public class Bai2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số thứ nhất: ");
        float a1 = sc.nextFloat();

        System.out.print("Nhập số thứ hai: ");
        float a2 = sc.nextFloat();

        System.out.print("Nhập số thứ ba: ");
        float a3 = sc.nextFloat();
        
        // Tính trung bình cộng
        float tbc = tinhTrungBinhCong(a1, a2, a3);
        System.out.println("Trung binh cong cua 3 so tren la: " + tbc);
        
        
        // Tính trung bình nhân
        float tbn = tinhTrungBinhNhan(a1, a2, a3);
        System.out.println("Trung binh nhan cua 3 so tren la: " + tbn);
        
        sc.close();
	}
	
	public static float tinhTrungBinhCong(float a1, float a2, float a3) {
		return (a1 + a2 + a3) / 3;
	}
	
	public static float tinhTrungBinhNhan(float a1, float a2, float a3) {
		return (float) Math.pow((a1 * a2 *a3), (1.0/3.0));
	}
}
