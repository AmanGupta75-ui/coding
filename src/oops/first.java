package oops;

public class first {
   public static void main(String[] args) {
       student ans= new student();
       System.out.println(ans.rollnumber);
       System.out.println(ans.marks);
       System.out.println(ans.name);
       ans.rollnumber=12;
       ans.marks=32.54f;
       ans.name="aman";
       System.out.println(ans.rollnumber);
       System.out.println(ans.marks);
       System.out.println(ans.name);


    }
}
  class student {
      int rollnumber;
      String name;
      float marks;

  }