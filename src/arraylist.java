import java.util.ArrayList;
import java.util.Scanner;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>(6);
        Scanner sc= new Scanner(System.in);


        list.add(2);
        list.add(22333);
        list.add(23);
        list.add(256);
        list.add(2643);
        list.add(2456);
        list.add(24523);
        list.add(287856);
        System.out.println(list);

        System.out.println(list.get(0));
        System.out.println(list.contains(2));
        list.remove(2);

        System.out.println(list);

        System.out.println(list.contains(2));
        System.out.println(list.equals(23));

        list.set(5,54654665);
        System.out.println(list);

        int n=sc.nextInt();
        for(int i=0; i<n; i++){
            list.add(sc.nextInt());
        }
        for( int i=0; i<n; i++ ){
            System.out.println(list.get(i)+" ");
        }


    }
}
