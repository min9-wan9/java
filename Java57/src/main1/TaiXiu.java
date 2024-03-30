package main1;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

/*
 * mọt người chơi sẽ có tài khoản. Người chơi có quyền đặt số tiền ít hơn hoặc băng số tiên
 * họ đang có 
 * Luật chơi như sau:
 * Có 3 viên xúc xác. Mỗi viên xúc xác có 6 mặt có giá trị từ 1 =>6.
 * Mỗi lần lắc sẽ ra một kết quả. Kết quả = gt1+gt2+gt3
 * 1. Nếu tổng bằng =3 hoặc 18 => Cái ăn hết, người chơi thua
 *  2. Nếu tổng = (4->10) <-> xỉu => nếu người chơi đặt xỉu thì người chơi thắng, ngược lại thua
 * 3. Nếu tổng = (11-17) <-> tài => nếu người chơi đặt tai thì người chơi thắng, ngược lại thua
*/
public class TaiXiu {
	public static void main(String[] args) {
		double taiKhoanNguoiChoi = 5000000.99;
		Scanner sc = new Scanner(System.in);
		
		Locale lc= new Locale("vi","VN");
//		NumberFormat numf = NumberFormat.getInstance(lc);
		NumberFormat numf = NumberFormat.getCurrencyInstance(lc);
		
		
		int luaChon=1;
		do {
			System.out.println("-----------");
			System.out.println("Chọn 1 để tiếp tục chơi.");
			System.out.println("Chọn phím bất kỳ để tiếp thoát.");
			luaChon= sc.nextInt();
			if(luaChon==1) {
				System.out.println("** BẮT ĐẦU CHƠI: ");
				// Đặt cược
				System.out.println("**** Tài khoản của ban: "+numf.format(taiKhoanNguoiChoi)+"bạn muốn cược bao nhiêu");
				double datCuoc=0;
				do {
					System.out.println("**** Đặt cược (0<số tiên <=" +taiKhoanNguoiChoi+":");
					datCuoc = sc.nextDouble();
				}while(datCuoc>taiKhoanNguoiChoi || datCuoc<=0);
			
				// Chọn tài xỉu
				int luaChonTaiXiu=0;
				do {
					System.out.println("**** Chọn 1 <-> Tài hoặc 2<->Xỉu" );
					luaChonTaiXiu = sc.nextInt();
				}while(luaChonTaiXiu !=1 && luaChonTaiXiu !=2);
				
				// Tung xúc xắc
				Random xucXac1= new Random();
				Random xucXac2= new Random();
				Random xucXac3= new Random();
				
				int giaTri1 = xucXac1.nextInt(5)+1;
				int giaTri2 = xucXac2.nextInt(5)+1;
				int giaTri3 = xucXac3.nextInt(5)+1;
				int tong= giaTri1+giaTri2 +giaTri3;
			
				// Tính toán kết quả
				System.out.println("****Kết quả: "+giaTri1+"-"+giaTri2+"-"+giaTri3);
				if(tong==3 || tong ==18) {
					taiKhoanNguoiChoi-=datCuoc;
					System.out.println("**** Tổng là:"+tong +"==> Nhà cái ăn hết, bạn đã thua!");
					System.out.println("**** Tài khoản của bạn là:"+taiKhoanNguoiChoi);
				}
				else if(tong>=4 && tong<=10) {
					System.out.println("**** Tổng là:"+tong);
					if(luaChonTaiXiu ==2) {
						System.out.println("**** Bạn đã thắng cuộc!");
						taiKhoanNguoiChoi +=datCuoc;
						System.out.println("**** Tài khoản của bạn là:"+taiKhoanNguoiChoi);
					}
					else {
						taiKhoanNguoiChoi-=datCuoc;
						System.out.println("**** Bạn dã thua cuộc!");
						System.out.println("**** Tài khoản của bạn là:"+taiKhoanNguoiChoi);
					}
				}
				else {
					System.out.println("**** Tổng là:"+tong);
					if(luaChonTaiXiu ==1) {
						System.out.println("**** Bạn đã thắng cuộc!");
						taiKhoanNguoiChoi +=datCuoc;
						System.out.println("**** Tài khoản của bạn là:"+taiKhoanNguoiChoi);
					}
					else {
						taiKhoanNguoiChoi-=datCuoc;
						System.out.println("**** Bạn dã thua cuộc!");
						System.out.println("**** Tài khoản của bạn là:"+taiKhoanNguoiChoi);
					}
				
				}
			
			
			
			}
			
		}while (luaChon==1);
	}
}
