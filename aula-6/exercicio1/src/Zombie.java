public class Zombie {
  private String name;
  
  int power;

  int life;

  public Zombie(String name) {
    this.name = name;
  }

  void run(){
    System.out.println("Zombie running!");
  }

  void bite(){
    System.out.println("Zombie biting!");
  }
  
}