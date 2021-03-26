package mentoring3Prep;

class ChildClass extends FatherClass {

    void localChildMethod(){

        fatherStaticMethod();
    }



    void example1() {
        System.out.println("sample example but from child class");
    }


    void combiningMethod() {

        super.example1();
        this.example1();
        super.fatherClassMethod1();
        this.localChildMethod();
        super.fatherNonStaticClass();

    }


    public static void main (String[]args){
        ChildClass iPhone = new ChildClass();
        iPhone.combiningMethod();


    }

}

