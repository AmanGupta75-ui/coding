import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       int next=sc.nextInt();
        int first=0;
        int second=1;
        int last=1;
        for(int i=0; i<next; i++){
            System.out.println("term:" + last +" value:"+first);
            int third =first +second;
            first=second;
            second= third;

            last++;


        }

    }
}
