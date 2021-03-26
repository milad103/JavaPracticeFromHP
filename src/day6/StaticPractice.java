package day6;

public class StaticPractice {

    static int a = 15;
    static int b = 10;
    int z = 100;


    public static void main(String[] args) {
        System.out.println(a);
        System.out.println(b);
        System.out.println(a+b);
        StaticPractice joinn = new StaticPractice();
        System.out.println(joinn.z);

        StaticPractice reference = new StaticPractice();
        reference.nonSTATICmethod1();
    }

    void nonSTATICmethod1(){
        System.out.println("im non static method");
    }


}






