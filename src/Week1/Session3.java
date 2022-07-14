package Week1;

public class Session3 {
    public static void main(String[] args) {

        // **Logical Operators
        // && ==> And
        // || ==> Or
        // !  ==> not

        //** Relational Operators
        // == equals  5==3
        boolean b1 = 5 ==3;
        System.out.println("b1 = " +b1); // b1 = false

        // !+ not equals, returns true or false

        boolean b2 = 10 != 5;
        System.out.println("b2= " +b2);


        // >
        // >=
        // <
        // <=

        // IF. ELSE, ELSE IF

        /**
         * IF(condition) {
         * the block of the code to be executed if condition is true
         * }
         *
         */

        String weather= "Sunny";

        // if weather is Suuny,
        if (weather=="Sunny"){
            System.out.println("I will meet with you");
            System.out.println("We can go to eat");
            System.out.println("We can go to the cinema");


            int age= 24;
            boolean hasMoney = true;

            System.out.println("we come to the Liguer Store");
            if (age >=21 && hasMoney) {
                System.out.println("Enjoy your wine");
            }
            System.out.println("case 2");
            age= 20;
            hasMoney = false;

            if (age >=21 && hasMoney){
                System.out.println("Enjoy your wine");
            }

            // if else
            System.out.println("case 3");

            int age2= 21;
            if (age2 > 22) {
                System.out.println("Enjoy your wine");
            }else {
                System.out.println("you are not eligible to buy drink");
            }




        }

    }
}
