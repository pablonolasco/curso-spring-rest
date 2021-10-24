/**
 * 
 */
package mx.com.udemy.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * @author pablo
 *
 */
@Configuration
@PropertySource("classpath:areas.properties")
public class FiguraPropertyConfiguration {

	/**
	 * bean explicito
	 */
	@Bean
	public PropertySourcesPlaceholderConfigurer loadProperties() {
		return new PropertySourcesPlaceholderConfigurer();
	}
	
	

}
