package mx.com.udemy.core;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import mx.com.udemy.core.life.cycle.ExplicitBean;
import mx.com.udemy.core.life.cycle.LifeCycle;

@SpringBootApplication
public class Application {

	private static final Logger log = LoggerFactory.getLogger(Application.class);

	@Bean(initMethod="init",destroyMethod="destroy")
	public ExplicitBean getBean() {
		return new ExplicitBean();
	}
	public static void main(String[] args) {
		ApplicationContext applicationContext=SpringApplication.run(Application.class, args);
		LifeCycle lifeCycle= applicationContext.getBean(LifeCycle.class);
		//log.info(lifeCycle);
	}

}
