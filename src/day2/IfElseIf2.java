package day2;

public class IfElseIf2 {
    public static void main(String[] args){

        int creditScore = -801;

        if(creditScore >= 300 && creditScore <= 379){
            System.out.println("Poor Credit Score");
        }else if(creditScore >= 580 && creditScore <= 669){
            System.out.println("Fair Credit Score");
        }else if(creditScore >= 670 && creditScore <= 739){
            System.out.println("Good Credit Score");
        }else if(creditScore >= 740 && creditScore <= 799){
            System.out.println("Very Good Credit Score");
        }else if(creditScore >= 800 && creditScore <= 850){
            System.out.println("Excellent Credit Score");
        }else{
            System.out.println("Please Enter a Valid Credit Score");
        }

    }
}
