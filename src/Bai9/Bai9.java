package Bai9;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Bai9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List<NguoiDung> arrNguoiDung = new ArrayList<>();

		NguoiDung nguoiDung;

		// Nhap danh sach nguoi dung tieu thu dien
		while (true) {
			System.out.println("\nMENU:");
			System.out.println("1. Thêm người dùng (Khách hàng) mới");
			System.out.println("2. Xem danh sách khách hàng");
			System.out.println("3. Sắp xếp và lưu danh sách vào tệp khachhang.dat");

			System.out.print("Moi chon chuc nang: ");
			int chucNang = sc.nextInt();
			switch (chucNang) {
			case 1:
				// Nhập thông tin của khách hàng mới và thêm vào danh sách
				sc.nextLine();

				System.out.print("Nhap thang thu: ");
				int thang = sc.nextInt();
				sc.nextLine();

				System.out.print("Nhap ma khach hang: ");
				String maNguoiDung = sc.nextLine();

				System.out.print("Nhap ten khach hang: ");
				String ten = sc.nextLine();

				System.out.print("Nhap dia chi khach hang:");
				String diaChi = sc.nextLine();

				System.out.print("Nhap dien nang tieu thu:");
				float tieuThu = sc.nextFloat();

				nguoiDung = new NguoiDung(thang, maNguoiDung, ten, diaChi, tieuThu);

				arrNguoiDung.add(nguoiDung);

				break;
			case 2:
				// Xuất danh sách khách hàng ra màn hình
				if (!arrNguoiDung.isEmpty()) {
					System.out.println("\nDanh sach nguoi dung: ");
					for (int i = 0; i < arrNguoiDung.size(); i++) {
						arrNguoiDung.get(i).display();
						System.out.println("----------------------------------");
					}
				} else {
					System.out.println("Danh sach nguoi dung trống. Vui long nhap nguoi dung.");
				}

				break;
			case 3:
				// Sắp xếp danh sách và lưu vào tệp khachhang.dat
				if (!arrNguoiDung.isEmpty()) {
					Collections.sort(arrNguoiDung, new Comparator<NguoiDung>() {

						@Override
						public int compare(NguoiDung o1, NguoiDung o2) {
							// TODO Auto-generated method stub
							return Float.compare(o1.tieuThu, o2.tieuThu);
						}
					});

					try {
						FileOutputStream fos = new FileOutputStream("khachhang.dat");
						ObjectOutputStream oos = new ObjectOutputStream(fos);

						for (int i = 0; i < arrNguoiDung.size(); i++) {
							oos.writeObject(arrNguoiDung.get(i));
						}

						oos.close();
					} catch (IOException e) {
						System.out.println("Loi khi ghi file.");
						e.printStackTrace();
					}
				} else {
					System.out.println("Danh sach nguoi dung trong. Khong the ghi file. Vui long nhap nguoi dung.");
				}

				break;
			default:
				System.out.println("Khong ton tai lua chon nay. Vui long chon lai.");
				break;
			}

			System.out.print("\nBạn có muốn tiếp tục sử dụng chương trình? Chon Y la co hoac N la khong: ");
			String tiepTuc = sc.next();

			if (!tiepTuc.equalsIgnoreCase("Y")) {
				break;
			}
		}

		sc.close();
	}
}
