package day6;

public class BreakLoop {
// terminate the loop when a certain condition is met!
    public static void main(String[] args) {
        int i;
        for ( i=1; i<100; i++) {
            if(i==50){
                break;
            }

            System.out.println(i);

        }



    }


}
