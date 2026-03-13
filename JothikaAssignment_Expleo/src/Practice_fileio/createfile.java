package Practice_fileio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class createfile {

	public static void main(String[] args)throws IOException {
		Path p=Paths.get("C:\\Users\\YourName\\Desktop\\data.txt\r\n");
		if(Files.exists(p)) {
			System.out.println("File exists");
		}
		else {
			Files.createFile(p);
			System.out.println("File created");
		}
		
	}

}
