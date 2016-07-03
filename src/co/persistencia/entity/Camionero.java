package co.persistencia.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



//import org.hibernate.annotations.Table;

@Entity
@Table (name="camionero")

public class Camionero {
	@Id
	@GeneratedValue (strategy =GenerationType.IDENTITY)
    @Column(name="id")
	private int id;
	
	
	@Column(name="dni")
	private String dni;
    
    @Column(name="nombre")
	private String nombre;
    
    @Column(name="direccion")
    private String direccion;
    
    @Column(name="salario")
  	private double salario;
      

    @Column(name="poblacion")
    private Integer poblacion;
    
    @Column(name="telefono")
	private String telefono;
    
    public Camionero (int id){
    	
    	this.id = id;
    }
    
    public Camionero() {
		// TODO Auto-generated constructor stub
	}
  
    public Camionero( String dni, String nombre, String telefono, double salario, Integer poblacion,
			String direccion) {
		super();
		//this.id = id;
		this.dni = dni;
		this.nombre = nombre;
		this.direccion = direccion;
		this.salario = salario;
		this.poblacion = poblacion;
		this.telefono = telefono;
		
		
		
		
	}
	
    
    
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getDni() {
		return dni;
	}


	public void setDni(String dni) {
		this.dni = dni;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	
	public double getSalario() {
		return salario;
	}


	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

    public Integer getPoblacion() {
		return poblacion;
	}


	public void setPoblacion(Integer poblacion) {
		this.poblacion = poblacion;
	}
	
	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	@Override
	public String toString() {
		return "Camionero [id=" + id + ", dni=" + dni + ", nombre=" + nombre + ", direccion=" + direccion + ", salario="
				+ salario + ", poblacion=" + poblacion + ", telefono=" + telefono + "]";
	}
	
	

}
