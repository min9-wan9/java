package inputOutput;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOError;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class InputOutDemo {
	public static void main(String[] args) {
		File file = new File("test.txt");
		if(file.exists()) {
			try {
				file.createNewFile();
				System.out.println("Tạo file thành công");
			} catch (IOException ex) {
				// TODO: handle exception
				System.out.println("Tạo file thành công");
			}
		}
		try {
			FileWriter fileWriter= new FileWriter("test.txt");
			
			fileWriter.append("Book One,1991\n");
			fileWriter.append("Book twp,1995\n");
			fileWriter.append("Book three,1996\n");
			
			fileWriter.flush();
			fileWriter.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Unable to write file");
			e.printStackTrace();
		}
		try {
			FileReader fileReader = new FileReader("test.txt");
			Scanner sc = new Scanner(fileReader);
			
			while(sc.hasNext()) {
				
				System.out.println(sc.nextLine());
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
// System.in : input
// System. out : out put
// System.err: lỗi
	 
	 
}
