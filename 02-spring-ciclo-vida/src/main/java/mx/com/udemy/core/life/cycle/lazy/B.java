package mx.com.udemy.core.life.cycle.lazy;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy(false)
public class B {
	
	private static final Logger log = LoggerFactory.getLogger(B.class);
	@Autowired
	private A a;
	@PostConstruct
	public void init() {
		log.info("Init B");
	}
}
