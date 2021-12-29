import java.io.*;
import java.util.*;
interface PerformOperation {
    boolean check(int a);
}
class MyMath {
    public static boolean checker(PerformOperation p, int num) {
        return p.check(num);
    }

    PerformOperation isOdd()
    {
        PerformOperation po = (int a)-> a%2 == 0 ? false : true;
        return po;
    }
    PerformOperation isPrime()
    {return (int a) -> java.math.BigInteger.valueOf(a).isProbablePrime(1);
//        PerformOperation po = (int a)->
//        {
//
//            if(a == 1) {
//                return true;
//            }
//            else {  System.out.println(a);
//                for (int i = 2; i < a/2; i++) {
//                    System.out.println(i);
//                    if (a % i == 0) return false;
//                }
//
//            }return true;
//
//        };
//        return po;
    }
    PerformOperation isPalindrome()
    {
        ArrayList<Integer> aa = new ArrayList<>();
        PerformOperation po = (int a)->
        {
            String str = Integer.toString(a);
            String reverse = "";
            for(int i = str.length()-1; i >= 0; i--)
            {
                reverse = reverse + str.charAt(i);
            }
            if(reverse.equals(str)) return true;
            return false;
        };
        return po;
    }
}

