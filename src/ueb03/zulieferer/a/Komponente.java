package ueb03.zulieferer.a;

import ueb03.Interfaces.Komponente_IF;
/**
 * 
 *  @author Alexander Albrant 
 *  @author Mikhael Goldenzweig
 *  @version 0.1
 */
public abstract class Komponente implements Komponente_IF {
	
	protected double gewicht = 0.0;
	protected int id = 0;
	

	public double getGewicht() {
		return gewicht;
	}

	public void setGewicht(double gewicht) {
		this.gewicht = gewicht;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public int uniqueId() {
		return id;
	}
	
	
}