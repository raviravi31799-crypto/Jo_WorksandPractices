package Practice_fileio;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.FileSystem;

public class filepath {

	public static void main(String[] args) {
		Path p1=Paths.get("C:\\Program Files\\Java\\jdk-25");
		Path normalizedPath=p1.normalize();
		Path p2=Paths.get("C:\\Program Files\\Java\\jdk-25");
		System.out.println("NormalizedPath:"+normalizedPath);
		Path subPath=p1.subpath(1, 3);
		System.out.println("SubPath:"+subPath);
		System.out.println("Filename:"+p1.getFileName());
		System.out.println("Parent:"+p1.getParent());
		System.out.println("Namecount:"+p1.getNameCount());
		System.out.println("Root:"+p1.getRoot());
		System.out.println("isAbsolute:"+p1.isAbsolute());
		System.out.println("toAbsolutePath:"+p1.toAbsolutePath());
		System.out.println("toURI:"+p1.toUri());
		if(p1.equals(p2)) {
			System.out.println("Both are equal");
		}
		else {
			System.out.println("Both are not equal");
		}
		
	}

}
