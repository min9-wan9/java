package baiLam;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Main {
	public static void main(String[] args) {
		ProductManagement pd= new ProductManagement();
		Product pd1= new Product(3, "Tivi","Electronic" ,20);
		Product pd2= new Product(4, "Tủ lạnh","Electronic" ,210);
		Product pd3= new Product(5, "Máy giặt","Electronic" ,40);
		pd.Add(pd1);
		pd.Add(pd3);
		pd.Add(pd2);
		
		
		
	}
}
