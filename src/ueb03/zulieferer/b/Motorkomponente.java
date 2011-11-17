package ueb03.zulieferer.b;

import ueb03.Interfaces.Motor_IF;
/**
 * 
 *  @author Alexander Albrant 
 *  @author Mikhael Goldenzweig
 *  @version 0.1
 */
public abstract class Motorkomponente extends Komponente implements Motor_IF {

	private int leistung = 0;	
	
	@Override
	public int getLeistung() {
		return leistung;
	}

	public void setLeistung(int leistung) {
		this.leistung = leistung;
	}	
	
}