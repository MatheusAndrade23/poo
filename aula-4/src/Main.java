
import java.util.Random;
import java.util.Scanner;


public class Main {
  public static void main(String[] args){
    Scanner keyboard = new Scanner(System.in);
    Random rand = new Random();

    int randomNumber = rand.nextInt(10) + 1;

    System.out.println("Guess the number!");

    while (true) { 
      int guess = keyboard.nextInt();

      if (guess == randomNumber) {
        System.out.println("You win!");
        break;
      }

      System.out.println("Nah, try again!");

      if (guess > randomNumber) {
        System.out.println("But your guess was greater than the number!");
      } else if (randomNumber > guess) {
        System.out.println("But your guess was lesser than the number!");
      }
    }
  }
}
