package co.persistencia.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
//import org.hibernate.annotations.Table;
import javax.persistence.Table;

@Entity
@Table (name ="paquete")
public class Paquete implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

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
	private String direccionDestinatario;
	
	
	@ManyToOne
	@JoinColumn(name = "id_camionero")
    @Column(name ="id_camionero")
    private Camionero camionero;
  
	//Relaciones
	@ManyToOne
	@JoinColumn(name = "id_provincia")
	private Provincia provincia;
	
	public Paquete (){
		//do nothing
	}
	
	public Paquete( String codigo, String descricion, String destinatario, String direccion_destinatario,
			Camionero camionero, Provincia provincia) {
		this.codigo = codigo;
		this.descricion = descricion;
		this.destinatario = destinatario;
		this.direccionDestinatario = direccion_destinatario;
		this.camionero = camionero;
		this.provincia = provincia;
		
	}
	
	public Provincia getProvincia() {
		return provincia;
	}
	public void setProvincia(Provincia provincia) {
		this.provincia = provincia;
	}
	
	
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

	public String getDescricion() {
		return descricion;
	}

	public void setDescricion(String descricion) {
		this.descricion = descricion;
	}

	public String getDestinatario() {
		return destinatario;
	}

	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}

	public String getDireccionDestinatario() {
		return direccionDestinatario;
	}

	public void setDireccionDestinatario(String direccionDestinatario) {
		this.direccionDestinatario = direccionDestinatario;
	}

	public Camionero getCamionero() {
		return camionero;
	}

	public void setCamionero(Camionero camionero) {
		this.camionero = camionero;
	}
	
}

	
	
	
	

