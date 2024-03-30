
public class test {
public static void main(String[] args) {
	ngay  Ngay1 = new ngay(1,2,2023);
	ngay Ngay2 = new ngay(3,4,2004);
	ngay Ngay3 = new ngay(1,1,1111);
	
	tacgia tacGia1 = new tacgia("Quang",Ngay1);
	tacgia tacGia2= new tacgia("Minh",Ngay2);
	tacgia  tacGia3 = new tacgia("Đặng",Ngay3);
	
	sách sach1= new sách("lập trình java",1000,tacGia1,2004);
	sách sach2= new sách ("html",5000,tacGia2,2004);
	sách sach3 = new sách("toán",10000,tacGia3, 2003);
	
	System.out.println(sach1.tenSach);
	System.out.println(sach2.tenSach);
	System.out.println(sach3.tenSach);
	
	System.out.println("so sanh nam xuat ban sach1 va sach2 :"+sach1.soSanhNamXuatBan(sach2.namXuatBan));
	System.out.println("so sanh nam xuat ban sach2 và sach3: "+sach2.soSanhNamXuatBan(sach3.namXuatBan));
	
	System.out.println("gia Sach1 sau khi giảm 10%: "+sach1.giaSauKhiGiam(10));
	System.out.println("gia sach2 sau khi giảm 20%: "+sach2.giaSauKhiGiam(20));
	System.out.println("gia sach3 sau khi giam 50%: "+sach3.giaSauKhiGiam(50));
}
}
