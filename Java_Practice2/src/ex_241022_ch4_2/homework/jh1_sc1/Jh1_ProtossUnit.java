package ex_241022_ch4_2.homework.jh1_sc1;

public abstract class Jh1_ProtossUnit extends Jh1_Unit {

  protected int maxShield;

  public Jh1_ProtossUnit(String name) {
    super(name);
    this.race = Jh1_SC1.Race.Protoss;
  }

  @Override
  public void showBasicInfo() {
    super.showBasicInfo();
    System.out.printf("Shield: %d\n", this.maxShield);
  }

  
}
