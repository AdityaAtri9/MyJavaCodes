package fileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingFile 
{
	public static void main(String[] args) 
	{
		File f = new File("myfile.txt");
		try {
			Scanner sc = new Scanner(f);
			while(sc.hasNextLine())
			{
				String line = sc.nextLine();
				System.out.println(line);
			}
		} catch (FileNotFoundException e) 
		{
			System.out.println("An error occurred!");
			e.printStackTrace();
		}
	}

}
