package ueb01;

/**
 *  Abstrakte Classe der Roboter
 *  
 *  @author Alexander Albrant 
 *  @author Mikhail Goldenzweig
 *  @version 0.2,  27/03/2008
 */

import java.math.*;

public abstract class AbstractRobot extends Object {


	
	/**
	 *  Nachkommastellen bei der Rundung von Koordinaten
	 */
	private final byte ROUND = 5;
	
	/**
	 *  x-Koordinate
	 */
	private double x;
	
	/**
	 * y-Koordinate
	 */
	private double y;
	
	/**
	 *  Richtung des Roboters
	 */
	private double phi;
	
	/**
	 *  Anzah der erzeugten Roboter
	 */
	protected static int noOfInstances;
	
	
	/**
	 * Funktion Reset
	 *  Setzt den Roboter in die Ausgangsposition Koordinaten (0.0, 0.0), Richtung (0.0)
	 */
	protected void reset() {
		this.x   = 0;
		this.y   = 0;
		this.phi = 0;
	}  
	
	/**
	 * abstrakte Methode, liefert die Groesse der Drehschritte
	 * 
	 * @see SlowRobot#rotStepSize()
	 * @see FastRobot#rotStepSize()
	 */
	protected abstract double rotStepSize();
	
	/**
	 * abstrakte Methode, liefert die Groesse der Translationsschritte
	 * 
	 * @see SlowRobot#transStepSize()
	 * @see FastRobot#transStepSize()
	 */
	protected abstract double transStepSize();
	
	/**
	 * dreht je nach Vorzeichen nach links (-) oder rechts (+)
	 * 
	 * @param richtung 
	 */
	private void rotate(int richtung) {
		
		if ((richtung == -1) &&	(phi-rotStepSize() < 0)) 
			 phi = 360+phi-rotStepSize();		// nicht niedriger  als 0
		else if ((richtung == 1) && (phi+rotStepSize() >= 360)) 
			 phi = phi-360+rotStepSize();		// damit nicht über 360 Grad
		else phi = phi + richtung*rotStepSize();
		
		System.out.print(toString());
	}              
	
	/**
	 *  Bewegung  vorwärts wenn die Richtung (+) oder rückwärts, wenn die Richtung (-)
	 *  
	 * @param richtung
	 */
	private void translate(int richtung) {		
				
		// BigDecimal stellt eine Dezimalzahl mit beliebiger Genauigkeit dar.
		BigDecimal xx = new BigDecimal(x+Math.sin(Math.toRadians(phi))*transStepSize()*richtung);
		
		// setScale Setzt die Anzahl der Nachkommastellen auf ROUND 
		// und benutzt gegebenenfalls das durch roundingMode(ROUND_HALF_UP) spezifizierte Rundungsverfahren.
		xx=xx.setScale(ROUND, BigDecimal.ROUND_HALF_UP); 
		x=xx.doubleValue();
		
		BigDecimal yy = new BigDecimal(y+Math.cos(Math.toRadians(phi))*transStepSize()*richtung);
		yy=yy.setScale(ROUND, BigDecimal.ROUND_HALF_UP);
		y=yy.doubleValue();

		System.out.print(toString());
	}

	/**
	 * Funktion für eine Vorwärtsbewegung
	 */
	protected void forward() {
		translate(1);
	}
	
	/**
	 * Funktion für eine Reückwärtsbewegung
	 */
	protected void backward() {
		translate(-1);
	}
	
	/**
	 * Funktion für eine Bewegung nach rechts
	 */
	protected void right() {
		rotate(1);
	}
	
	/**
	 * Funktion für eine Bewegung nach links
	 */
	protected void left() {
		rotate(-1);
	}	

	/**
	 *  default constructor
	 */
	public AbstractRobot() {
		
		this (0,0,0);		
	}
	
	/**
	 *  Constructor mit Eingagsparameter
	 *  
	 * @param x x-Koordinate
	 * @param y y-Koordinaten
	 * @param phi Richtung
	 */
	public AbstractRobot(double x, double y, double phi) {
		
		this.x   = x;
		this.y   = y;
		this.phi = phi;
		noOfInstances++;		
	}		

	/**
	 *   Erzeugt eine String-Repraesentation des Pakets.
	 *   
	 * @return String-Repraesentation des Pakets.
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
        		
		return "x = " + x + 
					";  y = " + y + 
					";  phi = " + phi + "\n";
   }

}
