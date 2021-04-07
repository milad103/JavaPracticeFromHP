package mentoring4;

public class ParameterPractice2 {
    public static void main(String[] args) {
        //method 1
        zikr("Alhamdulillah", 33);
        zikr("AllahoAkbar", 33);
        zikr("SubhanAllah", 33);
        System.out.println("======================================");

        //method 2
        String name ="ALLAH";
        int number = 100;
        zikr(name, number);
    }








    static void zikr(String name, int number){

        for (int counter = 1; counter<=number; counter++){
            System.out.println(name);
        }
    }
}
