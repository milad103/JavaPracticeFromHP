package day1;

public class IfElse {
    public static void main(String[] args) {

        String Name = "Jhon";
        int Age = 22;
        String Occupation = "teacher";
        if (Name == "Jhon" && Age == 21) {
            System.out.println("His Age is : " + Age + "\n His occupation is : " + Occupation);
        } else if (Age == 21) {
            System.out.println("he is 21 years old but not Jhon. His name is " + Name);
        } else {
            System.out.println("Name and age");
        }
    }

}