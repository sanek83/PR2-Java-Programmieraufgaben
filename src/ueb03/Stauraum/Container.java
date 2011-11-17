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
public class Container implements Container_IF{
	
	private Location location;	
	private double ladungsGewicht;
	private final double leerGewicht;
	private final int id;
	private Map<Object,Integer> bag; //Object Typ - aus Kompatibilitaets Grruenden
	
	public Container(double leerGewicht, int id) {
		
		this.location = new ContainerNullLocation();
		this.leerGewicht = leerGewicht;
		this.ladungsGewicht = 0;
		this.id = id;
		this.bag = new HashMap<Object,Integer>();
	}
		
	public void load(Physikalisch_IF obj) 
		throws CarryException {
		if  (bag.get(obj.uniqueId()) == null) bag.put(obj.uniqueId(), new Integer(1));
		else bag.put(obj.uniqueId(), new Integer(bag.get(obj.uniqueId()).intValue() + 1) );
		ladungsGewicht+=obj.getGewicht();
	}
	
	public boolean contains(Physikalisch_IF obj) 
		throws CarryException {
		return bag.containsKey(obj.uniqueId());
	}
	
	public Location getLocation() {
		return location;
	}

	public void setLocation(int bay, int row, int tier) throws CarryException {
		
		if(location instanceof ContainerNullLocation)			
			location = new ContainerLocation(bay,row,tier);
		else {		
			this.location.setBay(bay);
			this.location.setRow(row);
			this.location.setTier(tier);
		}
	}

	public double getLeerGewicht() {
		return leerGewicht;
	}

	public double getLadungsGewicht() {
		return ladungsGewicht;
	}

	public void setLadungsGewicht(double ladungsGewicht) {
		this.ladungsGewicht = ladungsGewicht;
	}
	
	public double getGewicht() {
		return leerGewicht + ladungsGewicht;
	}

	public int uniqueId() {		//getId
		return id;
	}

	public boolean isNull() {
		return false;
	}

}
