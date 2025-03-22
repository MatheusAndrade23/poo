enum CylinderCapacity {
  CC_50, CC_100, CC_150
}

public class Engine {
  CylinderCapacity cylinderCapacity;

  float maxVelocity;

  public void showInfo(){
    System.out.println("Cylinder Capacity: " + cylinderCapacity);
    System.out.println("Max Velocity: " + maxVelocity);
  }
}