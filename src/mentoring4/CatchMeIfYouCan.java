package mentoring4;

public class CatchMeIfYouCan {
    public static void main(String[] args) {
try {

    String[] numbers = {"zero", "one", "two", "three",};
    System.out.println(numbers[6]);

}catch(Exception e){
    System.out.println("an exception was found: " +e);
}
    }
}
