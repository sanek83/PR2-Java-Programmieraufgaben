package ueb03.werft.x;

import ueb03.Interfaces.Motor_IF;
import ueb03.Interfaces.Motorsegelschiff_IF;
import ueb03.Interfaces.Rumpf_IF;
import ueb03.Interfaces.Segel_IF;
/**
 * 
 *  @author Alexander Albrant 
 *  @author Mikhael Goldenzweig
 *  @version 0.1
 */
public class Motorsegelschiff extends Schiff implements Motorsegelschiff_IF {

	private Segel_IF segel;
	private Motor_IF motor;
	public Motorsegelschiff(Rumpf_IF rumpf, Segel_IF segel, Motor_IF motor) {
		super(rumpf);
		this.segel = segel;
		this.motor = motor;
	}
	public double getGewicht() {
		return motor.getGewicht() + segel.getGewicht() + super.getGewicht();
	}
	public int getLeistung() {
		return motor.getLeistung();
	}
	public double getFlaeche() {
		return segel.getFlaeche();
	}
}