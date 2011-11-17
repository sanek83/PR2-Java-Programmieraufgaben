package ueb03.werft.y;

import ueb03.Interfaces.Motor_IF;
import ueb03.Interfaces.Rumpf_IF;
/**
 * 
 *  @author Alexander Albrant 
 *  @author Mikhael Goldenzweig
 *  @version 0.1
 */
public abstract class Motorfahrzeug extends Fahrzeug {

  private Motor_IF motor;

  public Motorfahrzeug(Rumpf_IF rumpf, Motor_IF motor) {
	  super(rumpf);
	  this.motor = motor;
  }

  public double getGewicht() {
	  return motor.getGewicht() + super.getGewicht();
  }

  public int getLeistung() {
	  return motor.getLeistung();
  }

}