package ueb03.werft.y;

import ueb03.Interfaces.Rumpf_IF;
import ueb03.Interfaces.Segel_IF;
import ueb03.Interfaces.Segelschiff_IF;
/**
 * 
 *  @author Alexander Albrant 
 *  @author Mikhael Goldenzweig
 *  @version 0.1
 */
public class Segelschiff extends Segelfahrzeug implements Segelschiff_IF {

	public Segelschiff(Rumpf_IF rumpf, Segel_IF segel) {
		super(rumpf, segel);
		// TODO Auto-generated constructor stub
	}	
}