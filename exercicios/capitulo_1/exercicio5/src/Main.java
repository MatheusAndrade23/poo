public class Main {
  public static void main(String[] args){
    Character character = new Character();

    Weapon weapon = new Weapon();

    weapon.name = "Gun";
    weapon.description = "Thats a gun";
    weapon.resistance = 100;
    weapon.showWeaponInfo();

    character.lifePoints = 100;
    character.name = "Dodas";
    character.takeDamage();
    character.useWeapon(weapon);
  }
}