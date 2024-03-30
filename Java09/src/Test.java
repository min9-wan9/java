
public class Test {
	public static void main(String[] args) {
		Ngay ngay1= new Ngay(1,1,1234);
		Ngay ngay2= new Ngay(2,2,2345);
		Ngay ngay3=new Ngay(1,1,1234);
		
		Lop lop1= new Lop("22CN3","CNTT");
		Lop lop2= new Lop("20VN3","KT");
		Lop lop3= new Lop("22CN2","CNTT");
		
		SinhVien sv1= new SinhVien("k2201","Dang Minh Quang",ngay1,9,lop1);
		SinhVien sv2= new SinhVien("k2202"," Minh Quang",ngay2,4,lop2);
		SinhVien sv3= new SinhVien("k2203","Nguyen Van A",ngay3,5,lop3);
	
		System.out.println(sv1.layTenKHoa());
		System.out.println(sv2.layTenKHoa());
		
		System.out.println("sv1 co trung tuyen: "+sv1.trungTuyen());
		System.out.println("sv2 co trung tuye: "+sv2.trungTuyen());
		
		System.out.println("sv1 cung ngay sinh sv2: "+sv1.kiemTraCungNgaySinh(sv2));
		System.out.println("sv1 cung ngay sinh sv3: "+sv1.kiemTraCungNgaySinh(sv3));
	
	}
}
