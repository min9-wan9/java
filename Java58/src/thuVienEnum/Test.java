package thuVienEnum;

public class Test {
	public static void main(String[] args) {
		ThoiKhoaBieu tkb = new ThoiKhoaBieu(Day.Saturday,"Toán Văn Anh");
		ThoiKhoaBieu tkb2= new ThoiKhoaBieu(Day.Sunday, "Văn Sử Địa");
		ThoiKhoaBieu tkb3= new ThoiKhoaBieu(Day.Monday, "Lý Hóa Sinh");
		
		System.out.println(tkb);
		
		int x = Thang.Thang_một.soNgay();
		System.out.println(x);
	}
	

}
