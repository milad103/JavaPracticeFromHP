package day5;

public class BreakStatement {
    public static void main(String[] args) {

        int age[] ={100, 25, 1000, 300, 289, 400, 500, 600};
            //    index0  index1
        System.out.println(age.length);
        System.out.println("------------------------------");

        for(int i=0; i<age.length; i++) {
            if (i == 5) {
                break;
            }
            System.out.println(age[i]);

        }


    }
}

//for (int i = 0; i < 10; i++) {
//  if (i == 4) {
//    break;
//  }
//  System.out.println(i);
//}
