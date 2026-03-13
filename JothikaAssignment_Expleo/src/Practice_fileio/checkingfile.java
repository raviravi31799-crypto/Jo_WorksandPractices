package Practice_fileio;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class checkingfile {

	public static void main(String[] args) {
		Path p =Paths.get("C:\\Program Files\\Java\\jdk-25");
		Boolean res=Files.exists(p);
		System.out.println("Path: " + p +res);
	}

}
