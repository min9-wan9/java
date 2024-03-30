package main68;

import java.io.File;
import java.util.Scanner;

public class ViDuFile {
	File file;
	
	
	
	
	public ViDuFile(String tenFile) {
		this.file = new File(tenFile);
	}
	
	public boolean checkExecute() {
		// 1. Kiểm tra file có thể thực thi
		return this.file.canExecute();
	}
	public boolean checkRead() {
		// kiểm tra có thê đọc
		return this.file.canRead();
	}
	
	public boolean checkRecord() {
		// kiểm tra có thể ghi
		return this.file.canWrite();
	}

	public void inDuongDan() {
		System.out.println(this.file.getAbsolutePath());
	}
	
	public void inTen() {
		System.out.println(this.file.getName());
	}
	
	public void kiemTraLaThuMucHoacTapTin() {
		if(this.file.isDirectory()) {
			System.out.println("Đây là thư muc");
		}else if(this.file.isFile()) System.out.println("Đây là tập tin");
	}

	public void inDanhSachFileCon() {
		if(this.file.isDirectory()) {
			System.out.println("Các tập tin con/ thư mục con là: ");
			File []	mangCon=this.file.listFiles();// tạo danh sách file con
			for (File file : mangCon) {
				System.out.println(file.getAbsolutePath());
			}
		}else if(this.file.isFile()) {
			System.out.println("Đây là tập tin, không có dữ liệu con bên trong");
		}
	}
	
	public void inCayThuMuc() {
		this.inChiTietCayThuMuc(this.file,1);
	}
	public void inChiTietCayThuMuc(File f, int bac) {
		for(int i=0;i<bac;i++) {
			System.out.print("\t");
			
			}System.out.println(f.getName());
			if(f.canRead() && f.isDirectory()) {
				File[] mangCon= f.listFiles();
			for (File fx : mangCon) {
				inChiTietCayThuMuc(fx, bac+1);
			}
			
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int luaChon= 0;
		System.out.println("Nhập tên file: ");
		String tenFile = sc.nextLine();
		ViDuFile vdf = new ViDuFile(tenFile);
		
		do {
			System.out.println("--------------");
			System.out.println("MENU:");
			System.out.println("1. Kiểm tra file có thể thực thi");
			System.out.println("2. Kiểm tra file có thể đọc");
			System.out.println("3. Kiểm tra file có thể ghi:");
			System.out.println("4. Đường dẫn: ");
			System.out.println("5. In tên file: ");
			System.out.println("6. Kiểm tra dile là thư mục: ");
			System.out.println("7. In ra danhh sách các file con: ");
			System.out.println("8.In ra cây thư mục: ");
			System.out.println("0. Thoát khỏi chương trình");
			luaChon=sc.nextInt();
			sc.nextLine();
			switch (luaChon) {
			case 1: {
				System.out.println("File có thể thực thi: "+vdf.checkExecute());
				break;
				
			}
			case 2: {
				System.out.println("File có thể đọc: "+vdf.checkRead());
				break;
				
			}
			case 3: {
				System.out.println("File có thể ghi: "+vdf.checkRecord());
				break;
				
			}
			case 4: {
				vdf.inDuongDan();
				break;
				
			}
			case 5: {
				vdf.inTen();
				break;
				
			}
			case 6: {
				vdf.kiemTraLaThuMucHoacTapTin();
				break;
				
			}
			case 7: {
				vdf.inDanhSachFileCon();;
				break;
				
			}
			case 8: {
				vdf.inCayThuMuc();
				break;
				
			}
			default:
				break;
			}
		}while(luaChon!=0);
	}
}
