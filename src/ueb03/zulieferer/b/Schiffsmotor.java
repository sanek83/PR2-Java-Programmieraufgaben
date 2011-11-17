package ueb03.zulieferer.b;

//import Interfaces.Marinisiert_IF;
import ueb03.Interfaces.SchiffsMotor_IF;
/**
 * 
 *  @author Alexander Albrant 
 *  @author Mikhael Goldenzweig
 *  @version 0.1
 */
public class Schiffsmotor extends Motorkomponente implements SchiffsMotor_IF {

	public Schiffsmotor(double gewicht, int id, int leistung) {
		super.setGewicht(gewicht);
		super.setId(id);
		super.setLeistung(leistung);
	}
}