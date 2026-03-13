package Practice_fileiostream;

import java.io.FileInputStream;

public class inputstream {

	public static void main(String[] args) {
		try {
			FileInputStream inp= new FileInputStream("src/Practice_fileiostream/input.txt");
			int i=inp.read();
			while(i!=-1) {
				System.out.print((char)i);
				i=inp.read();
			}
			inp.close();
			
		}
		catch (Exception e) {
			System.out.println(e);
		}

	}

}
