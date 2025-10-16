package example;

public class staticblock {
     static  int a=65;
     static   int b;

     static {
         System.out.println(" i am in  static block");
         b=a*5;
     }

     public static void main( String[] args) {
         System.out.println( staticblock.a +" "+ staticblock.b);
         staticblock ab= new staticblock();
         System.out.println( staticblock.a +" "+ staticblock.b);

         b=b +5324;
         staticblock abcbc= new staticblock();
         System.out.println(staticblock.a+" "+ staticblock.b);
    }
}
