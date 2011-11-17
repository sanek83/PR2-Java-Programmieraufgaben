package ueb03.zulieferer.a;

import ueb03.Interfaces.SchiffsSegel_IF;
/**
 * 
 *  @author Alexander Albrant 
 *  @author Mikhael Goldenzweig
 *  @version 0.1
 */
public class Schiffssegel extends Schiffskomponente implements SchiffsSegel_IF {

	private double flaeche = 0.0; 
	public Schiffssegel(double gewicht, int id, double flaeche) {
		this.gewicht = gewicht;
		this.id = id;
		this.flaeche = flaeche;
	}

	@Override
	public double getFlaeche() {
		return flaeche;
	}

	public void setFlaeche(double flaeche) {
		this.flaeche = flaeche;
	}

	
}