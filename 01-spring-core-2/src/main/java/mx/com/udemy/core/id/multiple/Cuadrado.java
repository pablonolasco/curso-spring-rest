/**
 * 
 */
package mx.com.udemy.core.id.multiple;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @author pablo
 *
 */
@Component
public class Cuadrado implements IFigure {

	@Value("${cuadrado.lado}")
	private Double lado1;
	
	@Override
	public double calcularArea() throws NumberFormatException {
		// TODO Auto-generated method stub
		return lado1*lado1;
	}

}
