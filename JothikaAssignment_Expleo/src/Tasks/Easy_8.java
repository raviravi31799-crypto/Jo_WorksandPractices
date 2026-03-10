package Tasks;
import java.util.*;
public class Easy_8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Character:");
		char ch=sc.next().charAt(0);
		if(ch>='a'&&ch<='z'||ch>='A'&& ch<='Z') {
			System.out.println("Alphabet");
		}
		else if(ch>='0'&&ch<='9') {
			System.out.println("Digit");
		}
		else {
			System.out.println("Special symbol");
		}

	}

}
