package co.persistencia.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
//import org.hibernate.annotations.Table;
import javax.persistence.Table;

import org.hibernate.annotations.IndexColumn;

@Entity
@Table (name ="paquete")
public class Paquete {
	
	public Paquete( String codigo, String descricion, String destinatario, String direccion_destinatario,
			Camionero id_camionero, Provincia provincia) {
		super();
		
		this.codigo = codigo;
		this.descricion = descricion;
		this.destinatario = destinatario;
		this.direccion_destinatario = direccion_destinatario;
		this.id_camionero = id_camionero;
		this.provincia = provincia;
	}
	@Id
	@Column(name="id")
	private int id;
		
	@Column(name ="codigo")
	private String codigo;
	
	@Column(name ="descricion")
	private String descricion;
	
	@Column(name ="destinatario")
	private String destinatario;
	
	@Column(name ="direccion_destinatario")
	private String direccion_destinatario;
	
	@ManyToOne
	@JoinColumn(name = "id_camionero")
    @Column(name ="id_camionero")
    private Camionero id_camionero;
  
	  public Camionero getId_camionero() {
		return id_camionero;
	}
	public void setId_camionero(Camionero id_camionero) {
		this.id_camionero = id_camionero;
	}
	//Relaciones
	@ManyToOne
	@JoinColumn(name = "id_provincia")
	private Provincia provincia;
	
	public Provincia getProvincia() {
		return provincia;
	}
	public void setProvincia(Provincia provincia) {
		this.provincia = provincia;
	}
}

	
	
	
	

