package com.rafaelsousa.repositories;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import com.rafaelsousa.models.Estado;

public class Estados implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private EntityManager em;
	
	/**
	 * @deprecated
	 */
	protected Estados() {
		this(null);
	}
	
	@Inject
	public Estados(EntityManager em) {
		this.em = em;
	}
	
	public List<Estado> todos() {
		return em.createQuery("From Estado", Estado.class).getResultList();
	}
	
}
