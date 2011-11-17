package ueb03.werft.y;

import ueb03.Interfaces.Rumpf_IF;
import ueb03.Interfaces.Segel_IF;
/**
 * 
 *  @author Alexander Albrant 
 *  @author Mikhael Goldenzweig
 *  @version 0.1
 */
public abstract class Segelfahrzeug extends Fahrzeug {

  private Segel_IF segel;

  public Segelfahrzeug(Rumpf_IF rumpf, Segel_IF segel) {
	  super(rumpf);
	  this.segel = segel;
  }

  public double getFlaeche() {
	  return segel.getFlaeche();
  }

  public double getGewicht() {
	  return segel.getGewicht() + super.getGewicht();
  }
  
}