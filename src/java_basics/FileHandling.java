package java_basics;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileHandling {

	public static void main(String[] args) {

		File ipFile= new File("C:\\Users\\Saravanan\\Downloads\\Documents\\Sample.pdf");
		File opFile=new File("C:\\Users\\Saravanan\\Downloads\\Documents\\Sample-copy.pdf");
		
		FileInputStream inputFileStream= null;
		FileOutputStream outputFileStream= null;
				
		try {
			inputFileStream= new FileInputStream(ipFile);
			outputFileStream=new FileOutputStream(opFile);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		int i=0;
		try {
			while((i=inputFileStream.read())!= -1)
			{
				outputFileStream.write(i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		//inputFileStream.available() ->total no of bytes in file
		
		
		finally {
			System.out.println("Inside Finally Block");
			
			if(inputFileStream!=null)
			{
				try {
					inputFileStream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(outputFileStream!=null)
			{
				try {
					outputFileStream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

		
		
		
	}

}
