package fileHandling;

import java.io.File;
import java.io.IOException;

public class CreatingFile 
{
	public static void main(String[] args){
		
		File f = new File("myfile.txt");
		try {
			if(f.createNewFile())
			{
				System.out.println("File created - " + f.getName());
			}
			else
			{
				System.out.println("File already exists");
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
