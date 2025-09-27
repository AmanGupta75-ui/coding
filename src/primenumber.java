import java.util.Scanner;
public class primenumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int term= sc.nextInt();

        boolean istrue=true;
        for(int i=2; i<term;i++){
            if (term%i==0){
                istrue=false;
                break;
            }
        }

        if(istrue==true){
            System.out.println("Prime number:"+term);
        }
        else{
            System.out.println("Not a Prime Number:");
        }

    }
}
