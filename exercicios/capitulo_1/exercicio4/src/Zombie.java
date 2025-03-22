public class Zombie {
  String name;
  
  double life;

  public void showLife(){
    System.err.println("This is the life" + life);
  }
  
  public boolean transferLife(Zombie targetZombie, double amount){
    boolean isPossibleTransferLife = life >= amount;

    if(!isPossibleTransferLife) {
      return false;
    }

    life -= amount;
    targetZombie.life += life;

    return true;
  }
}