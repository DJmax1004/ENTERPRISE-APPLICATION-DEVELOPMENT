package br.com.fiap.teste;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.entity.TipoZoo;
import br.com.fiap.entity.Zoologico;


public class AtualizaTeste {
	public static void main(String[] args) {
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("CLIENTE_ORACLE");
		EntityManager em = fabrica.createEntityManager();
		
		//Criar um objeto zoologico com um id existente no banco
		Zoologico zoo = new Zoologico(2, "Zoo Bauru2", 100, TipoZoo.PUBLICO,
				new Date(), new Date(), new Date(), false, false, null);
		
		//Atualiza 
		em.merge(zoo);
	}
}
