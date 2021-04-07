package mentoring4;

public class ReturnAllCaps {
    public static void main(String[] args) {

        String speech= allCaps("DO NOT CUT ME OFF !!");
        System.out.println(speech);
    }







    static String allCaps(String f){
        return f.toLowerCase();
    }
}
