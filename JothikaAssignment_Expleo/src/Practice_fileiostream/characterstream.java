package Practice_fileiostream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class characterstream {

	public static void main(String[] args) {
		char[]b=new char[128];
		try (FileReader r=new FileReader(args[0]);
				FileWriter w=new FileWriter(args[1])) {
			int c=0;int read=0;
			while((read=r.read(b))!=-1) {
				w.write(b);
				c+=read;
				System.out.println(Arrays.toString(b));
			}
			System.out.print(("Total count:"+c+"characters"));
		}catch (FileNotFoundException f) {
			System.out.println("File not found");
		}
		catch (IOException e) {
			System.out.println("IOException:"+e);
		}

	}

}
