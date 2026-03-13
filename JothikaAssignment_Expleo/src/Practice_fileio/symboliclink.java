package Practice_fileio;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class symboliclink {

	public static void main(String[] args) {
		Path existingFilePath=Paths.get("C:\\Program Files\\Java\\jdk-25");
		Path symPath=Paths.get("C:\\Program Files");
		try {
			Files.createSymbolicLink(symPath,existingFilePath);
		}
		catch (IOException x) {
			System.err.println(x);
		}
		catch (UnsupportedOperationException x) {
			System.out.println(x);
		}
		
	}

}
