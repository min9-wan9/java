package cau1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookController extends Input implements Activity,Search {
	
	private List<Book> books = new  ArrayList<>();
	
	@Override
	public void searchByName(String Name) {
		Book book = null;
		for(int i=0;i<books.size();i++) {
			if(books.get(i).getName().toLowerCase().contains(Name.toLowerCase())) {
				book= books.get(i);
			}
		}
		if(book!= null) {
			System.out.println("Id "+book.getId() +"Name "+book.getName());
		}else {
			System.out.println("Khong trung mã");
		}
	}

	@Override
	public void add() {
		System.out.println("Nhap thong tin sach");
		System.out.println("Nhap id: ");
		Integer id=inputScannerInt();
		System.out.println("Nhap ten: ");
		String name= inputScannerString();
		System.out.println("Nhap nxb: ");
		String publisher = inputScannerString();
		books.add(new Book(id,name,publisher));
		
	}

	@Override
	public void edit() {
		System.out.println("Nhap id: ");
		Integer id= inputScannerInt();
		Book book=null;
		for(int i=0;i<books.size();i++) {
			if(books.get(i).getId().equals(id)) {
				book=books.get(i);
			}
		}
		if(book !=null) {
			System.out.println("Nhập tên: ");
			book.setName(inputScannerString());
			System.out.println("Nhập nxb: ");
			book.setPublishing(inputScannerString());
		}else {
			System.out.println("Khong trung mã!");
		}
		
	}

	@Override
	public void remove() {
		System.out.println("Nhap id sach: ");
		Integer id= inputScannerInt();
		Book book = null;
		for(int i=0;i<books.size();i++) {
			if(books.get(i).getId().equals(id)) {
				book= books.get(i);
			}
		}
		if(book!=null) {
			books.remove(book);
		}else {
			System.out.println("Khong trung ma");
		}
		
	}
	public void menu() {
		
		 Integer luaChon=null;
		do {
			System.out.println(" 1: Thêm\r\n"
				+ " 2: Sửa \r\n"
				+ " 3: Xoá\r\n"
				+ " 4: Tìm kiếm\r\n"
				+ " 5: Thoát");
			  luaChon = inputScannerInt();
			 sc.nextLine();
			 if(luaChon==1) {
				 add();
			 }else if(luaChon==2) {
				 edit();
			 }else if(luaChon==3) {
				 remove();
			 }
			 else if(luaChon==4) {
				 System.out.println("Nhập tên sách: ");
				 String s= inputScannerString();
				 searchByName(s);
				 
			 }
			 

			}while(luaChon !=5);
		
		
		
	}

}
