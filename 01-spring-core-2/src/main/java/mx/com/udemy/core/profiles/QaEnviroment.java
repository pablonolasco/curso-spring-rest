/**
 * 
 */
package mx.com.udemy.core.profiles;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * @author pablo
 *
 */
@Service
@Profile("Qa")
public class QaEnviroment implements IEnviromentService {

	@Override
	public String getEnviroment() {
		// TODO Auto-generated method stub
		return "QA";
	}

}
