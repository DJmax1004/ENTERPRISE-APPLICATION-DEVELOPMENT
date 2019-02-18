package br.com.fiap.teste;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.entity.TipoZoo;
import br.com.fiap.entity.Zoologico;

public class CadastroTeste {

	public static void main(String[] args) {
		EntityManagerFactory fabrica = 
				Persistence.createEntityManagerFactory("CLIENTE_ORACLE");
		
		EntityManager em = fabrica.createEntityManager();
		
		//Cadastrar um zoo
		Zoologico zoo = new Zoologico("Zoo São Paulo", 10, TipoZoo.PRIVADO, 
				new Date(), new Date(), new Date(), false, null);
		em.persist(zoo);
		em.getTransaction().begin();
		em.getTransaction().commit();
		
		Zoologico zoo2 = new Zoologico("Zoo Central", 100, TipoZoo.PUBLICO, 
				new Date(), new Date(), new Date(), false, null);
		em.persist(zoo2);
		em.getTransaction().begin();
		em.getTransaction().commit();
		
		em.close();
		fabrica.close();
	}

}
