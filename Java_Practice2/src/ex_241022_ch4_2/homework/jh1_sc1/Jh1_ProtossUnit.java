package ex_241022_ch4_2.homework.jh1_sc1;

import ex_241022_ch4_2.homework.jh1_sc1.Jh1_SC1.DamageType;

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

  @Override
	public float getHurt(int dmg, DamageType dtype) {
	  float shieldRemain = (float) (maxShield - dmg);
	  if (shieldRemain > 0) return (float) dmg;
	  float dmgOverShield = -shieldRemain;
	  return maxShield + super.getHurt(dmgOverShield, dtype);
//		return super.getHurt(dmg, dtype);
	}
}
