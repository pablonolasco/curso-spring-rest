/**
 * 
 */
package mx.com.udemy.di.setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author pablo
 *
 */
@Component
public class Cars {

	private String marca;

	private Integer modelo;

	private Motorss motor;

	/**
	 * 
	 */
	public Cars() {
		super();
	}

	/**
	 * @param marca
	 * @param modelo
	 * @param motor
	 */
	
	public Cars(String marca, Integer modelo, Motorss motor) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.motor = motor;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Integer getModelo() {
		return modelo;
	}

	public void setModelo(Integer modelo) {
		this.modelo = modelo;
	}

	public Motorss getMotor() {
		return motor;
	}

	@Autowired
	public void setMotors(Motorss monitor) {
		this.motor = monitor;
	}

	@Override
	public String toString() {
		return "Coche [marca=" + marca + ", modelo=" + modelo + ", motor=" + motor + "]";
	}

}
