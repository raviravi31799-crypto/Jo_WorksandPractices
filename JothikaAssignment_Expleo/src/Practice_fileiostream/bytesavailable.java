package Practice_fileiostream;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class bytesavailable {

	public static void main(String[] args) {
		byte[]b=new byte[128];
		try(FileInputStream ip=new FileInputStream("src/Practice_fileiostream/input.txt");
				FileOutputStream op=new FileOutputStream("src/Practice_fileiostream/output.txt")) {
	                System.out.println("Bytes available:"+ip.available());
				int c=0;int read=0;
				while((read=ip.read(b))!=-1) {
					op.write(b);
					c+=read;
				}
		
				System.out.println("Total Count :"+c);
		}

	catch (FileNotFoundException f) {
	System.out.println("File not found:"+f);
}
catch (IOException e) {
	System.out.println("IOException:"+e);
	
}		
	}			
	}


