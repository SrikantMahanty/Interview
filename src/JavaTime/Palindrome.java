package JavaTime;

public class Palindrome {
    public void palindromeString(String str){
        char []  ch=str.toCharArray();
//        for(int i=0;i<str.length();i++){
//            System.out.println(ch[i]);
            char temp;

            for (int k=0, j=str.length()-1; k<j; k++,j--)
            {
                temp = ch[k];
                ch[k] = ch[j];
                ch[j] = temp;
            }


            System.out.println(ch);
            if(str==ch.toString()){
                System.out.println("it is String palindrome");
            }else{
                System.out.println("it is niot");

        }

        }

    }

