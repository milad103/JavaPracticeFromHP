package mentoring4;

public class Encapsulation1 {
    public static void main(String[] args) {

        Encapsulation1 encap = new Encapsulation1();
        encap.setCreditCardNumber(12345678965874123l);
        System.out.println(encap.getCreditCardNumber());

    }


    private long creditCardNumber;

    public long getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(long creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
        //System.out.println(creditCardNumber);
    }

    public int getCVV() {
        return CVV;
    }

    public void setCVV(int CVV) {
        this.CVV = CVV;
    }

    private int CVV;
}
