package ueb03.Stauraum.interfaces;

import java.util.Collection;

import ueb03.Stauraum.CarryException;
import ueb03.Stauraum.Location;
/**
 * 
 *  @author Alexander Albrant 
 *  @author Mikhael Goldenzweig
 *  @version 0.1
 */
public interface Stauraum_IF {
	
	void load(Container_IF container, int bayNo, int rowNo) throws CarryException;
	void load(Container_IF container, int bayNo) throws CarryException;
	void load(Container_IF container) throws CarryException;	
	void loadAll(Collection<Container_IF> containerColl) throws CarryException;
	
	boolean containsContainer(double container_id) throws CarryException;
	boolean containsAllContainers(Collection<Container_IF> containerColl) 
		throws CarryException;
	
	Collection<Container_IF> allContainersContained();
	Location           locationOfContainer(double container_id) throws CarryException;
	Container_IF       containerAtLocation(Location location) throws CarryException;
	
	double gewicht();
	double gewichtBay (int bayNo);
	double gewichtRow (int rowNo);
	double gewichtTier(int tierNo);
}
