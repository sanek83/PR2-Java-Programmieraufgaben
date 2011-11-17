package ueb03.zulieferer.a;

import ueb03.Interfaces.SchiffsMotor_IF;
/**
 * 
 *  @author Alexander Albrant 
 *  @author Mikhael Goldenzweig
 *  @version 0.1
 */
public class Schiffsmotor extends Schiffskomponente implements SchiffsMotor_IF {

	private int leistung = 0;
	
	
	public Schiffsmotor(double gewicht, int id, int leistung) {
		this.gewicht = gewicht;
		this.id = id;
		this.leistung = leistung;
	}

	

	@Override
	public int getLeistung() {
		return leistung;
	}



	public void setLeistung(int leistung) {
		this.leistung = leistung;
	}

	

	
}