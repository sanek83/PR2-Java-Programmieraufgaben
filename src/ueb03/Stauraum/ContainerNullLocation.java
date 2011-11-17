package ueb03.Stauraum;

/**
 * 
 *  @author Alexander Albrant 
 *  @author Mikhael Goldenzweig
 *  @version 0.1
 */
public class ContainerNullLocation extends Location{

	protected int getBay() 
		throws CarryException {		
		throw new CarryException("Cant get Bay for a NullLocation!");
	}


	protected int getRow()
		throws CarryException {		
		throw new CarryException("Cant get Row for a NullLocation!");
	}

	protected int getTier()
		throws CarryException {		
		throw new CarryException("Cant get Tier for a NullLocation!");
	}
	
	protected void setBay(int bay) 
		throws CarryException {		
		throw new CarryException("Cant set Bay for a NullLocation!");
	}

	protected void setRow(int row) 
		throws CarryException {		
		throw new CarryException("Cant set Row for a NullLocation!");
	}

	protected void setTier(int tier) 
		throws CarryException {		
		throw new CarryException("Cant set Tier for a NullLocation!");
	}

}
