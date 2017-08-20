package com.shiyanlou.course;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileTest {
	public static void main(String[] args) throws IOException {
		try {
			//FileInputStream file = new FileInputStream("/home/shiyanlou/Desktop/shiyanlou.txt");
//			BufferedInputStream file = new BufferedInputStream(new FileInputStream("/home/shiyanlou/Desktop/shiyanlou.txt"));
//			int data = 0;
//			while((data = file.read()) != -1) {
//				System.out.println(data);
//			}
//			file.close();
			FileReader file = new FileReader("/home/shiyanlou/Desktop/shiyanlou.txt");
			int data = 0;
			while((data=file.read())!=-1){
			    System.out.print((char)data);
			}

			file.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
