package example;


public class first {

  int age;
   String name;
   Boolean married;
   String gender;
   static  int population;

    public first(int age, String name, Boolean married, String gender) {
        this.age = age;
        this.name = name;
        this.married = married;
        this.gender = gender;
        first.population +=1;
    }
}

