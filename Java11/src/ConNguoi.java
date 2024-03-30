
public class ConNguoi {
	private String HoVaTen;
	private int namSinh;
	
	public ConNguoi(String hoVaTen, int namSinh) {
		
		HoVaTen = hoVaTen;
		this.namSinh = namSinh;
	}
	public String getHoVaTen() {
		return HoVaTen;
	}
	public void setHoVaTen(String hoVaTen) {
		HoVaTen = hoVaTen;
	}
	public int getNamSinh() {
		return namSinh;
	}
	public void setNamSinh(int namSinh) {
		this.namSinh = namSinh;
	}
	public void an() {
		System.out.println("mom mom");
	}
	public void uong() {
		System.out.println("uc uc");
	}
}
