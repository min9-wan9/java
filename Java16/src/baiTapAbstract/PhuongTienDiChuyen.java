package baiTapAbstract;

public abstract class PhuongTienDiChuyen {
	protected HangSanXuat hangSanXuat;
	protected String loaiPhuongTien;
	public PhuongTienDiChuyen(HangSanXuat hangSanXuat, String loaiPhuongTien) {
		
		this.hangSanXuat = hangSanXuat;
		this.loaiPhuongTien = loaiPhuongTien;
	}
	
	public HangSanXuat getHangSanXuat() {
		return hangSanXuat;
	}

	public void setHangSanXuat(HangSanXuat hangSanXuat) {
		this.hangSanXuat = hangSanXuat;
	}

	public String getLoaiPhuongTien() {
		return loaiPhuongTien;
	}

	public void setLoaiPhuongTien(String loaiPhuongTien) {
		this.loaiPhuongTien = loaiPhuongTien;
	}

	public String layTenHangSanXuat() {
		return this.hangSanXuat.getTenHanSanXuat();
	}
	public void batDau() {
		System.out.println("Bat dau....");
	}
	public void tangToc() {
		System.out.println("Tang Toc.....");
	}
	public void dungLai() {
		System.out.println("Dung lai....");
	}
	public abstract double layVanToc();
	
	
}
