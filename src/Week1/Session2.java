package Week1;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.concurrent.Callable;

public class Session2 {
    public static void main(String[] args) {

        // variable: it is used to store data.( every information is data)

        int myBirthYear=1997;
        int currentYear=2022;
        int myAge=currentYear-myBirthYear;

        System.out.println("My age is = " +myAge);

        System.out.println("*********");

        String schoolName="Renastech";

        System.out.println(schoolName);

        // how to create variable?
        // typeOfVariable name= value;
        // type of the variables (primitive): byte, int, long, short, double, float, boolean, char

        // byte
        byte b1=35; // limited usage because of the limit, -128 to 127
        byte age=24;

        int i1=25;

        // int: store numbers between 2.345.000 to -2............
        // int myBirthYear2=1997;

        // double: used for decimal number, example: price
        // float: used for decimal numbers

        // double priceOfBanana=2.90;

        // boolean: used for data that true or false

        boolean older18=true;
        boolean isLivingInColorado=false;
        System.out.println(" am I living in colorado? = " +isLivingInColorado); // false

        isLivingInColorado=true;  //
        System.out.println(" am I living in colorado? = " +isLivingInColorado);


        // datatype name = value
        String school="MIT";
        System.out.println("School" + school); // School MIT
        school="Renatech"; // updated value
        System.out.println(school); // Renastech

        //char => it is used to contains a single character.
        char gender='F';
        System.out.println("Gender = " +gender); // Gender = F


        char gender1='M';
        System.out.println(gender1); // variableName.sout
        System.out.println(gender1);

        String name="JANE";
        System.out.println(name); // >>> name.sout
        System.out.println(name);

        System.out.println("****************");

        String lastName= "AA";
        System.out.println(lastName); // AA

            // name+lastName.sout  --- shortcut
        System.out.println(name + lastName); // JANEAA

        System.out.println("*****************");

        String instructorName="Ziya";
        System.out.println("instructorName = " +instructorName);
        //              nameof Variable         value


        System.out.println(instructorName);
        //

        String myName= "Mahir";
        System.out.println(myName); // >> variable name.sout >> it will put variable inside the print statement
        System.out.println("myName = " + myName); // variable name.soutv >> puts


    }
}
