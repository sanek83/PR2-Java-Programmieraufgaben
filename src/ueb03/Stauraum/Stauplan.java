package ueb03.Stauraum;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import ueb03.Stauraum.interfaces.Container_IF;
import ueb03.Stauraum.interfaces.Stauraum_IF;

/**
 * 
 *  @author Alexander Albrant 
 *  @author Mikhael Goldenzweig
 *  @version 0.1
 */
public class Stauplan implements Stauraum_IF {

	private final int MAX_CONTAINER;
	private final int Bays;  //breite 
	private final int Rows;  //laenge
	private final int Tiers; //hoehe	
	private int Weight;
	
	private List<List<List<Container_IF>>> containerStowagePlan; 
	
	public Stauplan(int max_container, int bays, int rows, int tiers) {
		
		MAX_CONTAINER = max_container;
		Bays = bays;
		Rows = rows;
		Tiers = tiers;
		Weight = 0;
		
		List<Container_IF> tierlist;
		List<List<Container_IF>> rowlist; 
		containerStowagePlan  = new ArrayList<List<List<Container_IF>>>();
		
		for (int bay=0; bay<bays; bay++) {
			rowlist = new ArrayList<List<Container_IF>>();
			for (int row=0; row<rows; row++) {
				tierlist = new ArrayList<Container_IF>();
				for (int tier=0; tier<tiers; tier++) {
					tierlist.add(new NullContainer(bay,row,tier));
				}
				rowlist.add(tierlist);
			}
			containerStowagePlan.add(rowlist);
		}
		
	}
	/**
	 * 
	 * 
	 */
	public Collection<Container_IF> allContainersContained() {
		
		Container_IF container;
		List<Container_IF> allContainers = new ArrayList<Container_IF>();
		for (int bay=0; bay<Bays; bay++) {
			for (int row=0; row<Rows; row++) {
				for (int tier=0; tier<Tiers; tier++) {
					container = containerStowagePlan.get(bay).get(row).get(tier);
					if (!container.isNull()) allContainers.add(container);
				}				
			}			
		}	
		return allContainers;
	}

	/**
	 * 
	 * 
	 */
	public Container_IF containerAtLocation(Location location) 
		throws CarryException {
		return ((containerStowagePlan.get(location.getBay())).get(location.getRow())).get(location.getTier());
	}

	/**
	 * 
	 * 
	 */
	public boolean containsAllContainers(Collection<Container_IF> containerColl) 
		throws CarryException {
		
		Iterator<Container_IF> it = containerColl.iterator();
		
		while (it.hasNext()) {
			if (!this.containsContainer(it.next().uniqueId()))				
				return false;
		}
		return true;
	}

	/**
	 * 
	 * 
	 */
	public boolean containsContainer(double container_id) 
		throws CarryException {

		Container_IF cur_container;
		Iterator<List<List<Container_IF>>> itr_bay = containerStowagePlan.iterator();
		while (itr_bay.hasNext()) {			
			List<List<Container_IF>> rowlist = itr_bay.next();			
			Iterator<List<Container_IF>> itr_row = rowlist.iterator();
			while (itr_row.hasNext()) {				
				List<Container_IF> tierlist = itr_row.next();				
				Iterator<Container_IF> itr_tier = tierlist.iterator();
				while (itr_tier.hasNext()) {
					cur_container = itr_tier.next();
					if (!cur_container.isNull())
						if (cur_container.uniqueId()==container_id)
							return true;
				}
			}
		}
		
		return false;
	}

	public double gewicht(/*List list,double gewicht*/) {
		
		double gewicht = 0;
		/*
		for (int bay=0; bay<Bays; bay++) {
			for (int row=0; row<Rows; row++) {
				for (int tier=0; tier<Tiers; tier++) {
					gewicht += containerStowagePlan.get(bay).get(row).get(tier).getGewicht();					
				}				
			}			
		}
		*/
		
		Iterator<List<List<Container_IF>>> itr_bay = containerStowagePlan.iterator();
		while (itr_bay.hasNext()) {			
			List<List<Container_IF>> rowlist = itr_bay.next();			
			Iterator<List<Container_IF>> itr_row = rowlist.iterator();
			while (itr_row.hasNext()) {				
				List<Container_IF> tierlist = itr_row.next();				
				Iterator<Container_IF> itr_tier = tierlist.iterator();
				while (itr_tier.hasNext()) {
					gewicht += itr_tier.next().getGewicht();
				}
			}
		}
		return gewicht;
		
		/*
		Iterator it = list.iterator();
		while (it.hasNext()) {
			//next = it.next();
			if (!next.instanceof(Container_IF))
				gewicht(next,gewicht);
			gewicht += next.getGewicht;	
		}
		return gewicht;
		*/
	}

	public double gewichtBay(int bayNo) {
		
		double gewicht = 0;
		List<List<Container_IF>> theBay = containerStowagePlan.get(bayNo);
		Iterator<List<Container_IF>> itr_row = theBay.iterator();
		
		while (itr_row.hasNext()) {
			List<Container_IF> tierList =itr_row.next();
			Iterator<Container_IF>itr_tier = tierList.iterator();
			while (itr_tier.hasNext()) {
				gewicht+= itr_tier.next().getGewicht();
			}
		}
		return gewicht;
		/*
		double gewicht = 0;		
		for (int row=0; row<Rows; row++) {
			for (int tier=0; tier<Tiers; tier++) {
				gewicht += containerStowagePlan.get(bayNo).get(row).get(tier).getGewicht();					
			}				
		}
		return gewicht;
		*/		
	}

	public double gewichtRow(int rowNo) {
		
		double gewicht = 0;
		List<List<Container_IF>> theRow = containerStowagePlan.get(rowNo);
		Iterator<List<Container_IF>> itr_bay = theRow.iterator();
		
		while (itr_bay.hasNext()) {

			List<Container_IF> tierList = itr_bay.next();
			Iterator<Container_IF>itr_tier = tierList.iterator();
			while (itr_tier.hasNext()) {
				gewicht+= itr_tier.next().getGewicht();
			}
		}
		return gewicht;

		/*
		double gewicht = 0;		
		for (int bay=0; bay<Bays; bay++) {
			for (int tier=0; tier<Tiers; tier++) {
				gewicht += containerStowagePlan.get(bay).get(rowNo).get(tier).getGewicht();					
			}				
		}
		return gewicht;
		*/
	}

	public double gewichtTier(int tierNo) {
		
		double gewicht = 0;
		
		for (int bay=0; bay<Bays; bay++) {
			for (int row=0; row<Rows; row++) {
				gewicht += containerStowagePlan.get(bay).get(row).get(tierNo).getGewicht();					
			}				
		}
		return gewicht;
	}
	
	public void load(Container_IF container, int bayNo, int rowNo) 
		throws CarryException {
		
		Container_IF cur_container;
		
		List<Container_IF> tierList = containerStowagePlan.get(bayNo).get(rowNo);
		/*
		ListIterator<Container_IF> it = tierList.listIterator();
		
		while(it.hasNext()) {			
			cur_container = it.next();
			if (cur_container.isNull()) {				
				it.set(container);
				container.setLocation(bay, row, tier)
				return;
			}
		}*/
		for (int tier = 0; tier<Tiers; tier++) {
			cur_container = tierList.get(tier);
			if (cur_container.isNull()) {				
				tierList.set(tier, container);
				container.setLocation(bayNo, rowNo, tier);
				return;
			}
		}
	}

	public void load(Container_IF container, int bayNo) throws CarryException {
		Container_IF cur_container;
		List<List<Container_IF>> tierList = containerStowagePlan.get(bayNo);
		
		for (int row = 0; row<Rows; row++) {
			for (int tier = 0; tier<Tiers; tier++) {
				cur_container = tierList.get(row).get(tier);
				if (cur_container.isNull()) {				
					tierList.get(row).set(tier, container);
					container.setLocation(bayNo, row, tier);
					return;
				}
			}
		}
	}

	public void load(Container_IF container) throws CarryException {
		Container_IF cur_container;
		List<List<List<Container_IF>>> tierList = containerStowagePlan;
		
		for (int bay = 0; bay<Bays; bay++) {
			for (int row = 0; row<Rows; row++) {
				for (int tier = 0; tier<Tiers; tier++) {
					cur_container = tierList.get(bay).get(row).get(tier);
					if (cur_container.isNull()) {				
						tierList.get(bay).get(row).set(tier, container);
						container.setLocation(bay, row, tier);
						return;
					}
				}
			}
		}
			
	}

	public void loadAll(Collection<Container_IF> containerColl) throws CarryException {
		Container_IF cur_container;
		List<List<List<Container_IF>>> tierList = containerStowagePlan;
		
		Iterator<Container_IF> it = containerColl.iterator();
		while (it.hasNext()) {
			for (int bay = 0; bay<Bays; bay++) {
				for (int row = 0; row<Rows; row++) {
					for (int tier = 0; tier<Tiers; tier++) {
						cur_container = tierList.get(bay).get(row).get(tier);
						
						if (cur_container.isNull()) {				
							tierList.get(bay).get(row).set(tier, it.next());
							it.next().setLocation(bay, row, tier);
							return;
						}
					}
				}
			}
		}
	}

	public Location locationOfContainer(double container_id) 
		throws CarryException {
		
		Container_IF cur_container;
		
		for (int bay=0; bay<Bays; bay++) {
			for (int row=0; row<Rows; row++) {
				for (int tier=0; tier<Tiers; tier++) {					
					cur_container = containerStowagePlan.get(bay).get(row).get(tier);
					if (!cur_container.isNull())
						if (cur_container.uniqueId()==container_id)
							return cur_container.getLocation();		
				}
			}
		}
		return null;
	}
	
}
