package ueb03.Schiffe;

import ueb03.Interfaces.Motorsegelschiff_IF;

/**
 * 
 *  @author Alexander Albrant 
 *  @author Mikhael Goldenzweig
 *  @version 0.1
 */
public class MotorsegelschiffInFahrt extends SchiffinFahrt {
	

	public MotorsegelschiffInFahrt(Motorsegelschiff_IF motorsegelschiff) {

		schiff = motorsegelschiff;
	}

	public double getFlaeche() {
		return ((Motorsegelschiff_IF)schiff).getFlaeche();
	}

	public double getGewicht() {
		return schiff.getGewicht();
	}

	public int getLeistung() {
		return ((Motorsegelschiff_IF)schiff).getLeistung();
	}

	public String getName() {
		return schiff.getName();
	}

	public void setName(String name) {
		schiff.setName(name);
	}
	
}