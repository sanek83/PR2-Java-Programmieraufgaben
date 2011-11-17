package ueb03.werft.x;

import ueb03.Interfaces.Rumpf_IF;
import ueb03.Interfaces.Segel_IF;
import ueb03.Interfaces.Segelschiff_IF;
/**
 * 
 *  @author Alexander Albrant 
 *  @author Mikhael Goldenzweig
 *  @version 0.1
 */
public class Segelschiff extends Schiff implements Segelschiff_IF {

	private Segel_IF segel;

	public Segelschiff(Rumpf_IF rumpf, Segel_IF segel) {
		super(rumpf);
		this.segel = segel;
	}

	public double getFlaeche() {
		return segel.getFlaeche();
	}

	public double getGewicht() {
		return segel.getGewicht() + super.getGewicht();
	}

  
}