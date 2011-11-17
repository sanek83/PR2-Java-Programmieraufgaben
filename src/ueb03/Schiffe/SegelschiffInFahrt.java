package ueb03.Schiffe;
import ueb03.Interfaces.Segelschiff_IF;

/**
 * 
 *  @author Alexander Albrant 
 *  @author Mikhael Goldenzweig
 *  @version 0.1
 */
public class SegelschiffInFahrt extends SchiffinFahrt {

	private Segelschiff_IF schiff;

	public SegelschiffInFahrt(Segelschiff_IF schiff) {
		super();
		this.schiff = schiff;
	}

	public double getFlaeche() {
		return schiff.getFlaeche();
	}

	public double getGewicht() {
		return schiff.getGewicht();
	}

	public String getName() {
		return schiff.getName();
	}

	public void setName(String name) {
		schiff.setName(name);
	}
  
}