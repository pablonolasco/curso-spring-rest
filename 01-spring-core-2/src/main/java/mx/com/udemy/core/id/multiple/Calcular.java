/**
 * 
 */
package mx.com.udemy.core.id.multiple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * @author pablo
 *
 */
@Service
public class Calcular {

	@Autowired
	private List<IFigure> listFigure;

	public Double getTotalArea() {
		double area=0;
		for(IFigure figure:listFigure) {
			area+=figure.calcularArea();
		}
		
		return area;
		//return listFigure.stream().mapToDouble(f -> f.calcularArea()).sum();
	}

}
