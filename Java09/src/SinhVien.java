import java.util.Objects;

public class SinhVien {
	String maSV;
	String hoVaTen;
	Ngay ngaySinh;
	double diemTB;
	Lop lop;
	public SinhVien(String maSV, String hoVaTen, Ngay ngaySinh, double diemTB, Lop lop) {
		
		this.maSV = maSV;
		this.hoVaTen = hoVaTen;
		this.ngaySinh = ngaySinh;
		this.diemTB = diemTB;
		this.lop = lop;
	}
	public String getMaSV() {
		return maSV;
	}
	public void setMaSV(String maSV) {
		this.maSV = maSV;
	}
	public String getHoVaTen() {
		return hoVaTen;
	}
	public void setHoVaTen(String hoVaTen) {
		this.hoVaTen = hoVaTen;
	}
	public Ngay getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(Ngay ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	public double getDiemTB() {
		return diemTB;
	}
	public void setDiemTB(double diemTB) {
		this.diemTB = diemTB;
	}
	public Lop getLop() {
		return lop;
	}
	public void setLop(Lop lop) {
		this.lop = lop;
	}
	public String layTenKHoa() {
		return this.lop.tenKhoa;
	}
	public boolean trungTuyen() {
		return this.diemTB >=5;
	}
	public boolean kiemTraCungNgaySinh(SinhVien svKhac) {
		return this.ngaySinh.equals(svKhac.ngaySinh) ;
	}
	
}
