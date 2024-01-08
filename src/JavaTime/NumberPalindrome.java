package JavaTime;

public class NumberPalindrome {
    public  static void numpalindrome(int num ){
        //Number palindrome;
//        A palindrome is a word, phrase, number, or sequence of
//        words that reads the same backward as forward.
        int rev=0;
        int temp=num;
        while(num!=0){
           int  rem=num%10;
            rev=rev*10+rem;
            num/=10;
        }
        System.out.println(rev);
        if(temp==rev){
            System.out.println("Palindrome Number");
        }else{
            System.out.println(" Not a Palindrome Number");
        }


    }

//    public static void main(String[] args) {
//        int num=123;
//        numpalindrome(num);
//    }
}
