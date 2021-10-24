/**
 * 
 */
package mx.com.udemy.core.profiles;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * @author pablo
 *
 */
@Service
@Profile("Prod")
public class ProdEnviroment implements IEnviromentService {

	@Override
	public String getEnviroment() {
		// TODO Auto-generated method stub
		return "Produccion";
	}

}
