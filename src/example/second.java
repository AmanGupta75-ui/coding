package example;

public class second {
     public static void main(String[] args) {

          first aman= new first(14,"aman",false,"male");
         second obj= new second();
         System.out.println(first.population);
       greeting();
    }
    static  void greeting(){
        System.out.println("hello ");
         second obj1= new second();
         obj1.greet();


    }
    void greet(){
        System.out.println( "hii");
    }
    void you(){
         greeting();
    }
    void my(){
         greet();
    }
}
