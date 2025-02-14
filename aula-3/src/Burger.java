import java.util.Scanner;

public class Burger {
    public static void main(String[] args){
        
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Type the price of the cheese burger:");
        int cheeseBurgerPrice = keyboard.nextInt();

        System.out.println("Type the price of the salad burger:");
        int saladBurgerPrice = keyboard.nextInt();

        int total = cheeseBurgerPrice + saladBurgerPrice;

        float average = (float) total / 2;

        System.out.println("The total is " + total);

        System.out.println("The average is " + average);

        keyboard.close();
    }
}
