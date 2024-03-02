import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char playerA, playerB; // Declare Players as char instead of string for use of Character.toUpperCase later and to compare with ==
        char playAgain = 'Y'; // Loop to play again

        while (playAgain == 'Y') {
            System.out.println("Player A, please select your move (R/r for Rock, P/p for Paper, S/s for Scissors): ");
            playerA = Character.toUpperCase(in.nextLine().charAt(0)); // Change all inputs to uppercase rather than using equalsIgnoreCase
            while (playerA != 'R' && playerA != 'P' && playerA != 'S') { //Check for valid input
                System.out.println("The move you entered is invalid. Please enter R/r, P/p, or S/s: ");
                playerA = Character.toUpperCase(in.nextLine().charAt(0));
            }
            //Repeat for PlayerB
            System.out.println("Player B, please select your move (R/r for Rock, P/p for Paper, S/s for Scissors): ");
            playerB = Character.toUpperCase(in.nextLine().charAt(0));
            while (playerB != 'R' && playerB != 'P' && playerB != 'S') {
                System.out.println("The move you entered is invalid. Please enter R/r, P/p, or S/s: ");
                playerB = Character.toUpperCase(in.nextLine().charAt(0));
            }

            if (playerA == 'R' && playerB == 'R') {
                System.out.println("Rock vs. Rock, It's a tie!");
            } else if (playerA == 'P' && playerB == 'P') {
                System.out.println("Paper vs. Paper, It's a tie!");
            } else if (playerA == 'S' && playerB == 'S') {
                System.out.println("Scissors vs. Scissors, It's a tie!");
            } else if (playerA == 'R' && playerB == 'S') {
                System.out.println("Rock breaks Scissors, Player A wins!");
            } else if (playerA == 'S' && playerB == 'P') {
                System.out.println("Scissors cut Paper, Player A wins!");
            } else if (playerA == 'P' && playerB == 'R') {
                System.out.println("Paper covers Rock, Player A wins!");
            } else if (playerA == 'S' && playerB == 'R') {
                System.out.println("Rock breaks Scissors, Player B wins!");
            } else if (playerA == 'P' && playerB == 'S') {
                System.out.println("Scissors cut Paper, Player A wins!");
            } else if (playerA == 'R' && playerB == 'P') {
                System.out.println("Paper covers Rock, Player A wins!");
            }

            System.out.print("Do you want to play again? [Y/N]: ");
            playAgain = Character.toUpperCase(in.nextLine().charAt(0));
        }
    }


}
