import java.util.*;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc=new scanner (System.in);
        System.out.print("Enter a number : ");
        int num =sc.nextInt();
        int rem=0 , rev=0;
        while(num!=0) {
            
                rem = num % 10;
                rev = rev * 10 + rem;
                num = num/ 10;
        }
        System.out.printf("\nThe Reverse number is : ",rev);
    }
}
