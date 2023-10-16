package Bai4;

public class Bai4 {
	public static void main(String[] args) {
		for (int i = 100; i <= 999; i++) {
			int d1 = i / 100;
            int d2 = (i % 100) / 10;
            int d3 = i % 10;

            if (d1 + d2 + d3 == 10) {
                System.out.println("So gom 3 chu so co tong bang 10 la: " + i);
            }
		}
	}
}
