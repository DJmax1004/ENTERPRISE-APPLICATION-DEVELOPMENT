package br.com.fiap.dao.impl;

import javax.persistence.EntityManager;

import br.com.fiap.dao.ImovelDAO;
import br.com.fiap.entity.Imovel;
import br.com.fiap.excecao.CommitException;

public class ImovelDAOimpl implements ImovelDAO {
	
	private EntityManager em;

	public ImovelDAOimpl(EntityManager em) {
		super();
		this.em = em;
	}

	public void cadastrar(Imovel imovel) {
		em.persist(imovel);
		em.getTransaction().begin();
	}

	public Imovel consultar(int codigo) {
		return em.find(Imovel.class, codigo);
	}

	public void atualizar(Imovel imovel) {
		em.merge(imovel);
		em.getTransaction().begin();
		
		
	}

	public void remover(int codigo) {
		Imovel imovel = consultar(codigo);
		em.remove(imovel);
		em.getTransaction().begin();
		
	}
	public void commit() {
		try {
		em.getTransaction().begin();
		em.getTransaction().commit();
	}catch(Exception e){
		e.printStackTrace();
		em.getTransaction().rollback();
		throw new CommitException()
		}
	}

}
