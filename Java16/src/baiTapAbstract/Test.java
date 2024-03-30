package baiTapAbstract;

public class Test {
	public static void main(String[] args) {
		HangSanXuat hang1 = new HangSanXuat("hang1","Việt Nam");
		HangSanXuat hang2= new HangSanXuat("hang2","USA");
		HangSanXuat hang3= new HangSanXuat("hang3","ENGLAND");
		
		PhuongTienDiChuyen oto = new Oto(hang1,"xăng");
		PhuongTienDiChuyen máybay = new MayBay(hang2,"máy bay","dầu");
		PhuongTienDiChuyen xedap = new XeDap(hang3,"xe đạp");
		
		System.out.println("vận tốc ô tô: "+oto.layVanToc());
		System.out.println("vận tốc máy bay: "+máybay.layVanToc());
		System.out.println("vận tốc xe đạp: "+xedap.layVanToc());
		
		System.out.println("bắt đầu: ");
		oto.batDau();
		
		
 	System.out.println("ten hang 1:"+oto.layTenHangSanXuat());
 	System.out.println("ten hang 2:"+máybay.layTenHangSanXuat());
 	System.out.println("ten hang 3:"+xedap.layTenHangSanXuat());
	}
}
