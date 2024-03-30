
public class Phim {
	String tenPhim;
	int namSanXuat;
	double giaVe;
	HangSanXuat hangSanXuat;
	Ngay ngayChieu;
	public Phim(String tenPhim, int namSanXuat, double giaVe, HangSanXuat hangSanXuat, Ngay ngayChieu) {
		
		this.tenPhim = tenPhim;
		this.namSanXuat = namSanXuat;
		this.giaVe = giaVe;
		this.hangSanXuat = hangSanXuat;
		this.ngayChieu = ngayChieu;
	}
	public String getTenPhim() {
		return tenPhim;
	}
	public void setTenPhim(String tenPhim) {
		this.tenPhim = tenPhim;
	}
	public int getNamSanXuat() {
		return namSanXuat;
	}
	public void setNamSanXuat(int namSanXuat) {
		this.namSanXuat = namSanXuat;
	}
	public double getGiaVe() {
		return giaVe;
	}
	public void setGiaVe(double giaVe) {
		this.giaVe = giaVe;
	}
	public HangSanXuat getHangSanXuat() {
		return hangSanXuat;
	}
	public void setHangSanXuat(HangSanXuat hangSanXuat) {
		this.hangSanXuat = hangSanXuat;
	}
	public Ngay getNgayChieu() {
		return ngayChieu;
	}
	public void setNgayChieu(Ngay ngayChieu) {
		this.ngayChieu = ngayChieu;
	} 
	public boolean giaVeReHon(double giaVe) {
		return this.giaVe ==giaVe;
	}
	public void tenHangPhim() {
		System.out.println(this.hangSanXuat.tenHang);
	}
	public double giaVeKhiKM (double x) {
		return this.giaVe *(1-x/100);
	}
}
