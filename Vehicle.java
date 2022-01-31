public class Vehicle {
  private int max_speed;
  private short num_wheels;

  public Vehicle() {
    this(60, (short)4);
  }

  public Vehicle(int mspeed, short nwheels) {
    max_speed = mspeed;
    num_wheels = nwheels; 
  }

  public void setMaxSpeed(int mspeed) {
    max_speed = mspeed;
  }

  public int getMaxSpeed() {
    return max_speed;
  }

  public void setNumWheels(short nwheels) {
    num_wheels = nwheels;
  }

  public int getNumWheels() {
    return num_wheels;
  }
}
