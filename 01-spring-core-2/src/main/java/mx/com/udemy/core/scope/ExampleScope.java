/**
 * 
 */
package mx.com.udemy.core.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * @author pablo
 *
 */
@Service
//@Scope("prototype")// crea una nueva instancia cada vez que se solicita
@Scope("singleton")// viene por defecto
public class ExampleScope {

}
