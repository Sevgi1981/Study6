package Week3;

import java.util.Scanner;

public class session2 {

    public static void main(String[] args) {


        // Ask user to enter a number by using scanner
        // if number is divided by 5 and 3 print FinRa
        // if number is divided by 3 print Fin
        //if number is divided by 5 print RA

        Scanner scan=new Scanner(System.in);

        System.out.println("please enter a number");

        int input= scan.nextInt();

        if (input%5==0 && input%3==0) {
            System.out.println("FinRa");
        }else if (input%3==0) {
            System.out.println("Fin");
        }else if (input%5==0){
            System.out.println("RA");
        } else {
            System.out.println("invalid number");
        }



    }
}
