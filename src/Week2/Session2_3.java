package Week2;

import com.sun.org.apache.xerces.internal.impl.xs.SchemaNamespaceSupport;

import java.util.Scanner;

public class Session2_3 {
    public static void main(String[] args) {

        // Setting my scanner
        Scanner scanner=new Scanner(System.in);

        System.out.println("What is your team ? ");

        String userTeam=scanner.nextLine();  // First daha will be stored in the userTeam
        String teamMascot="";

        if (userTeam.equals("team1")) {
            teamMascot="eagle";
        } else if (userTeam.equals("team2")){
            teamMascot="lion";
        }else if (userTeam.equals("team3")){
            teamMascot="bull";
        } else if (userTeam.equals("team4")) {
            teamMascot = "Dragon";
        } else if (userTeam.equals("team5")) {
            teamMascot = "allogator";
        }else if (userTeam.equals("team6")) {
            teamMascot = "Dolphin";
        } else {
            teamMascot="Unknown";
        }

        System.out.println("You entered " + userTeam);
        System.out.println("Team`s Mascot " +teamMascot);


    }
}
