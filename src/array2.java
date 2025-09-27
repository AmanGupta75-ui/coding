import java.util.Arrays;
import java.util.Scanner;
public class array2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

    /*    String[] str=new String[4];
        str[0]="aman";
        str[1]="ayush";
        str[2]="ashu";
        str[3]="atul";
        System.out.println(Arrays.toString(str));

        String[] str1={"aa","bb","cc","dd"};
        System.out.println(Arrays.toString(str1));


        int n= sc.nextInt();
         int [] ans =new int[n];


         for(int i=0; i<n;i++){
             ans[i]=sc.nextInt();
         }
        System.out.println(ans[0]);
        System.out.println(ans[1]);

        System.out.println(Arrays.toString(ans));

        for(int i=0;i<n;i++){
            System.out.println(ans[i]+" ");
        }

     */
        int n=sc.nextInt();
        sc.nextLine();
        String[] str=new String[n];
        for (int i=0;i<n;i++){
            str[i]=sc.nextLine();
        }
        for(int i=0; i<n;i++){
            System.out.println(str[i]+" ");
        }
        for(int i=0; i<n;i++){
            System.out.print(str[i]+" ");
        }
    }


}
