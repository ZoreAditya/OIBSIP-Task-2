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
                    // Step 1: Generate a random number within the specified range
                    int targetNumber = random.nextInt(100) + 1;

                    // Step 5: Set the maximum number of attempts
                    int maxAttempts = 10;
                    int attempts = 0;

                    // Step 6: Allow the user to play again
                    while (attempts < maxAttempts) {
                        // Step 2: Prompt the user to enter their guess

                        System.out.print("Guess the number between 1 and 100: ");
                        int userGuess = scanner.nextInt();

                        // Step 3: Compare the user's guess with the generated number
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

                    // Step 7: Display the user's score
                    System.out.print("Do you want to play again? (yes/no): ");
                    String playAgain = scanner.next().toLowerCase();
                    if (!playAgain.equals("yes")) {
                        break;
                    }
                }

                scanner.close();


            }
        }



