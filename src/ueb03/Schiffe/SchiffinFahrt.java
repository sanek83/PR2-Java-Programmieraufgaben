package ueb03.Schiffe;

import ueb03.Interfaces.Position;
import ueb03.Interfaces.SchiffInFahrt_IF;
import ueb03.Interfaces.Schiff_IF;

/**
 * 
 *  @author Alexander Albrant 
 *  @author Mikhael Goldenzweig
 *  @version 0.1
 */
public abstract class SchiffinFahrt implements SchiffInFahrt_IF{

	private Position position;
	private boolean infahrt;
	protected Schiff_IF schiff;
	
	public Position getPosition() {		
		return position;
	}
	
	public boolean equals(Object arg0) {
		return schiff.equals(arg0);
	}

	public boolean getFahrt() {
		return infahrt;
	}

	public double getGewicht() {
		return schiff.getGewicht();
	}

	

	public String getName() {
		return schiff.getName();
	}

	public int hashCode() {
		return schiff.hashCode();
	}

	public void setFahrt(boolean fahrt) {
		infahrt = true;
	}

	public void setName(String name) {
		schiff.setName(name);
	}

	public void setPosition(int x, int y) {
		position.x = x;
		position.y = y;
	}

	public String toString() {
		return schiff.toString();
	}	
}