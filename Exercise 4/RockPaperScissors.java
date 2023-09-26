import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Move rock = new Move("Rock");
        Move paper = new Move("Paper");
        Move scissors = new Move("Scissors");

        rock.setStrongAgainst(scissors);
        paper.setStrongAgainst(rock);
        scissors.setStrongAgainst(paper);

        int computerScore = 0;
        int playerScore = 0;
        int roundsToWin = 2;

        int choice;

        do {
            System.out.println("Welcome to Rock, Paper, Scissors. Please choose an option:");
            System.out.println("1. Start game");
            System.out.println("2. Change number of rounds");
            System.out.println("3. Exit application");
            System.out.print("> ");

            choice = sc.nextInt();

            Move computerMove;
            Move userMove;

            if (choice == 1) {
                System.out.println("");
                System.out.println("This match will be first to " + roundsToWin + " wins.");

                while (playerScore < roundsToWin && computerScore < roundsToWin) {
                    int random = (int) Math.floor(Math.random() * 3) + 1;

                    System.out.println("");
                    System.out.println("The computer has selected its move. Select your move:");
                    System.out.println("1. Rock");
                    System.out.println("2. Paper");
                    System.out.println("3. Scissors");
                    System.out.print("> ");
                    int userInput = sc.nextInt();

                    if (random == 1) {
                        computerMove = rock;
                    } else if (random == 2) {
                        computerMove = paper;
                    } else {
                        computerMove = scissors;
                    }

                    if (userInput == 1) {
                        userMove = rock;
                    } else if (userInput == 2) {
                        userMove = paper;
                    } else {
                        userMove = scissors;
                    }

                    System.out.println("");
                    System.out.print("Player chose " + userMove.getName() + ". Computer chose " + computerMove.getName() + ". ");

                    int winner = Move.compareMoves(computerMove, userMove);

                    if (winner == 1) {
                        System.out.print("Player wins round!");
                        playerScore++;
                    } else if (winner == 0) {
                        System.out.print("Computer wins round!");
                        computerScore++;
                    } else {
                        System.out.print("Round is tied!");
                    }

                    System.out.println("");
                    System.out.println("Player: " + playerScore + "- Computer: " + computerScore);
                    System.out.println("");
                }

                if (playerScore < computerScore){
                    System.out.println("Computer Wins!");
                    System.out.println("");
                }

                else if (playerScore > computerScore){
                    System.out.println("Player Wins!");
                    System.out.println("");
                }
            } 
            
            else if (choice == 2) {
                System.out.println("");
                System.out.println("How many wins are needed to win a match?");
                System.out.print("> ");
                int wins = sc.nextInt();
                roundsToWin = wins;
                System.out.println("New setting has been saved!");
                System.out.println("");
            } 
            
            else if (choice == 3) {
                System.out.println("");
                System.out.println("Thank you for playing!");
            }
        } while (choice != 3);
    }
}
