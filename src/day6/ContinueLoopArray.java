package day6;

public class ContinueLoopArray {
    public static void main(String[] args) {
        // memory to PC 2x45214 2x45215

        String days[] = {"Sunday", "Monday", "Tuesday", "Wednesday", "thursday", "Friday", "Sunday",
                "Monday", "Wednesday", "Tuesday", "thursday", "Friday", "Sunday", "Monday", "Wednesday", "Tuesday",
                "thursday", "Friday", "Sunday", "Monday", "Wednesday", "Tuesday", "thursday", "Friday",
                "Sunday", "Monday", "Tuesday", "Wednesday", "thursday", "Friday", "Sunday",
                "Monday", "Wednesday", "Tuesday", "thursday", "Friday", "Sunday", "Monday", "Wednesday", "Tuesday",
                "thursday", "Friday", "Sunday", "Monday", "Wednesday", "Tuesday", "thursday", "Friday",
                "Sunday", "Monday", "Tuesday", "Wednesday", "thursday", "Friday", "Sunday",
                "Monday", "Wednesday", "Tuesday", "thursday", "Friday", "Sunday", "Monday", "Wednesday", "Tuesday",
                "thursday", "Friday", "Sunday", "Monday", "Wednesday", "Tuesday", "thursday", "Friday",
                "Sunday", "Monday", "Tuesday", "Wednesday", "thursday", "Friday", "Sunday",
                "Monday", "Wednesday", "Tuesday", "thursday", "Friday", "Sunday", "Monday", "Wednesday", "Tuesday",
                "thursday", "Friday", "Sunday", "Monday", "Wednesday", "Tuesday", "thursday", "Friday"};
        for (int i = 0; i < days.length; i++) {
            if (days[i] == "Friday") {
                continue;
            }
            System.out.println(days[i]);


        }

    }

}
//Break loop with int
//Break loop array
//Continue with int
//Continue with array
//Object creation" create here and "use here.
//Samsung factory assembly in Korea Parts china
//Class: private public protected default
//static non static
