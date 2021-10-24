/**
 * 
 */
package mx.com.udemy.core.id.multiple;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author pablo
 *
 */
@Component
public class Circulo implements IFigure {
	
	@Value("14")
	private Double radio;
	
	@Override
	public double calcularArea() throws NumberFormatException {
		// TODO Auto-generated method stu
		return Math.round(Math.PI) * Math.pow(radio,2);
	}

}
