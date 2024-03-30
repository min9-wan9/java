
public class hoaDon {
	
		private String tenLoaiCaPhe;
		private double donGiaTienmotkg;
		private double khoiLuong;
	
	public hoaDon(String t, double d, double k) {
		this.tenLoaiCaPhe = t;
		this.donGiaTienmotkg= d;
		this.khoiLuong= k;
	}
	public double tinhTongTien() {
		return this.donGiaTienmotkg * this.khoiLuong;
	}
	public boolean kiemTraKhoiLuongLonHOn(double kl) {
//		if (this.khoiLuong > kl) {
//			return true;
//		}
//		else return false ;
		return this.khoiLuong > kl;
	}
	public boolean kiemTraTongTienLonHon500k() {
		return this.tinhTongTien() > 500;
	}
	public double giamGia(double x) {
		if(this.tinhTongTien()>500)
		return (x/100)*this.tinhTongTien();
		else return 0;
	}
	public double giaSauKhiGiam(double x) {
		return this.tinhTongTien() - this.giamGia(x);
	}
	public static void main(String[] args) {
		hoaDon hd= new hoaDon("trung nguyen",100,5.5);
		hoaDon hd2= new hoaDon("trung nguyen",200,1);
		System.out.println("tong tien: "+hd.tinhTongTien());
		System.out.println("kien tra khoi luong lon hon 2kg: "+hd.kiemTraKhoiLuongLonHOn(2));
		System.out.println("kiem tra tong tien lon hon 500k: "+hd.kiemTraTongTienLonHon500k());
		System.out.println("giam gia cua hd: "+hd.giamGia(10));
		System.out.println("giảm giá của hd2: "+hd2.giamGia(10));
		System.out.println("gia sau khi giam: "+hd.giaSauKhiGiam(10));
		System.out.println("gia sau khi giam hd2: "+hd2.giaSauKhiGiam(10));
	
	}
	
}
