package JavaTime;

import java.util.Stack;

public class Reverse {
    //String reverse. Write a method that
    // will take one string as an argument and
    // will return the reverse version of this string.
    public void reverseString(String str) {

        //Using StringBuilder class
//       StringBuffer sb=new StringBuffer(str);
//        StringBuilder sb1=new StringBuilder(str);
//        String res = sb.reverse().toString();
//            System.out.println(res);

//        Using Stack

        Stack<Character> st = new Stack<>();
        for (char c : str.toCharArray()) {
            st.push(c);
        }
        String temp = "";
        while (!st.isEmpty()) {
            temp += st.pop();
        }
        System.out.println(temp);

    }
}
