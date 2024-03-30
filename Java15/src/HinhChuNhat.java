
public class HinhChuNhat extends Hinh {
	private int chieuDai,chieuRong;

	public HinhChuNhat(ToaDo toaDo, int chieuDai, int chieuRong) {
		super(toaDo);
		this.chieuDai = chieuDai;
		this.chieuRong = chieuRong;
	}

	public int getChieuDai() {
		return chieuDai;
	}

	public void setChieuDai(int chieuDai) {
		this.chieuDai = chieuDai;
	}

	public int getChieuRong() {
		return chieuRong;
	}

	public void setChieuRong(int chieuRong) {
		this.chieuRong = chieuRong;
	}

	@Override
	public double tinhDienTich() {
		
		return this.chieuDai* this.chieuRong;
	}
	
}
