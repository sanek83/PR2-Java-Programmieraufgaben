package ueb03.Schiffe;

import ueb03.Interfaces.Motorisiert_IF;
import ueb03.Interfaces.Motorschiff_IF;

/**
 * 
 *  @author Alexander Albrant 
 *  @author Mikhael Goldenzweig
 *  @version 0.1
 */
public class MotorschiffInFahrt extends SchiffinFahrt {


	public MotorschiffInFahrt(Motorschiff_IF motorSchiff) {
		schiff = motorSchiff;
	}

	public double getGewicht() {
		return schiff.getGewicht();
	}

	public int getLeistung() {
		return ((Motorisiert_IF) schiff).getLeistung();
	}

	public String getName() {
		return schiff.getName();
	}

	public void setName(String name) {
		schiff.setName(name);
	}
	
}