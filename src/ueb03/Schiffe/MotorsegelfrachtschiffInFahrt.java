package ueb03.Schiffe;

import ueb03.Interfaces.Motorsegelschiff_IF;
//import Interfaces.Schiff_IF;
//import Stauraum.CarryException;
//import Stauraum.Location;
import ueb03.Stauraum.Stauplan;
//import Stauraum.interfaces.Container_IF;

/**
 * 
 *  @author Alexander Albrant 
 *  @author Mikhael Goldenzweig
 *  @version 0.1
 */
public class MotorsegelfrachtschiffInFahrt extends MotorsegelschiffInFahrt{

	private Stauplan stauraum;

	public Stauplan getStauraum() {
		return stauraum;
	}

	public MotorsegelfrachtschiffInFahrt(Motorsegelschiff_IF motorsegelschiff) {
		
		super(motorsegelschiff);
		//schiff = motorsegelschiffInFahrt;
		
		stauraum = new Stauplan(100, 3, 5, 4); 
	}
}
