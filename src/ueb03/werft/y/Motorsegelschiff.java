package ueb03.werft.y;

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
public class Motorsegelschiff extends Motorfahrzeug implements Motorsegelschiff_IF {
	
	private Segel_IF segel;

	public Motorsegelschiff(Rumpf_IF rumpf, Motor_IF motor, Segel_IF segel) {
		super(rumpf, motor);
		this.segel = segel;
	}

	public double getFlaeche() {
		return segel.getFlaeche();
	}

	public double getGewicht() {
		return segel.getGewicht() + super.getGewicht();
	}
}