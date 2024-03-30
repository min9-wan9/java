package set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class RutThamTrungThuong_TreeSet {
	Set<String> tapHopPhieuDuThuong = new  TreeSet<String>();
	// hashset là không có kí tự
	// treeSet là có thứu tự
	
	public RutThamTrungThuong() {
		
		
	}
	
	public void themPhieu(String giaTri) {
		 this.tapHopPhieuDuThuong.add(giaTri);
	}

	public boolean xoaPhieu(String giaTri) {
		return this.tapHopPhieuDuThuong.remove(giaTri);
	}
	public boolean kiemTraPhieuTonTai(String giaTri) {
		return this.tapHopPhieuDuThuong.contains(giaTri);
	}
	
	public void xoaTatCaPhieuDuThuong(){
		this.tapHopPhieuDuThuong.clear();
	}
	public String rutMotPhieu() {
		String ketQua= "";
		Random rd = new Random();
		int viTri= rd.nextInt(this.tapHopPhieuDuThuong.size()-1);
		ketQua= (String)this.tapHopPhieuDuThuong.toArray()[viTri];
		return ketQua;
	}
	
	public int laySoLuong() {
		return this.tapHopPhieuDuThuong.size();
	}
	public void inTatCa() {
		System.out.println(Arrays.toString(this.tapHopPhieuDuThuong.toArray()));
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		RutThamTrungThuong rt= new RutThamTrungThuong();
		int luaChon=0;
		do {
			System.out.println("------------------");
			System.out.println("MENU: ");
			System.out.println("1. Thêm mã số dự thưởng.");
			System.out.println("2. Xóa mã số dự thưởng.");
			System.out.println("3. Kiểm tra mã số dự thưởng có tồn tại hay không? ");
			System.out.println("4. Xóa tất cả các phiếu dự phòng.");
			System.out.println("5. Số lượng phiếu dự thưởng.");
			System.out.println("6. Rút thăm trúng thưởng.");
			System.out.println("7. In ra tất cả các phiếu.");
			System.out.println("0. Thoát khỏi chương trình");
			luaChon= sc.nextInt();
			sc.nextLine();
			if(luaChon==1|| luaChon==2|| luaChon==3) {
				System.out.println("Nhập vào mã phiếu dự thưởng: ");
				String giaTri = sc.nextLine();
				if(luaChon==1) {
					rt.themPhieu(giaTri);
				}else if(luaChon==2) {
					rt.xoaPhieu(giaTri);
				}else {
					System.out.println("Kiểm tra kết quả: "+rt.kiemTraPhieuTonTai(giaTri));
				}
			}else if(luaChon==4) {
				rt.xoaTatCaPhieuDuThuong();
			}else if(luaChon==5) {
				System.out.println("Số lượng phiếu: "+rt.laySoLuong());
			}
			else if(luaChon==6) {
				System.out.println("Mã số phiếu dự thưởng là : "+rt.rutMotPhieu());
			}else if(luaChon==7) {
				System.out.println("Các mã phiếu là: ");
				rt.inTatCa();
			}
		
		}while(luaChon!=0);
	
	
	}
}
