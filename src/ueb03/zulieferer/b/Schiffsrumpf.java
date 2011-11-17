package ueb03.zulieferer.b;

import ueb03.Interfaces.Marinisiert_IF;
/**
 * 
 *  @author Alexander Albrant 
 *  @author Mikhael Goldenzweig
 *  @version 0.1
 */
public class Schiffsrumpf extends Rumpfkomponente implements Marinisiert_IF {

	public Schiffsrumpf(double gewicht, int id, String name) {
		super.setGewicht(gewicht);
		super.setId(id);
		super.setName(name);
	}	
}