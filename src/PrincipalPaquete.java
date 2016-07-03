import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import co.persistencia.entity.CamionCamionero;
import co.persistencia.entity.Paquete;
import co.persistencia.entity.Provincia;

public class PrincipalPaquete {
	
	public static void main (String args []){
		
		SessionFactory sessionFactory;
		//Para utilizar el archivo de configuracion
		Configuration configuration = new Configuration();
		configuration.configure();
		sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		Paquete paq = new Paquete();
		paq.setCodigo("1234");
		paq.setDescripcion("Tiene ropa deportiva");
		paq.setDestinatario("Meztli");
		paq.setDireccionDestinatario("Privada Bambu N 2");
		//LLaves -foraneas  @.@.
		
		//CamionCamionero cami = new CamionCamionero( 1 );
		//CamionCamionero.setId( 1 );
		
		paq.setCamionCamionero(new CamionCamionero(1));
		paq.setProvincia(new Provincia(6));
		
		// sessiones
		session.beginTransaction();
		session.save(paq);
		session.getTransaction().commit();
		
		
		session.close();
		sessionFactory.close();
		
		
		
	
		
		
	
		
		
		
	}
	
	

}
