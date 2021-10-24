/**
 * 
 */
package mx.com.udemy.di.constuctor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author pablo
 *
 */
@Component
public class Car {

	private String marca;

	private Integer modelo;

	private Motors motor;

	/**
	 * 
	 */
	public Car() {
		super();
	}

	/**
	 * @param marca
	 * @param modelo
	 * @param motor
	 */
	@Autowired
	public Car(@Value("Camioneta XL8")
	String marca, @Value("2020")
	Integer modelo, Motors motor) {
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

	public Motors getMotor() {
		return motor;
	}

	
	public void setMotors(Motors monitor) {
		this.motor = monitor;
	}

	@Override
	public String toString() {
		return "Coche [marca=" + marca + ", modelo=" + modelo + ", motor=" + motor + "]";
	}

}
