package co.persistencia.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

//import org.hibernate.annotations.Table;
import javax.persistence.Table;

@Entity
@Table (name ="paquete")
public class Paquete {
	
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
	public String getDireccion_destinatario() {
		return direccion_destinatario;
	}
	public void setDireccion_destinatario(String direccion_destinatario) {
		this.direccion_destinatario = direccion_destinatario;
	}
}
