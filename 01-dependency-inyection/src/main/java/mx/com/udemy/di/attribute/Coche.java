/**
 * 
 */
package mx.com.udemy.di.attribute;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author pablo
 *
 */
@Component
public class Coche {
	
	@Value("Camioneta XL8")
	private String marca;
	
	@Value("2021")
	private Integer modelo;
	
	@Autowired
	private Motor motor;
	
	/**
	 * 
	 */
	public Coche() {
		super();
	}

	/**
	 * @param marca
	 * @param modelo
	 * @param motor
	 */
	public Coche(String marca, Integer modelo, Motor motor) {
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
	public Motor getMotor() {
		return motor;
	}
	
	public void setMonitor(Motor monitor) {
		this.motor = monitor;
	}

	@Override
	public String toString() {
		return "Coche [marca=" + marca + ", modelo=" + modelo + ", monitor=" + motor + "]";
	}
	
	

}
