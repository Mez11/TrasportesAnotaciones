package co.persistencia.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import co.persistencia.entity.Camion;
import co.persistencia.entity.CamionCamionero;
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
		//METODO save guarda datos para la base de datos
		Session session = sessionFactory.openSession();
		
		
		Provincia provincia = new Provincia("QR1","Queretaro1");
		
		Camionero camionero = new Camionero("uno","Tlaxcala", "23 33 44 56 ", 10000, 500,"nada");
		Camion camion = new Camion("Abc", 1, "muerte", 0.3 );
		CamionCamionero camCam = new CamionCamionero( );
		camCam.setCamion( camion );
		camCam.setCamionero( camionero );
		camCam.setFecha( new Date( ) );
		
		List<Paquete> paquetes = new ArrayList<Paquete> ();
		
		
		paquetes.add( new Paquete("A001","Laptop Acer",
				"Julio Pacheco ","direccion de julio", camCam ,provincia ) );
	
		paquetes.add(new Paquete("B001","gafas de sol",
				"Carla Mora","direccion de carla", camCam, provincia));
		
		//Creando un obj auxiliar
	/*	Paquete paquete = new  Paquete();
		paquete.setCamionero(camionero);
		paquete.setProvincia(provincia);
		paquete.setDescricion("Direccion de Julio @.@.");
		paquete.setCodigo("3452");
		paquete.setDestinatario("Sandra");*/
		
		/*Paquete paquete2 = new  Paquete();
		paquete.setCamionero(camionero);
		paquete.setProvincia(provincia);
		paquete.setDescricion("Direccion de Julio @.@.");
		paquete.setCodigo("3452");
		paquete.setDestinatario("Sandra");*/
		
		//paquetes.add(paquete);
		//paquetes.add(paquete2);
		//paquete.setId("1");
		
		
		
		//paquete.setId_camionero(camionero);
		//paquete.setProvincia(provincia);
		
		
		
		
		
		//Este fue con lo que compare 
		//String codigo, String descricion, String destinatario, String direccion_destinatario,
		//Camionero id_camionero, Provincia provincia
		
		
		provincia.setPaquetes(paquetes);
		//camionero.setPaquetes(paquetes);
		
		
		session.beginTransaction();
		session.save(provincia);
		session.getTransaction( ).commit( );
		session.beginTransaction( );
		session.save( camionero );
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
		
		
		
		
		
		
	}

}
