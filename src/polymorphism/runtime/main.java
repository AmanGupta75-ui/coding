package polymorphism.runtime;

public class main {
     public static void main(String[] args) {

         shape s1= new shape();
         s1.area();
         triangle t1= new triangle();
         t1.area();
          square s2= new square();
           s2.area();
           circle c1= new circle();
           c1.area();
           shape s3= new circle();
           s3.area();
    }
}
