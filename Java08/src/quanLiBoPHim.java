
public class quanLiBoPHim {
	public static void main(String[] args) {
		Ngay ngay1= new Ngay(1,1,2);
		Ngay ngay2= new Ngay(1,3,2023);
		Ngay ngay3= new Ngay(23,9,2004);
		
		HangSanXuat hang1= new HangSanXuat("honda","VietNam");
		HangSanXuat hang2= new HangSanXuat("alo","japan");
		HangSanXuat hang3= new HangSanXuat("motPHim","china");
		
		Phim phim1= new Phim("shin",2012,12000,hang1,ngay1);
		Phim phim2= new Phim("shin2",2014,1000,hang2,ngay2);
		Phim phim3= new Phim("shin3",2012,2000,hang3,ngay3);
		
		System.out.println("gia ve phim1 re hon phim2: "+phim1.giaVeReHon(phim2.giaVe));
		System.out.println("gia ve phim1 re hon phim3: "+phim1.giaVeReHon(phim3.giaVe));
		
		System.out.println(phim1.hangSanXuat.tenHang);
		System.out.println(phim2.hangSanXuat.tenHang);
		System.out.println(phim3.hangSanXuat.tenHang);
		
		System.out.println("Gia ve sau khi giảm 10% phim1: "+phim1.giaVeKhiKM(10));
	}
}
