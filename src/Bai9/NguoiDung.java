package Bai9;

public class NguoiDung {
	int thang;
	String maNguoiDung, ten, diaChi;
	float tieuThu;

	public NguoiDung() {
	}

	public NguoiDung(int thang, String maNguoiDung, String ten, String diaChi, float tieuThu) {
		this.thang = thang;
		this.maNguoiDung = maNguoiDung;
		this.ten = ten;
		this.diaChi = diaChi;
		this.tieuThu = tieuThu;
	}

	public int getThang() {
		return thang;
	}

	public void setThang(int thang) {
		this.thang = thang;
	}
	
	public String getMaNguoiDung() {
		return maNguoiDung;
	}

	public void setMaNguoiDung(String maNguoiDung) {
		this.maNguoiDung = maNguoiDung;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public float getTieuThu() {
		return tieuThu;
	}

	public void setTieuThu(float tieuThu) {
		this.tieuThu = tieuThu;
	}
	
	@Override
	public String toString() {
		return "NguoiDung [thang=" + thang + ", maNguoiDung=" + maNguoiDung + ", ten=" + ten + ", diaChi=" + diaChi
				+ ", tieuThu=" + tieuThu + "]";
	}

	public void display() {
        System.out.println("Thang: " + thang);
        System.out.println("Ma Nguoi Dung: " + maNguoiDung);
        System.out.println("Ten: " + ten);
        System.out.println("Dia Chi: " + diaChi);
        System.out.println("Tieu Thu: " + tieuThu);
    }
}
