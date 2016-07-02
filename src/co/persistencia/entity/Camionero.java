package co.persistencia.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.CascadeType;
import javax.persistence.*;
import org.hibernate.annotations.*;



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

    private String poblacion;
    
    @Column(name="telefono")
	private String telefono;
    
  
	
	
	
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

    public String getPoblacion() {
		return poblacion;
	}


	public void setPoblacion(String poblacion) {
		this.poblacion = poblacion;
	}
	
	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	
	
	
	@OneToMany (cascade = CascadeType.ALL)
	@JoinColumn (name ="id_camionero")
	//@IndexColumn (name ="id")
	private List<Paquete> paquetes;
    
    public List<Paquete> getPaquetes() {
		return paquetes;
	}


	public void setPaquetes(List<Paquete> paquetes) {
		this.paquetes = paquetes;
	}


	public Camionero( String dni, String nombre, String telefono, double salario, String poblacion,
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


}
