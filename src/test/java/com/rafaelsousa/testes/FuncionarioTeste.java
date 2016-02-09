package com.rafaelsousa.testes;

import static org.junit.Assert.fail;

import java.util.Date;

import javax.persistence.EntityManager;

import org.junit.Before;
import org.junit.Test;

import com.rafaelsousa.jpa.util.EntityManagerProducer;
import com.rafaelsousa.models.Funcionario;
import com.rafaelsousa.models.TipoUsuario;
import com.rafaelsousa.models.Usuario;

public class FuncionarioTeste {

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
	public void adiciona() {
		Funcionario funcionario = new Funcionario();
		Usuario usuario = new Usuario();
		
		funcionario.setNome("Tatiane da Costa Araujo Sousa");
		funcionario.setDataNascimento(new Date());
		funcionario.setSexo('F');
		funcionario.setCpf("050.809.471-28");
		funcionario.setEndereço("407N Alameda 04 Lote 20");
		funcionario.setTelefone("(63) 8407-5288");
		funcionario.setMatricula("1283222");
		
		usuario.setFuncionario(funcionario);
		usuario.setLogin(funcionario.getMatricula());
		usuario.setSenha(funcionario.getCpf());
		usuario.setTipoUsuario(TipoUsuario.COORDENADOR.getId());
		usuario.setAtivo(true);
		
		funcionario.setUsuario(usuario);
		
		try {
			em.getTransaction().begin();
			em.merge(funcionario);
			em.getTransaction().commit();
			
			System.out.println("\n\nFuncionário adicionado com sucesso!".toUpperCase());
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			em.close();
		}
		
	}

}
