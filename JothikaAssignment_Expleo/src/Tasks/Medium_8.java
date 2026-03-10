package Tasks;
import java.util.*;
public class Medium_8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String s=sc.nextLine();
		int Letters=0,digits=0,sym=0;
		for(int i=0;i<s.length();i++) {
			if((s.charAt(i)>='a'&& s.charAt(i)<='z')||(s.charAt(i)>='A' && s.charAt(i)<='Z')) {
				Letters++;
			}
			else if(s.charAt(i)>='0'&& s.charAt(i)<='9') {
				digits++;
			}
			else {
				sym++;
			}
			
		}
		System.out.println("Letters :" +Letters+ " Digits: " +digits+ " Other Symbols:" +sym );

	}

}
