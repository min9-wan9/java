package viDu;

public class SinhVien implements Comparable<SinhVien> {
	private String hoVaTen;
	private double diemTb;
	private int maSinhVien;
	public SinhVien(String hoVaTen, double diemTb, int maSinhVien) {
		
		this.hoVaTen = hoVaTen;
		this.diemTb = diemTb;
		this.maSinhVien = maSinhVien;
	}
	public String getHoVaTen() {
		return hoVaTen;
	}
	public void setHoVaTen(String hoVaTen) {
		this.hoVaTen = hoVaTen;
	}
	public double getDiemTb() {
		return diemTb;
	}
	public void setDiemTb(double diemTb) {
		this.diemTb = diemTb;
	}
	public int getMaSinhVien() {
		return maSinhVien;
	}
	public void setMaSinhVien(int maSinhVien) {
		this.maSinhVien = maSinhVien;
	}
	
	@Override
	public String toString() {
		return "SinhVien [hoVaTen=" + hoVaTen + ", diemTb=" + diemTb + ", maSinhVien=" + maSinhVien + "]";
	}
	public String getTen() {
		String s= this.hoVaTen.trim();
		s=s.trim();
		
		if(s.indexOf(" ")>=0) {
				int viTri= s.lastIndexOf(" ");
						return s.substring(viTri+1);
					}
						
				
			
		
			else return s;
	}
	@Override
	public int compareTo(SinhVien o) {
		String tenThis= this.getTen();
		String tenO= o.getTen();
		return tenThis.compareTo(tenO);
	}
	
}
