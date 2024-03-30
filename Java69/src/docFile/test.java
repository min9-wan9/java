package docFile;

import java.io.BufferedReader;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class test {
	public static void main(String[] args) {
		/* cach1
		File f = new File("C:\\Users\\admin\\eclipse-workspace\\Java69/test.txt");
		try {
			BufferedReader br= Files.newBufferedReader(f.toPath(),StandardCharsets.UTF_8);
			String line= null;
			while(true) {
				line= br.readLine();
				if(line==null) {
					break;
				}else {
					System.out.println(line);
				}
			}
		
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		*/
		
//		Cách2
		File f2= new File("C:\\Users\\admin\\eclipse-workspace\\Java69/text.txt.txt");
		try {
			List<String> allText = Files.readAllLines(f2.toPath(),StandardCharsets.UTF_8);
			for (String string : allText) {
				System.out.println(string);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
