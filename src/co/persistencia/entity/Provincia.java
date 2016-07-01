package co.persistencia.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import javax.persistence.CascadeType;
import org.hibernate.annotations.IndexColumn;
import javax.persistence.Table;

@Entity

@Table(name ="Provincia")


public class Provincia {
	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="codigo")
	private String codigo;
	
	@Column(name="nombre")
	private String nombre;
	
	@OneToMany (cascade = CascadeType.ALL)
	@JoinColumn (name ="id_provincia")
	@IndexColumn (name ="id")
	private List<Paquete> paquetes; 
	
	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getCodigo() {
		return codigo;
	}



	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	
	public Provincia( String codigo, String nombre) {
		super();
		//this.id = id;
		this.codigo = codigo;
		this.nombre = nombre;
	
		
		
	}
}
