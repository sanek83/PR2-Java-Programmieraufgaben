package ueb03.zulieferer.a;

import ueb03.Interfaces.SchiffsRumpf_IF;
/**
 * 
 *  @author Alexander Albrant 
 *  @author Mikhael Goldenzweig
 *  @version 0.1
 */
public class Schiffsrumpf extends Schiffskomponente implements SchiffsRumpf_IF {
	
	private String name;


	public Schiffsrumpf(double gewicht, int id, String name) {
		this.id = id;
		this.gewicht = gewicht;
		this.name = name;
	}


	@Override
	public String getName() {
		return name;
	}


	@Override
	public void setName(String name) {
		this.name = name;		
	}

	

	
	
}