package com.learn;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exception_file {
public static void main(String[] args) throws IOException {
	System.out.println("program starts here");
	try {
	File file = new File("D:\\\\Files\\\\Class Notes\\\\Notes\\\\Goutham\\\\Constructo.txt");
	FileReader fr= new FileReader(file);
	int ch;
	while((ch=fr.read())!=-1) {
		System.out.println((char)ch);
	}
	}catch(FileNotFoundException e) {
		e.printStackTrace();
	}
	catch(IOException e) {
		e.printStackTrace();
	}
	System.out.println("program ends here");
}
}
