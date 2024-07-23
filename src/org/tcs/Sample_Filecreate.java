package org.tcs;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Sample_Filecreate {
public static void main(String[] args) throws IOException {
//	File file = new File("C:\\varshini\\vishnu\\text.txt");
//	boolean mkdir=file.mkdir();
//System.out.println(mkdir);
//	boolean newFile=file.createNewFile();
//	System.out.println(newFile);
//	FileWriter fw=new FileWriter(file);
//	for(int i=1;i<4;i++) {
//		fw.write("Welcome to AiiTE");
//	}
//	fw.close();
//	System.out.println("Successfully written");
//	
	FileWriter fw=new FileWriter("C:\\varshini\\vishnu\\test.txt");    
    fw.write("Welcome to AiiTE.");    
    fw.close();
}
}
