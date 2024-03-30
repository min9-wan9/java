
public class ontap {
	private String hoaDon;
	private int soDien;
	private int giamotSO;
	
	public ontap(String h, int s, int g) {
		this.hoaDon = h;
		this.soDien= s;
		this.giamotSO= g;
	}
	public int tongtien (){
		return this.soDien * this.giamotSO;
	}
	public static void main(String[] args) {
		ontap ot =  new ontap("tien dien",50,4);
		System.out.println("so tien: "+ot.tongtien());
	}
}
