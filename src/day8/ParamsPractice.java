package day8;

public class ParamsPractice {


    public static void main(String[] args) {
        ParamsPractice PP = new ParamsPractice();
        PP.client("joe", "12/12/1912", 389573265);
        PP.client("jawid", "12/12/1955", 82834791);
        PP.client("julie", "12/11/1980", 96852214);
        System.out.println("================================");
        PP.client("saadia","12/12/2016", 5854752);
    }

    void client(String firstName, String dOBirth, int sSNumber){
        printName(firstName);
        printDOB(dOBirth);
        printsSN(sSNumber);
    }


    void printName(String firstName){
        System.out.println("Name is: " + firstName);
    }

    void printDOB(String dOBirth){
        System.out.println("DOB is: " + dOBirth);
    }

    void printsSN( int sSNumber) {
        System.out.println("SSN is: " + sSNumber);
    }
}
