package Week2;

import java.util.Scanner;

public class Session2 {
    public static void main(String[] args) {

        // scanner is used to get data from user

        // step 1- set-up Scanner
        Scanner scanner=new Scanner(System.in);


        // step 2- Deciding dataType

        // First user's input value will be stored in userName variable
        String userName=scanner.next();

        System.out.println("Hi" +userName+ "what`s your birthday?");
        int userBirthday=scanner.nextInt(); // second input will be userBirthday

        System.out.println("Hey,  " +userName+ " "+(2022 - userBirthday)+ "years old");


    }
}
