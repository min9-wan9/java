
public class MayTinh {
	HangSX hangSX;
	Ngay ngaySX;
	double giaBan;
	int thoiGianBaoHanh;
	public MayTinh(HangSX hangSX, Ngay ngaySX, double giaBan, int thoiGianBaoHanh) {
		
		this.hangSX = hangSX;
		this.ngaySX = ngaySX;
		this.giaBan = giaBan;
		this.thoiGianBaoHanh = thoiGianBaoHanh;
	}
	public HangSX getHangSX() {
		return hangSX;
	}
	public void setHangSX(HangSX hangSX) {
		this.hangSX = hangSX;
	}
	public Ngay getNgaySX() {
		return ngaySX;
	}
	public void setNgaySX(Ngay ngaySX) {
		this.ngaySX = ngaySX;
	}
	public double getGiaBan() {
		return giaBan;
	}
	public void setGiaBan(double giaBan) {
		this.giaBan = giaBan;
	}
	public int getThoiGianBaoHanh() {
		return thoiGianBaoHanh;
	}
	public void setThoiGianBaoHanh(int thoiGianBaoHanh) {
		this.thoiGianBaoHanh = thoiGianBaoHanh;
	}
	public boolean KiemTraGiaBanThapHon(MayTinh mtKhac) {
		return this.giaBan < mtKhac.giaBan;
	}
	public String layTenQG(){
		return this.hangSX.quocGia.tenQG;
	}
	public boolean cungNgaySX(MayTinh mtKhac) {
		return this.ngaySX.equals(mtKhac.ngaySX);
	}
	
}
