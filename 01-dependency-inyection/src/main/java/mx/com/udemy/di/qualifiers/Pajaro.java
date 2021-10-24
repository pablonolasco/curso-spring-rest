/**
 * 
 */
package mx.com.udemy.di.qualifiers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author pablo
 *
 */
@Component("pajarito")
public class Pajaro extends Animal implements IVolador {

	public Pajaro(@Value("colibri") String nombre, @Value("4") Integer edad) {
		super(nombre, edad);
		// TODO Auto-generated constructor stub
	}

	private Logger log=LoggerFactory.getLogger(Pajaro.class);
	
	@Override
	public void volador() {
		// TODO Auto-generated method stub
		log.info("Soy un pajaro y estoy volando");
		
	}

}
