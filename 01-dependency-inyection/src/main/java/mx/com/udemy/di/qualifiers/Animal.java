/**
 * 
 */
package mx.com.udemy.di.qualifiers;

/**
 * @author pablo
 *
 */
public abstract class Animal {
	private String nombre;
	private Integer edad;
	
	/**
	 * @param nombre
	 * @param edad
	 */
	public Animal(String nombre, Integer edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	
	

}
