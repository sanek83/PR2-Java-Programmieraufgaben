package ueb03.werft.y;

import ueb03.Interfaces.Fahrzeug_IF;
import ueb03.Interfaces.Rumpf_IF;
import ueb03.Stauraum.CarryException;

/**
 * 
 * @author Albrant
 * @author Goldenzweig
 *
 */
public abstract class Fahrzeug implements Fahrzeug_IF {

  private Rumpf_IF rumpf;

  public Fahrzeug(Rumpf_IF rumpf) {
	super();
	this.rumpf = rumpf;
  }

  public double getGewicht() {
	  return rumpf.getGewicht();
  }

  public String getName() {
	  return rumpf.getName();
  }

  public void setName(String name) {
	  rumpf.setName(name);
  }
  
  public int uniqueId() 
  	  throws CarryException {
	  return rumpf.uniqueId();
  }
}