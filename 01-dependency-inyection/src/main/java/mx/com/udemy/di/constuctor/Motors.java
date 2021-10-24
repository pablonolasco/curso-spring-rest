/**
 * 
 */
package mx.com.udemy.di.constuctor;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author pablo
 *
 */
@Component
public class Motors {
	
	@Value("Ford")
	private String marca;
	
	@Value("2019")
	private Integer modelo;
	
	
	
	/**
	 * 
	 */
	public Motors() {
		super();
	}

	public Motors(String marca, Integer modelo) {
		this.marca=marca;
		this.modelo=modelo;
	}
	
	public void setMarca(String marca) {
		this.marca=marca;
	}
	
	public String getMarca() {
		return this.marca;
	}
	
	public void setModelo(Integer modelo) {
		this.modelo=modelo;
	}
	
	public Integer getModelo() {
		return this.modelo;
	}

	@Override
	public String toString() {
		return "Motor [marca=" + marca + ", modelo=" + modelo + "]";
	}
	
	
	
	

}
