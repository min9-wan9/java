
public class sách {
	String tenSach;
	double giaBan;
	tacgia tacGia;
	int namXuatBan;
	
	public sách(String tenSach, double giaBan, tacgia tacGia, int namXuatBan) {
		super();
		this.tenSach = tenSach;
		this.giaBan = giaBan;
		this.tacGia = tacGia;
		this.namXuatBan = namXuatBan;
	}
	
	public int getNamXuatBan() {
		return namXuatBan;
	}

	public void setNamXuatBan(int namXuatBan) {
		this.namXuatBan = namXuatBan;
	}

	public String getTenSach() {
		return tenSach;
	}
	public void setTenSach(String tenSach) {
		this.tenSach = tenSach;
	}
	public double getGiaBan() {
		return giaBan;
	}
	public void setGiaBan(double giaBan) {
		this.giaBan = giaBan;
	}
	public tacgia getTacGia() {
		return tacGia;
	}
	public void setTacGia(tacgia tacGia) {
		this.tacGia = tacGia;
	}
	public void inTenSach() {
		System.out.println(this.tenSach);
	}
	
	public boolean soSanhNamXuatBan(int namXuatBan) {
		return this.namXuatBan == namXuatBan;
	}
	public double giaSauKhiGiam (double x) {
		return this.giaBan *(1-x/100);
	}
	
	
}
