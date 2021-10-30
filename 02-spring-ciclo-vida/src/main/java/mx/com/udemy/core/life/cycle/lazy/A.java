package mx.com.udemy.core.life.cycle.lazy;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class A {

	
	private static final Logger log = LoggerFactory.getLogger(A.class);

	@PostConstruct
	public void init() {
		log.info("Init A");
	}
}
