package ueb03.zulieferer.b;

import ueb03.Interfaces.Rumpf_IF;
/**
 * 
 *  @author Alexander Albrant 
 *  @author Mikhael Goldenzweig
 *  @version 0.1
 */
public abstract class Rumpfkomponente extends Komponente implements Rumpf_IF {

	private String name;	

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}
	
}