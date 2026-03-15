/*Write a custom method myTrim(String s) that removes leading and trailing spaces from a string without using built-in trim().
Constraints:
•
Do not use: trim(), strip(), regex
•
Preserve internal spaces exactly as they are
Sample Input:
" Welcome to Java "
Sample Output:
"Welcome to Java"*/
package Tasks_Strings;
import java.util.*;
import java.lang.String;
public class Strings_2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:");
		String str=sc.nextLine();
		int start=0;
		int end=str.length()-1;
		while(start<=end && str.charAt(start)==' ') {
			start++;
		}
		while(end>=start && str.charAt(end)==' ') {
			end--;
		}
		String string="";
		for(int i=start;i<=end;i++) {
			string+=str.charAt(i);
		}
			System.out.println(string);
		
		
		

	}

}
