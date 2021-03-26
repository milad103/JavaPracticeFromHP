package day1;

import com.sun.xml.internal.fastinfoset.util.QualifiedNameArray;

import java.sql.SQLOutput;

public class ResumeBasic {
    public static void main( String [] args) {

        String firstName="Milano";
        String lastName="Bonjorno";
        int age=42;
        long cellPhone= 5168879635l;
        String jobTitle="Quality Test Engineer";
        int homeNumber=19;
        String streetName="Forest"+" "+"Ave";
        String cityName="Boston";
        int zipCode=12584;
        System.out.println("****** MILANO ITALY RESUME******");
        System.out.println("Job Title:"+ " " + jobTitle);
        System.out.println("Full Name:"+ " " + firstName+ " " +lastName + " " + " " +age + " "+"Years Old");
        System.out.println(homeNumber+ " " +streetName+ " " +cityName+ " " +zipCode);
        System.out.println("CellPhone:"+ " " + cellPhone);



    }
}
