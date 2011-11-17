package ueb03.Stauraum;
/**
 * 
 *  @author Alexander Albrant 
 *  @author Mikhael Goldenzweig
 *  @version 0.1
 */
public class ContainerLocation extends Location{

	private int bay;
	private int row;
	private int tier;
	
	public ContainerLocation(int bay, int row, int tier) {
		
		this.bay = bay;
		this.row = row;
		this.tier = tier;
	}

	protected int getBay() {
		return bay;
	}

	public void setBay(int bay) {
		this.bay = bay;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getTier() {
		return tier;
	}

	public void setTier(int tier) {
		this.tier = tier;
	}
		
}
