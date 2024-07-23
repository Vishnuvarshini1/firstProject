package org.tcs;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Sample_Fileread {
public static void main(String[] args) throws IOException {
	File file = new File("C:\\varshini\\vishnu\\test.txt");
	FileReader fr = new FileReader(file);
	int ch;
	while((ch=fr.read())!=-1){
		System.out.println((char)ch); //type casting from int to char
	}
}
}
