package mentoring3Prep;

public class MethodOverloading {

   public int addition(int a, int b){
        return a+b;

    }

    int addition(int a, int b, int c) {
        return a + b + c;

    }

    double addition(double a, int b, double c) {
       return a + b+c;
    }


    String addition(String MyFirstName, String MyLastName){
       return MyFirstName+MyLastName;
    }

    Boolean addition(boolean a, boolean b){
       return a && b;

    }

    void addition (String a, int b){
       String x = a+b;
        System.out.println(x);

    }
    public static void main(String[] args) {
        MethodOverloading ip = new MethodOverloading();
        System.out.println(ip.addition(5, 15));
        System.out.println(ip.addition(5, 1, 8));
        System.out.println(ip.addition(5.5, 15, 8.7));
        System.out.println(ip.addition("Milad"  , "elAlami"));
        System.out.println(ip.addition(true, true));
        ip.addition("Milad", 42);
    }
}



