package main69;

import java.io.File;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

public class ViDuXoaFile {
	
	public static void xoaFile(File fx) {
		if(fx.isFile()) {
			// xóa nếu là tập tin
			System.out.println("Da xoa: "+fx.getAbsolutePath());
			fx.delete();
		}else if(fx.isDirectory()) {
			// lấy các file con
			
			File[] mangCon= fx.listFiles();
			for (File file : mangCon) {
				// xoa các dile con
				xoaFile(file);
			}
			// xoa ban than thu muc sau khi xoa cac file con
			System.out.println("Da xoa: "+fx.getAbsolutePath());
			fx.delete();
		}
	}
	
	public static void main(String[] args) {
		File f0= new File("C:\\Users\\admin\\eclipse-workspace\\Java69/f0");
		File f0_3= new File("C:\\Users\\admin\\eclipse-workspace\\Java69/f0_3");
		File vidy= new File("C:\\Users\\admin\\eclipse-workspace\\Java69/vidy");
	
////		f0.delete();
//		f0.deleteOnExit();// xóa ko đc vì có chứa thư mục  và tập tin
//		f0_3.deleteOnExit();// có thể xóa đc  vì là thư mục rỗng
//		vidy.deleteOnExit();// xoa đc vì là một tập tin
//		System.out.println(f0_3.delete());
//		
//		ViDuXoaFile.xoaFile(f0);
		
		// Sử dụng class files xoa tập tin và thư mục
		Path p=f0.toPath();
		Path p03= f0_3.toPath();
		Path pviDu= vidy.toPath();
	
		try {
			
			Files.deleteIfExists(p03);
			Files.deleteIfExists(pviDu);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
