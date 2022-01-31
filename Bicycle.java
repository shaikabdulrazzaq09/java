public class Bicycle extends Vehicle {
  private short num_gears;

  public Bicycle() {
    this(40, (short)1);
  }

  public Bicycle(int mspeed, short ngears) {
    super(mspeed, (short)2); 
    num_gears = ngears;
  }

  public void setNumGears(short ngears) {
    num_gears = ngears;
  }

  public int getNumGears() {
    return num_gears;
  }
}
