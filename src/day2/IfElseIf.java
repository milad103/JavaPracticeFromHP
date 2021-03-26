package day2;

public class IfElseIf<houseHoldIncome> {

    public static void main(String[] args) {

        int houseHoldIncome = -99000;

        if (houseHoldIncome <= 25000 && houseHoldIncome >= 0) {
            System.out.println("lower Income");

        } else if (houseHoldIncome >= 25001 && houseHoldIncome <= 78000) {
            System.out.println("lower middle income");
        } else if (houseHoldIncome >= 78001 && houseHoldIncome <= 187000) {
            System.out.println("upper middle income");
        } else if (houseHoldIncome >= 187001) {
            System.out.println("upper income");
        }else {
            System.out.println("Wrong Input");
        }
    }
}