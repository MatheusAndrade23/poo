import java.util.Scanner;

public class Grade {
  public static void main(String[] args){
    Scanner keyboard = new Scanner(System.in);
     
    System.out.println("Type the NPA");
    int NPA = keyboard.nextInt();

    if(NPA > 60) {
      System.out.println("You are approved!");
    } else {
      System.out.println("You need to do the final test");
      System.err.println("Please type the NP3");
      int NP3 = keyboard.nextInt();

      int sum = NPA + NP3;

      float NFA = (float) sum / 2;

      if(NFA > 50){
        System.out.println("You are approved!");
      } else {
        System.out.println("You are reproved!");
      }
    }
  }
}