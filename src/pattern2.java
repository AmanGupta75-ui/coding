import java.util.Scanner;
public class pattern2 {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
         int start;

        for(int i=1;i<=n; i++){
            if(i % 2==0) {
                start = 1;

            }
            else{
                start=0;
            }

            for(int j=0;j<i; j++){
                System.out.print(start);
                if(start==0){
                    start=1;
                }
                else{
                    start=0;
                }


            }
            System.out.println();
        }
    }

}
