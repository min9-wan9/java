package chuaCau2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Book {
	private int id;
	private String name;
	private String publisher;
	public Book(int id, String name, String publisher) {
		
		this.id = id;
		this.name = name;
		this.publisher = publisher;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	@Override
	public String toString() {
		return "Book [id= " + id + ", name= " + name + ", publisher= " + publisher + "]";
	}
	
	
	
}
public class Question2 {
	public static void main(String[] args)  {
		try {
			FileReader fr= new FileReader("book.txt.txt");
			Scanner sc = new Scanner(fr);
			List<Book> books= new ArrayList<>();
			while(sc.hasNext()) {
				String line = sc.nextLine();
				String [] data= line.split(";");
				Book book = new Book(Integer.parseInt(data[0]),data[1],data[2]);
				// Integer.pasent : chuyển đổi từ String sang InteGer
				books.add(book);
			}
			System.out.println("Tổng số sách: "+books.size());
			System.out.println(books);
			
			Collections.sort(books,(b1,b2)->{
				return b1.getName().compareTo(b2.getName());
			});
			System.out.println(books);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
				
				
	}
}
