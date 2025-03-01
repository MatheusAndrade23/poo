public class Main {
  public static void main(String[] args) {
    Pilot pilot1 = new Pilot();
    Pilot pilot2 = new Pilot();

    pilot1.name = "Dodas";
    pilot2.name = "Dodas2";

    pilot1.isEvil = false;
    pilot2.isEvil = true;

    Kart kart1 = new Kart();
    Kart kart2 = new Kart();

    kart1.pilot = pilot1;
    kart2.pilot = pilot2;

    kart1.jump();
    kart2.jump();

    pilot1.useSuperPower();
  }
} 