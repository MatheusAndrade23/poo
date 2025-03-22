public class Character {

  String name;
  double lifePoints;

  public void takeDamage() {
    lifePoints -= 5;
  }

  public void useWeapon(Weapon weapon) {
    weapon.resistance -= 2;
  }
}