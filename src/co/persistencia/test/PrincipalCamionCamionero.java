package co.persistencia.test;

import java.util.Date;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import co.persistencia.entity.Camion;
import co.persistencia.entity.CamionCamionero;
import co.persistencia.entity.Camionero;

public class PrincipalCamionCamionero {
	
	public static void main( String args[ ] ){	
		SessionFactory sessionFactory;
		//Para que utilize el archivo de configuracion
		Configuration configuration = new Configuration();
		configuration.configure();
		sessionFactory = configuration.buildSessionFactory();
		//METODO save guarda datos para la base de datos
		Session session = sessionFactory.openSession();
		
		CamionCamionero cam = new CamionCamionero( );
		cam.setFecha( new Date( ) );
		
		//Camion camion = new Camion( 1 );
		//camion.setId( 1 );
		//Le estamos diciendo a Hibernate que la relacion la queremos
		//con el camion que tenga ID = 1
		cam.setCamion( new Camion( 1 ) );
		
		cam.setCamionero( new Camionero(8));
		
		session.beginTransaction();
		session.save(cam);
		session.getTransaction().commit();
		
		
		CamionCamionero aux = session.get( CamionCamionero.class, 1 );
		aux.getCamion().getMatricula();
		//Criteria criteria = session.createCriteria( CamionCamionero.class );
		
		System.out.println( aux );
		
		
		session.close();
		sessionFactory.close();
	}//end main
	
	
	
}//end class
