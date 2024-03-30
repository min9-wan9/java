
public class Test {
	public static void main(String[] args) {
		Ngay ngay1= new Ngay(1,1,1);
		Ngay ngay2= new Ngay(2,2,2);
		Ngay ngay3= new Ngay(1,1,1);
		
		QuocGia QG1= new QuocGia("A01","Viet Nam");
		QuocGia QG2= new QuocGia("A02","trung quoc");
		QuocGia QG3= new QuocGia("A03","USA");
		
		HangSX hang1= new HangSX("Dell",QG1);
		HangSX hang2= new HangSX("ACE",QG2);
		HangSX hang3= new HangSX("macbook",QG3);
		
		MayTinh mt1= new MayTinh(hang1,ngay1,1000,12);
		MayTinh mt2= new MayTinh(hang2,ngay2,5000,50);
		MayTinh mt3= new MayTinh(hang3,ngay3,500,100);
		
		System.out.println("mt1 thap hon gia mt2: "+mt1.KiemTraGiaBanThapHon(mt2));
		System.out.println("mt1 thap hon gia mt3: "+mt1.KiemTraGiaBanThapHon(mt3));
	
		System.out.println("ten quoc gia mt1: "+mt1.layTenQG());
		System.out.println("ten quoc gia mt2: "+mt2.layTenQG());
		System.out.println("ten quoc gia mt3: "+mt3.layTenQG());
		
	System.out.println("mt1 cung ngay sx mt2: "+mt1.cungNgaySX(mt2));
		System.out.println("mt1 cung ngay sx mt3: "+mt1.cungNgaySX(mt3));
	}
}
