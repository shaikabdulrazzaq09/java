public class Bicycle1 extends Vehicle1 {
  private short num_gears;

  public Bicycle1() {
    this(40, (short)1);
  }

  public Bicycle1(int mspeed, short ngears) {
    super(mspeed, (short)2); 
    num_gears = ngears;
  }

  public void setNumGears(short ngears) {
    num_gears = ngears;
  }

  public int getNumGears() {
    return num_gears;
  }

  public String toString() {
    return  super.toString() + ", " + num_gears + " gears";
  }
}
