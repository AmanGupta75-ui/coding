package example;

public class innerclas {
     static  class test{
          String  name;
           public  test(String name){
                this.name= name;
           }
     }

     public static void main(String[] args) {
          test a= new test("name");
          test b= new test(" amana");
         System.out.println(a.name);
         System.out.println(b.name);

    }

}
