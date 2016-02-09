package com.rafaelsousa.controllers;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Result;

@Controller
public class IndexController {
	
	private Result result;
	
	/**
	 * @deprecated
	 */
	protected IndexController() {
		this(null);
	}
	
	@Inject
	public IndexController(Result result) {
		this.result = result;
	}
	
	@Get("/")
	public void index() {
		result.include("mensagem", "VRaptor 4 está rodando!");
	}
	
	@Get("/preview")
	public void imagem() {
		result.include("mensagem", "Pré-visualização de Imagens com HTML5");
	}
	
}
