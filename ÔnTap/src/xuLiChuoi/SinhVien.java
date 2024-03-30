package xuLiChuoi;

public class SinhVien implements Comparable<SinhVien> {
	private String hoVaTen;
	private int maSinhVien;
	private double diemTB;
	public SinhVien(String hoVaTen, int maSinhVien, double diemTB) {
		super();
		this.hoVaTen = hoVaTen;
		this.maSinhVien = maSinhVien;
		this.diemTB = diemTB;
	}
	public String getHoVaTen() {
		return hoVaTen;
	}
	public void setHoVaTen(String hoVaTen) {
		this.hoVaTen = hoVaTen;
	}
	public int getMaSinhVien() {
		return maSinhVien;
	}
	public void setMaSinhVien(int maSinhVien) {
		this.maSinhVien = maSinhVien;
	}
	public double getDiemTB() {
		return diemTB;
	}
	public void setDiemTB(double diemTB) {
		this.diemTB = diemTB;
	}
	
	@Override
	public String toString() {
		return "SinhVien [hoVaTen=" + hoVaTen + ", maSinhVien=" + maSinhVien + ", diemTB=" + diemTB + "]";
	}
	@Override
	public int compareTo(SinhVien o) {
		
		return this.maSinhVien - o.maSinhVien;
	}
	
}
