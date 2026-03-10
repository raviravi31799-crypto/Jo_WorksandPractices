package Tasks;
import java.util.*;
public class Easy_5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char start='a';
		char end='z';
		for(int i=0;i<26;i++) {
			System.out.print("" + (char)(start + i) + (char)(end - i) + " ");
		}
	}

}
