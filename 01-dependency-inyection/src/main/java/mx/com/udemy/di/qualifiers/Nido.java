/**
 * 
 */
package mx.com.udemy.di.qualifiers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author pablo
 *
 */
@Component
public class Nido {

	
	private static final Logger log = LoggerFactory.getLogger(Nido.class);

	@Autowired
	//@Qualifier("pajarito")
	private Animal animal;
	
	public void imprimir() {
		log.info("nido tiene al animal {}",animal.getNombre());
	}
}
