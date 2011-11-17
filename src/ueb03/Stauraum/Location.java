package ueb03.Stauraum;
/**
 * 
 *  @author Alexander Albrant 
 *  @author Mikhael Goldenzweig
 *  @version 0.1
 */
public abstract class Location {
	
	protected boolean isNull() {		
		return this instanceof ContainerNullLocation;
	}

	abstract protected int getBay()throws CarryException;

	abstract protected  void setBay(int bay)throws CarryException;
	
	abstract protected  int getRow()throws CarryException;
	
	abstract protected  void setRow(int row)throws CarryException;

	abstract protected int getTier()throws CarryException;

	abstract protected void setTier(int tier)throws CarryException;

}
