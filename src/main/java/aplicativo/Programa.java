package aplicativo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {
		
		//INSERT
//		Pessoa p1 = new Pessoa(null, "Vinicius Sales", "vinicius@hotmail.com");
//		Pessoa p2 = new Pessoa(null, "Billie Eilish", "billie@hotmail.com");
//		Pessoa p3 = new Pessoa(null, "Alicia Keys", "alicia@hotmail.com");
//		
//		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
//		EntityManager em = emf.createEntityManager();
//		
//		em.getTransaction().begin();
//		
//		em.persist(p1);
//		em.persist(p2);
//		em.persist(p3);
//		
//		em.getTransaction().commit();
//		
//		em.close();
//		emf.close();
//		
//		System.out.println("Done");
		
		//READ
//		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
//		EntityManager em = emf.createEntityManager();
//		
//		Pessoa p = em.find(Pessoa.class, 2);
//		
//		System.out.println(p);
//		
//		em.close();
//		emf.close();
//		
//		System.out.println("Done");
		
		//DELETE
//		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
//		EntityManager em = emf.createEntityManager();
//		
//		Pessoa p = em.find(Pessoa.class, 2);
//		
//		em.getTransaction().begin();
//		
//		em.remove(p);
//		
//		em.getTransaction().commit();
//		
//		em.close();
//		emf.close();
//		
//		System.out.println("Done");
	}

}
