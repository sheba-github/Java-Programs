package java_basics;

import java.io.File;
import java.util.Arrays;

public class PrintFileAndDirectory {

	public static void main(String[] args) {

		File ipfile = new File("C:\\");
		File[] list = ipfile.listFiles();
		Arrays.sort(list);
		for(File e: list)
		{
			System.out.println("File: "+e.getName()+" "+ e.hashCode());
		try {
			System.out.println("Directory: "+e.getName()+" "+e.getAbsolutePath());
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		
		
	    }

}}
