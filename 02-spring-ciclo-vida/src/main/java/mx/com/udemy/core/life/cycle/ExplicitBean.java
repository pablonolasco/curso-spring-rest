/**
 * 
 */
package mx.com.udemy.core.life.cycle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Lazy;

/**
 * @author pablo
 *
 */
@Lazy
public class ExplicitBean {
	
	
	private static final Logger log = LoggerFactory.getLogger(ExplicitBean.class);

	public void init() {
		log.info("init method");
	}
	
	public void destroy() {
		log.info("destroy method");
	}

}
