package fileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class WritingFile 
{
	public static void main(String[] args) 
	{
		try {
			FileWriter fw = new FileWriter("myfile.txt");
			fw.write("This is the content of this file");
			fw.close();
			System.out.println("File successfully written.");
		} catch (IOException e) 
		{
			System.out.println("An error occurred!");
			e.printStackTrace();
		}
		
	}

}
