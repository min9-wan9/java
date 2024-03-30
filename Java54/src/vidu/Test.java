package vidu;

public class Test {
	public static void main(String[] args) {
		SinhVien sv1 = new SinhVien(100,"le Van Loi","Lop2",9.5);
		SinhVien sv2 = new SinhVien(15,"Quang2","Lop3",2.9);
		SinhVien sv3 = new SinhVien(190,"nguyen van A","Lop2",3.6);
		
		System.out.println(sv1.compareTo(sv2));
		System.out.println(sv1.compareTo(sv3));;
		
	}
}
