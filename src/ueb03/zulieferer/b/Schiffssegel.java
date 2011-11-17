package ueb03.zulieferer.b;

import ueb03.Interfaces.Marinisiert_IF;
/**
 * 
 *  @author Alexander Albrant 
 *  @author Mikhael Goldenzweig
 *  @version 0.1
 */
public class Schiffssegel extends Segelkomponente implements Marinisiert_IF {

	public Schiffssegel(double gewicht, double flaeche, int id) {
		super.setFlaeche(flaeche);
		super.setGewicht(gewicht);
		super.setId(id);

	}	
}