//Question 5
package Tasks_Strings;
import java.util.*;
public class Encryptmessage {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.printf("User=");
		String user=sc.nextLine();
		System.out.printf("Password=");
		String pwd=sc.nextLine();
		System.out.printf("IP=");
		String ip=sc.nextLine();
		System.out.printf("Status=");
		String status=sc.nextLine();
		String maskedpwd=pwd.replaceAll(".*","******");
		String eip=ip.replaceAll("\\d+", "XXX");
		System.out.printf("User="+user+";");
		System.out.printf("password="+maskedpwd+";");
		System.out.printf("IP="+eip +";");
		System.out.printf("Status="+status);
		
	}

}
