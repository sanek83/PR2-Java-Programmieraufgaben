package ueb03.Interfaces;

/**
 * 
 *  @author Alexander Albrant 
 *  @author Mikhael Goldenzweig
 *  @version 0.1
 */
import ueb03.Stauraum.CarryException;

public interface Identifiziert_IF {

  public int uniqueId() throws CarryException;
}