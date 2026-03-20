package Tasks_Arrays;

import java.util.*;
import java.util.Arrays;

public class Missingnumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size:");
		int size = sc.nextInt();
		System.out.println("Enter array elements:");
		int[] arr = new int[size];
		for (int i = 0; i < arr.length-1; i++) {
			arr[i] = sc.nextInt();

		}
		Arrays.sort(arr);
		String missing = " ";

		for (int i = 0; i < arr.length-1; i++) {
			for (int j = arr[i] + 1; j < arr[i + 1]; j++) {
				missing += j + " ";
			}

		}
		System.out.println("Missing number:" + missing);

	}

}
