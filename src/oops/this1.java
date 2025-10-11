package oops;

public class this1 {
     public static void main( String[] args) {
         Student aman= new Student(36);



    }
}
class Student{
    int rollnumber;
    String name;
    float marks;

Student(int rollnumber){
    this.rollnumber=rollnumber;
    this.name="aman";
    this.marks=35.23f;
}


 Student(int rollnumber,String name,float marks){
    this.rollnumber=rollnumber;
    this.name=name;
    this.marks=marks;
 }
}