package JavaTime;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {

        Reverse reverse = new Reverse();

        Palindrome palindrome=new Palindrome();
        NumberPalindrome numberPalindrome=new NumberPalindrome();


        System.out.println("Enter a string/Integer  here ");
        Scanner sc = new Scanner(System.in);
        String Str = sc.nextLine();
        int num=sc.nextInt();
      //  reverse.reverseString(Str);
        palindrome.palindromeString(Str);
        numberPalindrome.numpalindrome(num);
    }
}
