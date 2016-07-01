package co.persistencia.test;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import co.persistencia.entity.Camionero;
import co.persistencia.entity.Paquete;
import co.persistencia.entity.Provincia;

public class Principal2 {
	public static void  main (String [] args){
		
		SessionFactory sessionFactory;
		//Para que utilize el archivo de configuracion
		Configuration configuration = new Configuration();
		configuration.configure();
		sessionFactory = configuration.buildSessionFactory();
		//mETODO save guarda datos para la base de datos
		Session session = sessionFactory.openSession();
		
		
		Provincia provincia = new Provincia("QR","Queretaro");
		Camionero camionero = new Camionero("123mdc","Tlaxacal","4564345",10000);
		List<Paquete> paquetes = new ArrayList<Paquete> ();
		
		
		paquetes.add(new Paquete("A001","Laptop Acer",
				"Julio Pacheco ","direccion de julio",camionero,provincia));
		
		paquetes.add(new Paquete("B001","gafas de sol",
				"Carla Mora","direccion de carla",camionero ,provincia));
		
		//Creando un obj auxiliar
		Paquete paquete = new  Paquete();
		paquete.setCamionero(camionero);
		paquete.setProvincia(provincia);
		paquete.setDescricion("Direccion de Julio @.@.");
		paquete.setCodigo("3452");
		paquete.setDestinatario("Sandra");
		
		paquetes.add(paquete);
		//paquete.setId("1");
		
		
		
		//paquete.setId_camionero(camionero);
		//paquete.setProvincia(provincia);
		
		
		
		
		
		//Este fue con lo que compare 
		//String codigo, String descricion, String destinatario, String direccion_destinatario,
		//Camionero id_camionero, Provincia provincia
		
		
		provincia.setPaquetes(paquetes);
		camionero.setPaquetes(paquetes);
		
		
		session.beginTransaction();
		session.save(provincia);
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
		
		
		
		
		
		
	}

}
