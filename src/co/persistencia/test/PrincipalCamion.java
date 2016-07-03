package co.persistencia.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import co.persistencia.entity.Camion;

public class PrincipalCamion {
	public static void main( String args[] ){
		SessionFactory sessionFactory;
		//Para que utilize el archivo de configuracion
		Configuration configuration = new Configuration();
		configuration.configure();
		sessionFactory = configuration.buildSessionFactory();
		//METODO save guarda datos para la base de datos
		Session session = sessionFactory.openSession();
		
		Camion camion = new Camion( );
		camion.setMatricula( "ABC" );
		camion.setPotencia( 2.2 );
		camion.setTipo( "Viejito" );
		camion.setModelo( 2.2 );
		
		//Abrir transaccion
		session.beginTransaction( );
		//Agregar el objeto a la transaccion, a la espera de guardados
		session.save( camion );
		//Decirle a Hibernate que realice las tareas pendientes en la transaccion
		session.getTransaction().commit();
		
		session.close();
		sessionFactory.close();
	}//end main
}//end class
