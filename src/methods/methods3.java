package methods;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class methods3 {
   static   Scanner sc= new Scanner(System.in);

   public    static void main() {
       System.out.println(rollnumber());

    }
    public static List<Integer>rollnumber(){
       int n= sc.nextInt();
       List<Integer>list =new ArrayList<>();
       for(int i=0;i<n; i++){
           list.add(sc.nextInt());
       }
       return list;
    }

}
