package Bai4;

public class Bai4 {
	public static void main(String[] args) {
		for (int i = 100; i <= 999; i++) {
			int digit1 = i / 100;
            int digit2 = (i % 100) / 10;
            int digit3 = i % 10;

            if (digit1 + digit2 + digit3 == 10) {
                System.out.println("So gom 3 chu so co tong bang 10 la: " + i);
            }
		}
	}
}
