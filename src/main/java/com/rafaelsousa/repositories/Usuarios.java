package com.rafaelsousa.repositories;

import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.rafaelsousa.jpa.util.Transactional;
import com.rafaelsousa.models.Usuario;

public class Usuarios implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Inject
	private EntityManager em;
	
	/**
	 * @deprecated
	 */
	protected Usuarios() {
		this(null);
	}
	
	public Usuarios(EntityManager em) {
		this.em = em;
	}
	
	@Transactional
	public void adicionaOuAltera(Usuario usuario) {
		em.merge(usuario);
	}
	
	public String criptografaSenha(String senha) throws UnsupportedEncodingException, NoSuchAlgorithmException {
		MessageDigest algorithm = MessageDigest.getInstance("SHA-256");
		byte messageDigest[] = algorithm.digest(senha.getBytes("UTF-8"));
		 
		StringBuilder hexString = new StringBuilder();
		for (byte b : messageDigest) {
		  hexString.append(String.format("%02X", 0xFF & b));
		}
		return hexString.toString();
	}
		
	public boolean existeUsuario(Usuario usuario) {
		Query consulta = em.createQuery("FROM Usuario u WHERE u.login = :login", Usuario.class);
		consulta.setParameter("login", usuario.getLogin());
		//Usuario encontrado = (Usuario) consulta.getSingleResult();
		
		return consulta.getSingleResult() != null;
	}
	
	public Usuario carrega(Usuario usuario) throws UnsupportedEncodingException, NoSuchAlgorithmException {
			return em.createQuery("FROM Usuario u WHERE u.login =:login AND u.senha =:senha", Usuario.class)
					.setParameter("login", usuario.getLogin())
					.setParameter("senha", usuario.getSenha())
					.getSingleResult();
	}
	
	public List<Usuario> todos() {
		return em.createQuery("FROM Usuario", Usuario.class).getResultList();
	}
	
}
