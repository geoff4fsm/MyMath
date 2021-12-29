import java.io.*;
import java.util.StringTokenizer;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) throws IOException {
        MyMath ob = new MyMath();
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        input.nextLine();
        PerformOperation op;
        boolean ret = false;
        String ans = null;
        while (T--> 0) {
            String s = input.nextLine();
            StringTokenizer st = new StringTokenizer(s);
            int ch = Integer.parseInt(st.nextToken());

            int num = Integer.parseInt(st.nextToken());
            if (ch == 1) {
                op = ob.isOdd();
                ret = ob.checker(op, num);
                ans = (ret) ? "ODD" : "EVEN";
            } else if (ch == 2) {
                //System.out.println(num);
                op = ob.isPrime();
                ret = ob.checker(op, num);
                ans = (ret) ? "PRIME" : "COMPOSITE";
            } else if (ch == 3) {
                op = ob.isPalindrome();
                ret = ob.checker(op, num);
                ans = (ret) ? "PALINDROME" : "NOT PALINDROME";

            }
            System.out.println(ans);
        }
    }
}

