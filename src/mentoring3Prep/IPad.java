package mentoring3Prep;

public class IPad implements Tablet{


    @Override
    public void touchScreen() {
        System.out.println("Oled type tuchscreen technology");
    }

    @Override
    public void operatingSystem() {
        System.out.println("Apple iOS 14.3");
    }



    @Override
    public void rechargeableBattery() {
        System.out.println("Up tp 8 hours rechargeable Lithium battery");
    }

    void frontAndRearCamera(){
        System.out.println(" 8 Megapixels front camera and 14 megapixels for Rear camera");
    }

    void appsDownloadingStore(){
        System.out.println(" Apple Store secure apps download");
    }
}