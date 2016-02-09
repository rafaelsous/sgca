package com.rafaelsousa.testes;

import static org.junit.Assert.fail;

import java.util.List;

import javax.persistence.EntityManager;

import org.junit.Before;
import org.junit.Test;

import com.rafaelsousa.jpa.util.EntityManagerProducer;
import com.rafaelsousa.models.Estado;

public class EstadosTeste {

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
	public void todos() {
		
		List<Estado> lista = em.createQuery("FROM Estado", Estado.class).getResultList(); 
		
		for (Estado estado : lista) {
			System.out.println(estado.toString());
		}
		System.out.println("====================================");
		System.out.println("Total de registros encontrados: " + lista.size());
	}

}
