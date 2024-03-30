package baiTapAbstract;

public class HangSanXuat {
	private String tenHanSanXuat;
	private String tenQuocGia;
	public HangSanXuat(String tenHanSanXuat, String tenQuocGia) {
		
		this.tenHanSanXuat = tenHanSanXuat;
		this.tenQuocGia = tenQuocGia;
	}
	public String getTenHanSanXuat() {
		return tenHanSanXuat;
	}
	public void setTenHanSanXuat(String tenHanSanXuat) {
		this.tenHanSanXuat = tenHanSanXuat;
	}
	public String getTenQuocGia() {
		return tenQuocGia;
	}
	public void setTenQuocGia(String tenQuocGia) {
		this.tenQuocGia = tenQuocGia;
	}
	
}
