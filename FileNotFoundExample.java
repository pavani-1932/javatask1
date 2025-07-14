package javaassignment4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileNotFoundExample {

	public static void main(String[] args) {
		
		
		try {
			
			FileInputStream fis=new FileInputStream("nonExistentFile.txt");
			System.out.println("File Opened Successfully");
		}catch(FileNotFoundException fe) {
			
			System.out.println("Error : File Not Found!");
			System.out.println("Details: "+ fe.getMessage());
			fe.printStackTrace();
		}

	}

}
