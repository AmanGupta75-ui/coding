package polymorphism.runtime;

class num {
    int num;

    public num
            (int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return  "num"+"="+num;
    }
}
class overriding{
     public static void main(String[] args) {
         num n1= new num(35);
         System.out.println(n1);

    }

}
