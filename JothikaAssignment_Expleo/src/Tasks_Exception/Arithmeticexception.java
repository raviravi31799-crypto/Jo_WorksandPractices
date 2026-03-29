package Tasks_Exception;
import java.util.Scanner;

class MyCalculator {

    long power(int n, int p) throws Exception {

        if (n < 0 || p < 0) {
            throw new Exception("n or p should not be negative.");
        }

        if (n == 0 && p == 0) {
            throw new Exception("n and p should not be zero.");
        }

        long result = 1;

        for (int i = 1; i <= p; i++) {
            result = result * n;
        }
        return result;
       
    }
}

public class Arithmeticexception {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        MyCalculator obj = new MyCalculator();

        int n = sc.nextInt();
        int p = sc.nextInt();

        try {
            long result = obj.power(n, p);
            if(result !=0)
            System.out.println(result);
        } catch (Exception e) {
            System.out.println(e);
        }

        sc.close();
    }
}