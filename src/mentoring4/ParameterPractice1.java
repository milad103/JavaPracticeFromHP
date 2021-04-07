package mentoring4;

public class ParameterPractice1 {
    public static void main(String[] args) {

        ParameterPractice1 para = new ParameterPractice1();
        para.student("James", 24);
        para.student("Alimur", 41);
    }




    void student(String name, int age){
        System.out.println(name + " is "+ age + "years old");
    }
}
