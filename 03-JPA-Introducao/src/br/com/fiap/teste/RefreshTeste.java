package br.com.fiap.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.entity.Zoologico;

public class RefreshTeste {

	public static void main(String[] args) {
		// Pesquisar um Zoo
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("CLIENTE_ORACLE");
		EntityManager em = fabrica.createEntityManager();
		
		//Exibir o nome
		Zoologico zoo = em.find(Zoologico.class, 2);
		System.out.println(zoo.getNome());
		
		//Trocar o Nome no java e exibir
		zoo.setNome("Zoo do Zé");
		System.out.println(zoo.getNome());
		//Fazer o refresh
		em.refresh(zoo);
		//Exibir o nome
		System.out.println(zoo.getNome());
		em.close();
		fabrica.close();
	}

}
