import java.util.Scanner;

public class input2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = 22;
        int b = 22;
        System.out.println(a++ + --b);
        System.out.println(a++ + --a);
        System.out.println(a-- + b++);
        System.out.println(a + --a);
        System.out.println(++a + --b);
        System.out.println(a++ + --a);
        System.out.println(--a + ++b);


    }
}