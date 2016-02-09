package com.rafaelsousa.testes;

import static org.junit.Assert.fail;

import java.util.List;

import javax.persistence.EntityManager;

import org.junit.Before;
import org.junit.Test;

import com.rafaelsousa.jpa.util.EntityManagerProducer;
import com.rafaelsousa.models.Cidade;

public class CidadesTeste {
	
	private EntityManager em;

	@Before
	public void setUp() throws Exception {
		em = new EntityManagerProducer().createEntityManager();
	}

	@Test
	public void test() {
		fail("Ainda não implementado");
	}
	
	@Test
	public void porEstado() {
		List<Cidade> listaPorEstado = em.createQuery("FROM Cidade c WHERE c.estado.id =:estado_ID", Cidade.class)
				.setParameter("estado_ID", 2L)
				.getResultList();
		
		for (Cidade cidade : listaPorEstado) {
			System.out.println("ID: " + cidade.getId() + "\nNome: " + cidade.getNome() + "\n\n");
		}
		System.out.println("=======================================");
		System.out.println("Total de cidades da UF pesquisada: " + listaPorEstado.size());
	}
	
	@Test
	public void todos() {
		
		List<Cidade> lista = em.createQuery("FROM Cidade", Cidade.class).getResultList(); 
		
		for (Cidade cidade : lista) {
			System.out.println(cidade.toString());
		}
		System.out.println("====================================");
		System.out.println("Total de registros encontrados: " + lista.size());
	}

}
