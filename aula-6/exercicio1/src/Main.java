public class Main {
  public static void main(String[] args) {
    Zombie zombie1 = new Zombie("Dodas");

    zombie1.life = 100;
    zombie1.power = 0;
    zombie1.run();
    zombie1.bite();
  }
}