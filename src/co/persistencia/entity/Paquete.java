package co.persistencia.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
	//IDENTITY si
	@GeneratedValue(strategy=GenerationType.IDENTITY) //Si usar. Lo tomara para auto incrementable.
	@Column(name="id")
	private int id;
		
	@Column(name ="codigo")
	private String codigo;
	
	@Column
	private String descripcion;
	
	@Column(name ="destinatario")
	private String destinatario;
	
	@Column(name ="direccion_destinatario")
	private String direccionDestinatario;
	
	
	@ManyToOne
	@JoinColumn(name = "camion_camionero_id")
    private CamionCamionero camionCamionero;
  
	//Relaciones
	@ManyToOne
	@JoinColumn(name = "provincia_id")
	private Provincia provincia;
	
	public Paquete (){
		//do nothing Para instanciar uno por uno
	}
	
	public Paquete(int id){
		this.id =id;
		
	}
	
	public Paquete( String codigo, String descricion, String destinatario, String direccion_destinatario,
			CamionCamionero camionero, Provincia provincia) {
		this.codigo = codigo;
		this.descripcion = descricion;
		this.destinatario = destinatario;
		this.direccionDestinatario = direccion_destinatario;
		this.camionCamionero = camionero;
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
	
	

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
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

	public CamionCamionero getCamionCamionero() {
		return camionCamionero;
	}

	public void setCamionCamionero(CamionCamionero camionCamionero) {
		this.camionCamionero = camionCamionero;
	}
}

	
	
	
	

