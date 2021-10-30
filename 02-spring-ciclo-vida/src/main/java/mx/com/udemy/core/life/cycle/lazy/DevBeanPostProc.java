/**
 * 
 */
package mx.com.udemy.core.life.cycle.lazy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @author pablo
 *
 */
@Component
public class DevBeanPostProc implements BeanPostProcessor {
	
	
	private static final Logger log = LoggerFactory.getLogger(DevBeanPostProc.class);

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		// TODO Auto-generated method stub
		log.info("Before inicializacion {}",beanName);
		return beanName;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		// TODO Auto-generated method stub
		log.info("After inicializacion {}",beanName);
		return beanName;
	}

	

}
