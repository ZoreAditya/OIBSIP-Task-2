import java.util.Random;
import java.util.Scanner;

public class NumberGame_Task1 {
    public static void main(String[] args) {



                System.out.println("Welcome to the Guess the Number game!");
                System.out.println("For every correct answer you gain 10 points(+10) and for wrong answer lose you 10 points(-10)");

                Scanner scanner = new Scanner(System.in);
                Random random = new Random();
                int score =0;


        while (true) {
                    int targetNumber = random.nextInt(100) + 1;

                    int maxAttempts = 10;
                    int attempts = 0;

                    while (attempts < maxAttempts) {

                        System.out.print("Guess the number between 1 and 100: ");
                        int userGuess = scanner.nextInt();

                        if (userGuess == targetNumber) {
                            score=score+10;
                            System.out.println("Congratulations! You guessed the correct number " + targetNumber + " in " + (attempts + 1) + " attempts."
                            );
                            System.out.println("Your score is:"+score);


                            break;
                        } else if (userGuess < targetNumber) {
                            System.out.println("Too low! Try again.");
                        } else {
                            System.out.println("Too high! Try again.");
                        }

                        attempts++;
                    }

                    if (attempts == maxAttempts) {
                        if(score>10){
                            score=score-10;
                        }
                        else
                        {
                            score = 0;
                        }
                        System.out.println("Sorry, you've reached the maximum number of attempts. The correct number was " + targetNumber + ".");
                        System.out.println("Your score:"+score);
                    }

                    System.out.print("Do you want to play again? (yes/no): ");
                    String playAgain = scanner.next().toLowerCase();
                    if (!playAgain.equals("yes")) {
                        break;
                    }
                }

                scanner.close();


            }
        }



