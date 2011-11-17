package ueb03.werft.x;

import ueb03.Interfaces.Rumpf_IF;
import ueb03.Interfaces.Schiff_IF;
import ueb03.Stauraum.CarryException;
/**
 * 
 *  @author Alexander Albrant 
 *  @author Mikhael Goldenzweig
 *  @version 0.1
 */
public abstract class Schiff implements Schiff_IF {

	private Rumpf_IF rumpf;

	public Schiff(Rumpf_IF rumpf) {
		this.rumpf = rumpf;
	}

	public double getGewicht() {
		return rumpf.getGewicht();
	}

	public String getName() {
		return rumpf.getName();
	}

	public void setName(String name) {
		rumpf.setName(name);
	}

	public int uniqueId() 
		throws CarryException {
		return rumpf.uniqueId();
	}	
	
	
}