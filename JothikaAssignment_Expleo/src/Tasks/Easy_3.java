package Tasks;
import java.util.*;
public class Easy_3 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Character:");
	char c=sc.next().charAt(0);
	switch(c) {
	case 'a','e','i','o','u','A','E','I','O','U':{
		System.out.println("Vowel");
	}
	case '!','@','%','$','&','<','>','/':{
	 System.out.println("Symbol");
	
	}
	default:{
		if(c>='a'&& c>='A'|| c<='z'&& c<='Z') {
			System.out.println("Consonant");
		}
		else {
     		System.out.println("Invalid");
		}
	}
		
	}
	}
}
