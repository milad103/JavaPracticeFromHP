package mentoringByME;

public class IfElseIfMentoring {
    public static void main(String[] args) {
        //300-500 = bad credit score
        //501- 750 very good credit score
        // 751- 850 excellent credit score
        int creditScore =-100;
        if(creditScore >= 300 && creditScore <= 500) {
            System.out.println("Poor Credit Score");

        }else if(creditScore>=501 && creditScore <= 750){
                System.out.println("Very Good Credit Score");

            }else if(creditScore>=751 && creditScore<=850){
            System.out.println("excellent credit score");
        }else{
            System.out.println("Wrong Input: Please enter a valid credit score number");
        }

    }
}
