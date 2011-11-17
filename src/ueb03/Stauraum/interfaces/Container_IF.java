package ueb03.Stauraum.interfaces;

import ueb03.Interfaces.Physikalisch_IF;
import ueb03.Stauraum.CarryException;
import ueb03.Stauraum.Location;

/**
 * 
 *  @author Alexander Albrant 
 *  @author Mikhael Goldenzweig
 *  @version 0.1
 */
public interface Container_IF extends Physikalisch_IF{
	
	void load(Physikalisch_IF obj) throws CarryException;	
	boolean contains(Physikalisch_IF obj) throws CarryException;	
	Location getLocation();
	void setLocation(int bay, int row, int tier) throws CarryException;	
	void setLadungsGewicht(double ladungsGewicht) throws CarryException;
	boolean isNull();
		
	double getLeerGewicht();
	double getLadungsGewicht();
	double getGewicht();
}
