package Practice_fileiostream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class iostreamchaining {

	public static void main(String[] args) {
		try(BufferedReader ip=new BufferedReader(new FileReader(args[0]));
				BufferedWriter op=new BufferedWriter(new FileWriter(args[1]))){
			String line="";
			while((line=ip.readLine())!=null) {
				op.write(line);
				op.newLine();
			}
		}
			catch (FileNotFoundException f) {
				System.out.println("File not found:" +f);
			}
			catch (IOException e) {
				System.out.println("Exception:"+e);
		}

	}

}
