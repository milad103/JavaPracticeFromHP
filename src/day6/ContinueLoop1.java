package day6;

public class ContinueLoop1 {
    // continue loop will jump over or skip that condition

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                continue;
            }

            System.out.println(i);

        }

    }


}
