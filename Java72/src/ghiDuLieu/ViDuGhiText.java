package ghiDuLieu;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class ViDuGhiText {
	public static void main(String[] args) {
		PrintWriter pw;
		try {
			pw = new PrintWriter("C:\\Users\\admin\\eclipse-workspace\\Java72/file.txt","UTF-8");
		pw.println("Xin chào mk là quang");
		pw.flush();
		pw.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}
}
