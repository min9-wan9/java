package main67;

import java.io.File;
// đối tượng tương tác với thư mục
import java.io.IOException;

public class ViDu {
	public static void main(String[] args) {
		//Lưu ý :
		// MS Window: \ ==> Ví dụ: "C:\\Thu muc\\Thu muc\\Ten tap tin.xxx";
		// Linux,MacOS / | Vi du: / Thu muc1 / Thu muc 2/ten tap tin.xxx";
		File foder1= new File("C:\\Users\\admin\\eclipse-workspace\\Java67");
		File foder2= new File("C:\\Users\\admin\\eclipse-workspace\\Java69");
	
		System.out.println("Kiểm tra folder1 có tồn tại không: "+foder1.exists());
		System.out.println("Kiểm tra folder2 có tồn tại không: "+foder2.exists());
	
		// Tạo thư mục
		// phương thức Mkdir() ==> Tạo một thư mục
		File d1= new File("C:\\Users\\admin\\eclipse-workspace\\Java67/Directory_1");
		d1.mkdir();
		
		// Phương thức mkdirs() ==> tạp nhiều thư mục cùng lúc
		File d2= new File("C:\\Users\\admin\\eclipse-workspace\\Java67\\Directory_1\\Directory_2\\Directory_3");
//		d2.mkdir();
		d2.mkdirs();
		
		// Tạo tập tin ( có phần mở rộng: exe, txt, doc,xls....)
		
		File file= new File("C:\\Users\\admin\\eclipse-workspace\\Java67/Directory_1/Vidu1.txt");
		try {
			file.createNewFile();
		} catch (IOException e) {
			// Không có quyền tạo tập tin
			// Ổ cứng bị đầy
			// Đường dẫn bị sai
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
}
