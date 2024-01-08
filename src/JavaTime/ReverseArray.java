package JavaTime;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class ReverseArray {
    public static void revarr(int arr[]){
//        int n=arr.length;
//        int a[] =new int[5];
//        int j=n;
//        for(int i=0;i<n;i++) {
//            a[j - 1] = arr[i];
//            j = j - 1;
//        }
//           for(int k=0;k<n;k++){
//               System.out.println(a[k]);
//           }
//        int lb=0;
//        int ub=arr.length-1;
//        while (lb<ub){
//            int temp=arr[lb];
//            arr[lb]=arr[ub];
//            arr[ub]=temp;
//            lb++;
//            ub--;
//        }
        Collections.reverse(Arrays.asList(arr));
        System.out.println("Reversed array is ::");
        for(int k=0;k<arr.length;k++){
              System.out.print(arr[k]);
           }


    }

    public static void main(String[] args) {
        int arr[]=new int[5];
        Scanner scanner=new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            arr[i]=scanner.nextInt();
        }
        revarr(arr);
    }
}
