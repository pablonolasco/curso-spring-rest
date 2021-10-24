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
@Profile({"dev","default"})// valor por defecto sino se configura el perfil en el archivo application properties
public class DevEnviroment implements IEnviromentService {

	@Override
	public String getEnviroment() {
		// TODO Auto-generated method stub
		return "Dev";
	}

}
