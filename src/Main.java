import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean done = false;
        while (!done) {

            System.out.println("Player A enter your move [RrPpSs]:");
            String playA = in.nextLine().trim();
            if (!playA.matches("[RrPpSs]")) {
                System.out.println("You must enter a valid move not:" + playA);
                continue;
            }

            System.out.println("Player B enter your move [RrPpSs]:");
            String playB = in.nextLine().trim();
            if (!playB.matches("[RrPpSs]")) {
                System.out.println("You must enter a valid move not:" + playB);
                continue;
            }//tie
            if (playA.equalsIgnoreCase("R") && playB.equalsIgnoreCase("R")) {

                System.out.println("Both chose Rock its a tie!");
            } else
                if (playA.equalsIgnoreCase("S") && playB.equalsIgnoreCase("S"))

            {
                System.out.println("Both chose Scissors its a tie!");
            } else
                if (playA.equalsIgnoreCase("P") && playB.equalsIgnoreCase("P")) {

                System.out.println("Both chose Paper its a tie!");
            }


            //player A wins
            else if (playA.equalsIgnoreCase("R") && playB.equalsIgnoreCase("S"))
            {
             System.out.print("Rock breaks scissors, player A WINS");
            } else
                if (playA.equalsIgnoreCase("P")&&playB.equalsIgnoreCase("R"))
            {
              System.out.print("Paper covers rock, player A wins");
            } else
                if (playA.equalsIgnoreCase("S")&&playB.equalsIgnoreCase("P"))
            {
                System.out.print("Scissors cuts paper, player A WINS");
                //player b wins
            } else
                if (playB.equalsIgnoreCase("R") && playA.equalsIgnoreCase("S"))
            {
                System.out.print("Rock breaks scissors, player B WINS");
            } else
                if (playB.equalsIgnoreCase("P") && playA.equalsIgnoreCase("R"))
            {
                System.out.print("Paper covers rock, player B wins");
            } else
                if (playB.equalsIgnoreCase("S") && playA.equalsIgnoreCase("P"))
            {
            System.out.print("Scissors cuts paper, player B WINS");
            }
            //play again

            System.out.println("Do you want to play again[Y/N]:");
            String playAgain = in.nextLine().trim();
            if (!playAgain.equalsIgnoreCase("Y")) {
                done = true;
                System.out.println("Thank you for playing!");
            }
        }
        in.close();

    }
}