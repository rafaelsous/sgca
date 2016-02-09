package com.rafaelsousa.testes;

import static org.junit.Assert.*;

import javax.persistence.EntityManager;

import org.junit.Before;
import org.junit.Test;

import com.rafaelsousa.jpa.util.EntityManagerProducer;
import com.rafaelsousa.models.Usuario;

public class UsuarioTeste {

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
	public void login() {
		Usuario usuario = new Usuario();
		usuario.setLogin("1283222");
		usuario.setSenha("050.809.471-28");

		try {
			Usuario encontrado = em
					.createQuery("FROM Usuario u WHERE u.login =:login AND u.senha =:senha", Usuario.class)
					.setParameter("login", usuario.getLogin()).setParameter("senha", usuario.getSenha())
					.getSingleResult();

			if (encontrado.isAtivo()) {
				System.out.println("\n\nSeja bem-vindo(a), "
						+ encontrado.getFuncionario().getNome().toUpperCase().split(" ")[0] + "!");
			} else {
				System.out.println("\n\nSeu usuário encontra-se desativado, "
						+ encontrado.getFuncionario().getNome().toUpperCase().split(" ")[0] + "!");
			}
		} catch (Exception e) {
			System.out.println("\n\nLogin e/ou senha inválidos.\n\n");
		} finally {
			em.close();
		}
	}

}
