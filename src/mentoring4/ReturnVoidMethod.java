package mentoring4;

public class ReturnVoidMethod {
    public static void main(String[] args) {

        returnexample2();
    }





    static void returnexample2(){
        for (int i=1; i<10; i++){
            if(i==5)
                return;
            System.out.println(i);
        }

    }
}
