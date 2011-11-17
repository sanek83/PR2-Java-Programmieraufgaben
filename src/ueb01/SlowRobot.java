package ueb01;

/**
 *   Classe der langsamen Roboter.
 *   Unterklasse von AbstractRobot.
 *  
 *  @author Alexander Albrant 
 *  @author Mikhael Goldenzweig
 *  @version 0.1,  27/03/2008
 */
public class SlowRobot extends AbstractRobot{

	/**
	 * Konstante Werte von FastRobots
	 * rotStep - Drehwinkel
	 * transStep - Schrittlaenge
	 */
	private final double rotStep = 30;
	private final double transStep = 1;
	
	/**
	 *  abstrakte Methode, liefert die Groesse der Drehschritte
	 *  Implementirung der abstrakten Methode aus AbstactRobot
	 *  
	 *  @return Drehwinkel Groesse
	 */
	protected  double rotStepSize() {
		return rotStep;
	}
	
	/**
	 *  abstrakte Methode, liefert die Groesse der Translationsschritte
	 *  Implementirung der abstrakten Methode aus AbstactRobot
	 *  
	 *  @return Schrittgroesse 
	 */
	protected  double transStepSize() {
		return transStep;
	}
	
	/**
	 * default Constructor
	 * @see AbstractRobot#AbstractRobot()
	 */
	public SlowRobot() {
		super();
		// System.out.printf("hi from SlowRobot()\n");		
	}	
	
	/**
	 * 
	 * @see AbstractRobot#AbstractRobot(double, double, double)
	 * @param x Koordinate
	 * @param y Kooordinate
	 * @param phi Richtung in Grad
	 */
	public SlowRobot(double x, double y, double phi) {
		super (x, y, phi);
		// System.out.print("hi from SlowRobot(xyz)\n");		
	}	
	
}
