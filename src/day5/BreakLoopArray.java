package day5;

public class BreakLoopArray {

    // print days from monday to wednesday

    public static void main(String[] args) {

        String days[]={"Sunday", "Monday", "Tuesday", "Wednesday", "thursday", "Friday", "Sunday",
                "Monday", "Wednesday", "Tuesday", "thursday", "Friday", "Sunday", "Monday", "Wednesday", "Tuesday",
                "thursday", "Friday", "Sunday", "Monday", "Wednesday", "Tuesday", "thursday", "Friday", "Sunday", "Monday", "Tuesday", "Wednesday", "thursday", "Friday", "Sunday",
                "Monday", "Wednesday", "Tuesday", "thursday", "Friday", "Sunday", "Monday", "Wednesday", "Tuesday",
                "thursday", "Friday", "Sunday", "Monday", "Wednesday", "Tuesday", "thursday", "Friday", "Sunday", "Monday", "Tuesday", "Wednesday", "thursday", "Friday", "Sunday",
                "Monday", "Wednesday", "Tuesday", "thursday", "Friday", "Sunday", "Monday", "Wednesday", "Tuesday",
                "thursday", "Friday", "Sunday", "Monday", "Wednesday", "Tuesday", "thursday", "Friday"};
        for(int i=0; i<=days.length; i++){
            if(days[i]=="Friday"){
                break;
            }
            System.out.println(days[i]);
            System.out.println("----------------------------------");
            System.out.println(days.length);
            //System.out.println("===================================");
            //System.out.println(days.length);
        }
    }
}
