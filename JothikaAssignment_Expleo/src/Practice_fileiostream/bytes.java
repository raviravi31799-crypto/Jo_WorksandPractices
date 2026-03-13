package Practice_fileiostream;

import java.io.FileOutputStream;

public class bytes {

	public static void main(String[] args) {
		String d="Welcome to Java!";
		try {
			FileOutputStream op=new FileOutputStream("src/Practice_fileiostream/input.txt");
			byte[]array=d.getBytes();
			op.write(array);
			op.close();
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}

}
