package co.persistencia.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name="camion_camionero") 
public class CamionCamionero implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column
	private int id;

	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="camionero_id")
	private Camionero camionero;
	
	//NEL
	//Su uso no es recomendado.
	//@OneToMany
	//List<Camion> camiones;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name ="camion_id")
	private Camion camion;
	
	@Column
	private Date fecha;
	
	public int getId() {
		
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Camionero getCamionero() {
		return camionero;
	}
	public void setCamionero(Camionero camionero) {
		this.camionero = camionero;
	}
	public Camion getCamion() {
		return camion;
	}
	public void setCamion(Camion camion) {
		this.camion = camion;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	@Override
	public String toString() {
		return "CamionCamionero [id=" + id + ", camionero=" + camionero + ", camion=" + camion + ", fecha=" + fecha
				+ "]";
	}
	
	
}
