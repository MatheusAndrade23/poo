public class Kart {
  String name;

  Pilot pilot;

  Engine engine;

  public Kart(){
    engine = new Engine();
    
    engine.cylinderCapacity = CylinderCapacity.CC_100;
    engine.maxVelocity = 100;
  }

  public void jump(){
    System.out.println("Kart Jumped!");
  }

  public void turbo(){
    System.out.println("Kart Turbo!");
  }

  public void drift(){
    System.out.println("Kart Drifted!");
  }
}