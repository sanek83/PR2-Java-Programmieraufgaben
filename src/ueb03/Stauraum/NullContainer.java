package ueb03.Stauraum;

import java.util.HashMap;
import java.util.Map;

import ueb03.Interfaces.Physikalisch_IF;
import ueb03.Stauraum.interfaces.Container_IF;
/**
 * 
 *  @author Alexander Albrant 
 *  @author Mikhael Goldenzweig
 *  @version 0.1
 */
public class NullContainer implements Container_IF{
	
	private Location location;	
	private Map<Object,Integer> bag; //Object Typ - aus Kompatibilitaets Gruenden

	public NullContainer(int bay, int row, int tier) {
		
		this.location = new ContainerLocation(bay, row, tier);
		this.bag = new HashMap<Object,Integer>();
	}
	
	public boolean contains(Physikalisch_IF obj) 
		throws CarryException{		
		//return false;
		return (bag.get(obj.uniqueId())!=null); 
		// gibt immer false zurueck da keine Objekte in bag geladen werden duerfen!
	}
	
	public double getGewicht() {		
		return 0;
	}

	public double getLadungsGewicht() {
		return 0;
	}

	public double getLeerGewicht() {
		return 0;
	}

	public Location getLocation() {
		return location;
	}

	public void load(Physikalisch_IF obj) 
		throws CarryException {
		throw new CarryException("Cant load objects in a NullContainer!");
	}

	public void setLadungsGewicht(double ladungsGewicht) 
		throws CarryException {
		throw new CarryException("Cant set weight for NullContainer!");
	}

	public void setLocation(int bay, int row, int tier) 
		throws CarryException {
		throw new CarryException("Cant set location for NullContainer!");
	}

	public int uniqueId() 
		throws CarryException{
		throw new CarryException("NullContainer cant have an id!");
	}

	public boolean isNull() {
		return true;
	}
}
