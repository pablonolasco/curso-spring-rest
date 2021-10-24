package mx.com.udemy.core;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import mx.com.udemy.core.id.multiple.Calcular;
import mx.com.udemy.core.id.multiple.IFigure;
import mx.com.udemy.core.profiles.IEnviromentService;
import mx.com.udemy.core.scope.ExampleScope;

@SpringBootApplication
public class Application {
	
	private static final Logger log = LoggerFactory.getLogger(Application.class);

	@Bean
	public String getApplicationName() {
		return "Bean explicito";
	}
	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(Application.class, args);
	//	IEnviromentService enviromentService=applicationContext.getBean(IEnviromentService.class);
		/*ExampleScope exampleScope=applicationContext.getBean(ExampleScope.class);
		ExampleScope exampleScope2=applicationContext.getBean(ExampleScope.class);
		String name=applicationContext.getBean(String.class);
		log.info("scope {}",exampleScope.equals(exampleScope2));
		log.info("scope {}",exampleScope==exampleScope2);
		log.info("bean {}",name);*/
		// inyecta ambos component, cuadrado y circulo
		Calcular figure= applicationContext.getBean(Calcular.class);
		
		log.info("res {} {}",figure.getTotalArea(), figure.getClass().getName());
	}

}
