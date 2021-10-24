package mx.com.udemy.di;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import mx.com.udemy.di.attribute.Coche;
import mx.com.udemy.di.constuctor.Car;
import mx.com.udemy.di.qualifiers.Animal;
import mx.com.udemy.di.qualifiers.Nido;
import mx.com.udemy.di.qualifiers.Pajaro;
import mx.com.udemy.di.qualifiers.Perro;
import mx.com.udemy.di.setter.Cars;

@SpringBootApplication
public class Application {
	
	private static final Logger log = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(Application.class, args);
		//Coche coche=applicationContext.getBean(Coche.class);
		//Car car=applicationContext.getBean(Car.class);
		//Cars cars=applicationContext.getBean(Cars.class);
		//Pajaro pajaro=applicationContext.getBean(Pajaro.class);
		//Perro perro=applicationContext.getBean(Perro.class);

		//log.info("objeto {} {}",perro.getClass().getName().substring(27, 32),perro.getNombre());

		/*Animal animal=applicationContext.getBean("pajarito",Animal.class);
		log.info("objeto nombre {}",animal.getNombre());
		*/
		
		Nido nido=applicationContext.getBean(Nido.class);
		nido.imprimir();
		//System.out.println(cars);
		/*
		 * Motor motor= new Motor("BMW", 2018); Coche coche= new Coche("Camineta XL4",
		 * 2018, motor); System.out.println(coche);
		 */

	}

}
