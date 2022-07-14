package Week3;

public class session1 {
    public static void main(String[] args) {
        /**
         *John and Mike both play basketball in different teams. In the latest 3 games, John's team scored 89,
         * 120 and 103 points, while Mike's team scored 116, 94, and 123 points.
         *
         * 1. Calculate the average score for each team.
         *
         * 2. Decide which teams wins in average (highest average score), and print the winner to the console with if else statement.
         * Also include the average score in the output.
         *
         * 3. Then change the scores to show different winners.
         * Don't forget to take into acount there might be a draw (the same average score).
         */

        /**
         * Mark and John are trying to compare their BMI (Body Mass Index), which is calculated using the formula:
         * BMI = mass / (height * height) (mass in kg and height in meter).
         *
         * Test data:
         * ** Data 1: Marks weights 78 kg and is 1.69 m tall. John weights 92 kg and is 1.95 m tall.
         *
         * Requirements:
         * 1- Create variables for Mark and John.
         * 2- Calculate Mark's and Jonh's BMI as a variable
         * 3- Print who has more BMS using if else statement
         * 4- Repaet same steps for new data (New data sample is in Below)
         *
         * **Data 2: Marks weights 95 kg and is 1.88 m tall. John weights 85 kg and is 1.76 m tall.
         */

        /**
         * /**
         *       * //Absolute value
         *      * //Write a program that asks the user to enter a number and displays the absolute value of that number.
         *        */


        // Ask user to enter a number by using scanner
        // if number is divided by 5 and 3 print FinRa
        // if number is divided by 3 print Fin
        //if number is divided by 5 print RA

        short JohnTeam1=89;
        short JohnTeam2=120;
        short JohnTeam3=103;

        double JohnTeamAve= (JohnTeam1+JohnTeam2+JohnTeam3);
        // Mike`s team scores: 116, 94 and 123

        short MikeTeam1=116;
        short MikeTeam2=94;
        short MikeTeam3=123;

        double mikeTeamAve= (MikeTeam1+MikeTeam2+MikeTeam3);

        System.out.println("JohnTeamAve"+JohnTeamAve);
        System.out.println("mikeTeamAve"+mikeTeamAve);
        System.out.println("*****************");



        if (JohnTeamAve>mikeTeamAve) {
            System.out.println("JohnTeam won the game with the score of " +JohnTeamAve);
        } else if (mikeTeamAve>JohnTeamAve) {
            System.out.println("MikeTeam won the game with the score of " +mikeTeamAve);
        } else {
            System.out.println("Both team has score !!");
        }

        //Absolute value
        //Write a program that asks the user to enter a number and displays the absolute value of that number.

        int x=-10;
        int y=-50;
        //  to enter a number by using scanner
        // if number is divided by 5 and 3 print FinRa
        // if number is divided by 3 print Fin
        //if number is divided by 5 print RA
    }

}
