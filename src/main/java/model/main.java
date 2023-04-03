package model;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class main {

	public static void main(String[] args) {
		// 1. fabrica el acceso a los datos
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("jpa_sesion02");
		// 2. crea el manejador de entidades
		EntityManager em = fabrica.createEntityManager();
		// 3. empezar mi transacción
		em.getTransaction().begin();
		// 4. proceso
		//List<Usuario> lstUsuarios = em.createQuery("Select a From Usuario a", Usuario.class).getResultList();
		//System.out.println("nro de usuarios: " + lstUsuarios.size());
		TypedQuery<Usuario> consulta = em.createNamedQuery("UsuarioxTipo", Usuario.class);
		consulta.setParameter("tipo", 2);
		List<Usuario> lstUsuarios = consulta.getResultList();
		System.out.println("nro de usuarios: " + lstUsuarios.size());
		for (Usuario u : lstUsuarios){
			System.out.println(">>>hola." + u);
		}
		// 5. confirmar la transacción
		em.getTransaction().commit();
	}

}
