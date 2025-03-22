public class Weapon {
  String name;

  int power;

  int resistance;

  String description;

  public void showWeaponInfo() {
    System.out.println("Name: " + name);
    System.out.println("Power: " + power);
    System.out.println("Resistance: " + resistance);
    System.out.println("Description:" + description);
  }
}