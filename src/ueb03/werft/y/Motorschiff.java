package ueb03.werft.y;

import ueb03.Interfaces.Motor_IF;
import ueb03.Interfaces.Motorschiff_IF;
import ueb03.Interfaces.Rumpf_IF;

/**
 * 
 *  @author Alexander Albrant 
 *  @author Mikhael Goldenzweig
 *  @version 0.1
 */
public class Motorschiff extends Motorfahrzeug implements Motorschiff_IF {

	public Motorschiff(Rumpf_IF rumpf, Motor_IF motor) {
		super(rumpf, motor);
		// TODO Auto-generated constructor stub
	}
}