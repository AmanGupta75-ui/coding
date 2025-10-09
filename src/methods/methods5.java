package methods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class methods5 {
   public static void main() {
        Scanner sc=new Scanner(System.in);
        List<Integer> list= new ArrayList<>();
        list.add(2);
        list.add(4);
        int[] arr={2,3,4,5,6};

       summation(list,arr);



    }
 public static int[] summation(List<Integer> list, int [] arr){
     System.out.println(list);
     System.out.println(Arrays.toString(arr));
       return arr;
 }
}
