/**
 * 
 */
package mx.com.udemy.core.life.cycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author pablo
 *
 */
@Component
@Scope("prototype")
@Lazy
public class LifeCycle implements BeanNameAware {
	
	private static final Logger log = LoggerFactory.getLogger(LifeCycle.class);

	@Override
	public void setBeanName(String name) {
		// TODO Auto-generated method stub
		log.info("Bean name {}", name);
	}
	
	/**
	 * se ejecutara despues de la inyeccion de dependencia
	 */
	@PostConstruct
	public void init() {
		log.info("Post iniciando");
	}
	
	/**
	 * se ejecutara antes de que el bean sea destruido
	 * no se ejecuta para beans prototype
	 * solo se ejecutan durante una terminacion de la vm de forma normal
	 */
	@PreDestroy
	public void destroy() {
		log.info("Pre destruyendo");
	}

}
