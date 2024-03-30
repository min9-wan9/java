package cau2;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		File f = new File("C:\\Users\\admin\\eclipse-workspace\\Java72/txt.txt.txt");
		try {
			List<String> sach= Files.readAllLines(f.toPath(), StandardCharsets.UTF_8);
			System.out.println("Tổng số sách: "+sach.size());
			for (String thongTin : sach) {
				System.out.println(thongTin);
			}
			Collections.sort(sach, Comparator.comparing(o->o));
			System.out.println("Sau khi sắp xếp: ");
			for (String string : sach) {
				System.out.println(string);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	}
}
