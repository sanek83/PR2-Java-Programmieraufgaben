package ueb03.zulieferer.b;

import ueb03.Interfaces.Segel_IF;
/**
 * 
 *  @author Alexander Albrant 
 *  @author Mikhael Goldenzweig
 *  @version 0.1
 */
public abstract class Segelkomponente extends Komponente implements Segel_IF {

	
	protected double flaeche = 0.0;
	
	@Override
	public double getFlaeche() {
		return flaeche;
	}
	
	public void setFlaeche(double flaeche) {
		this.flaeche = flaeche;
	}

		
}