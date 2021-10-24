/**
 * 
 */
package mx.com.udemy.di.qualifiers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @author pablo
 *
 */
@Component
@Primary
public class Perro extends Animal{

	public Perro(@Value("daiysi") String nombre, @Value("14") Integer edad) {
		super(nombre, edad);
		// TODO Auto-generated constructor stub
	}
	
}
