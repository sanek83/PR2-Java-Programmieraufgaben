package ueb03.zulieferer.b;

import ueb03.Interfaces.Komponente_IF;
/**
 * 
 *  @author Alexander Albrant 
 *  @author Mikhael Goldenzweig
 *  @version 0.1
 */
public abstract class Komponente implements Komponente_IF {
	
	
	private double gewicht = 0.0;
	private int id = 0;
	
	
	public double getGewicht() {
		return gewicht;
	}

	public void setGewicht(double gewicht) {
		this.gewicht = gewicht;
	}

	
	@Override
	public int uniqueId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
}