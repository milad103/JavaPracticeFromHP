package mentoring3Prep;

public abstract class AppleIphone implements CellPhone{
    @Override
    public void cellular() {
        System.out.println("Uses cell towers to make phone calls");

    }

    @Override
    public void textMessaging() {
        System.out.println("text messaging for communication and authentication");
    }

    @Override
    public void mobility() {
        System.out.println("make phone call from anywhere wherever service is available");
    }

    //normal method
    void AIcamera(){
        System.out.println("AI  360 degree camera ");
    }

    //abstract class
    abstract void BrandName();
}
