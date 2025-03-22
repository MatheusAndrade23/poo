public class Zombie {
  String name;
  
  double life;

  public void showLife(){
    System.err.println("This is the life" + life);
  }
  
  public void transferLife(Zombie targetZombie, double amount){
    life -= amount;
    targetZombie.life += life;
  }
}