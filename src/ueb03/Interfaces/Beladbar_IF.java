package ueb03.Interfaces;

/**
 * 
 *  @author Alexander Albrant 
 *  @author Mikhael Goldenzweig
 *  @version 0.1
 */

import ueb03.Stauraum.CarryException;

public interface Beladbar_IF {

  public void ladeObjekt(Object o)
  	throws CarryException;

  public Object entladeObjekt()
  	throws CarryException;
}
