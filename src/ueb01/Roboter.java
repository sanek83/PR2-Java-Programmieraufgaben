package ueb01;

/**
 *   Classe der langsamen Roboter.
 *   Unterklasse von AbstractRobot.
 *  
 *  @author Alexander Albrant 
 *  @author Mikhael Goldenzweig
 *  @version 0.3,  27/03/2008
 */


import java.io.*;

public class Roboter {
	
	/**
	 * Hilfe Funktion liefert eine Erklaerung wie man der Roboter steuert 
	 * und welche Befehle eingelesen werden können.
	 */
	public static void help () {
		System.out.print("Usage: \n\t" +
				"left : Dreht den Roboter nach  Links\n\t" +
				"right : Dreht den Roboter nach Links\n\t" +
				"forward : Bewegt den Robotor nach Vorne\n\t" +
				"backward : Berwegt den Roboter nach Hinten\n\t" +
				"reset : Setzt den Robotor auf die Position x = 0.0, y = 0.0, phi = 0.0\n\t" +
				"position : gib die Position aus\n\t" +
				"quit : Beendet das Programm\n\n");	
	}

	/**
	 * Main Funktion, ist für die Erzeugung und Steuerung der Roboter zustaendig.
	 * Die Befehle werden von der Konsole abgelesen und ausgefuehrt.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		try {		
			// Inpunt von der Konsole	
			String input = "";
			
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
			// Referenz...
			AbstractRobot ref;
			
			//
			Double x=0.0, y=0.0, phi=0.0;
			
			// Hilfe
			help();
			
			// Soll der der Roboter in einer default Position erzeugt werden oder lieber selbst positionieren
			System.out.print("Wolen Sie die Anfangsposition des Roboters eingeben? (J/N):\n");	
			input = new String (in.readLine());
			
			// Koordinaten per Hand eingeben
			if (input.equalsIgnoreCase("J")) {
				System.out.print("x:");
				input = new String (in.readLine());
				x = Double.valueOf(input); //wandele den Wert in double um
				
				System.out.print("y:");
				input = new String (in.readLine());
				y = Double.valueOf(input);
				
				System.out.print("phi:");
				input = new String (in.readLine());
				phi = Double.valueOf(input);			
			}	// TODO Wenn nicht N dann trotzdem Nein
		
			// Welcher Roboter soll erzeugt werden
			System.out.print("Welche Roboter wollen Sie erstellen? (Slow/Fast):\n");	
			input = new String (in.readLine());
			
			if (input.equalsIgnoreCase("slow")) 
				ref = new SlowRobot(x.doubleValue(), y.doubleValue(), phi.doubleValue()); 
			else if (input.equalsIgnoreCase("fast")) 
				ref = new FastRobot(x.doubleValue(), y.doubleValue(), phi.doubleValue());
			else return;			
		
			// Schleife , die die Befehle des Roboters bearbeitet solange der User nicht beendet (quit)
			do {
				input = new String (in.readLine());
				// nach links
				if (input.equalsIgnoreCase("left"))     { 
					ref.left();    
					continue; 
				}
			// nach rechts
				if (input.equalsIgnoreCase("right"))    { 
					ref.right();    
					continue; 
				}				
			// nach vorne
				if (input.equalsIgnoreCase("forward"))  { 
					ref.forward();  
					continue; 
				}
			// nach hinten
				if (input.equalsIgnoreCase("backward")) { 
					ref.backward(); 
					continue; 
				}
				
				// setzt den Roboter auf die Position 0.0 0.0 0.0
				if (input.equalsIgnoreCase("reset")) { 
					ref.reset(); 
					continue; 
				}
				
				if (input.equalsIgnoreCase("position")) { 
					System.out.print(ref.toString()); 
					continue; 
				}
				
			// Programm beenden
				if (input.equalsIgnoreCase("quit")) 
					return ;
			
			} while(true);
		
		}
        catch(IOException e) {
        	e.printStackTrace();
        }
		
	} // End Main
	
}
