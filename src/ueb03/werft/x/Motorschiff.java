package ueb03.werft.x;

import ueb03.Interfaces.Motor_IF;
import ueb03.Interfaces.Motorschiff_IF;
import ueb03.Interfaces.Rumpf_IF;
/**
 * 
 * @author Albrant
 * @author Goldenzweig
 *
 */
public class Motorschiff extends Schiff implements Motorschiff_IF {

	private Motor_IF motor;
	
	public Motorschiff(Rumpf_IF rumpf, Motor_IF motor) {
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