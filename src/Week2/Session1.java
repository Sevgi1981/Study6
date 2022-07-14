package Week2;

public class Session1 {

    // main
    //psvm

    public static void main(String[] args) {

        // if, if else, else

        // //Telephone Bill
        ////Write a program to calculate the monthly telephone bills as per the following rule:
        ////Minimum Rs. 200 for up to 100 calls.
        ////Plus Rs. 0.60 per call for the next 50 calls.
        ////Plus Rs. 0.50 per call for the next 50 calls.
        ////Plus Rs. 0.40 per call for any call beyond 200 calls.


        double bill=0; // we will use this variable to store answer
        int callAmount=300;

        // Set-up logic
        /// min RS 200 for up to 100 calls.

        if (callAmount<=100){
            bill=200;

        } else if (callAmount>100 && callAmount<=150) {
            bill= 200 + ((callAmount-100) * 0.60);

        } else if (callAmount>150 && callAmount<=200){
            bill= 200 + (50 * 0.60) + ((callAmount-150) * 0.50);

        } else if (callAmount>200){
            bill= 200 + (50 * 0.60) + (50 * 0.50) + ((callAmount-200) * 0.40);
        }

        System.out.println("Call Amount: " +callAmount);
        System.out.println("The bill :" +bill);

        // Nested if ;

        boolean hasAValidEmail= true; // if false output will be "there was a problem"
        String userName="m1234";
        String password="123456";

        if (hasAValidEmail) {  // if my first cont is false we should check other else condt.

            if (userName=="m1234" && password=="123456"){  // if one of them is false output will be password is not correct
                System.out.println("Welcome");
            } else {
                System.out.println("Password or user name is not correct");
            }

        } else {  // if my first cont is false we should check other else condt.
            System.out.println("There was a problem");
        }
    }

}
