public class Main {
  public static void main(String[] args){
    Zombie zombie1 = new Zombie();
    zombie1.life = 1000;

    Zombie zombie2 = new Zombie();
    zombie2.life = 1000;

    zombie1.transferLife(zombie2, 500);
    
    zombie1.showLife();
    zombie2.showLife();
  }
}