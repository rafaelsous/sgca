package com.rafaelsousa.controllers;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.List;

import javax.inject.Inject;

import com.rafaelsousa.models.Usuario;
import com.rafaelsousa.repositories.Usuarios;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.validator.SimpleMessage;
import br.com.caelum.vraptor.validator.Validator;

@Controller
public class UsuarioController {

	private final Usuarios usuarios;
	private final Result result;
	private final Validator validator;

	/**
	 * @deprecated
	 */
	protected UsuarioController() {
		this(null, null, null);
	}

	@Inject
	public UsuarioController(Usuarios usuarios, Result result, Validator validator) {
		this.usuarios = usuarios;
		this.result = result;
		this.validator = validator;
	}

	@Get("/usuario")
	public void cadastro() {

	}

	@Post("/usuario")
	public void adiciona(Usuario usuario) {
		if (usuarios.existeUsuario(usuario)) {
			validator.add(new SimpleMessage("login", "Este login já existe."));
			validator.onErrorForwardTo(this).cadastro();
		} else {
			try {
				String senhaCriptografada = usuarios.criptografaSenha(usuario.getSenha());
				usuario.setSenha(senhaCriptografada);

				usuarios.adicionaOuAltera(usuario);
				result.redirectTo(this).lista();
			} catch (UnsupportedEncodingException | NoSuchAlgorithmException e) {
				e.printStackTrace();
			}
		}
	}

	@Get("/login")
	public void loginForm() {

	}

	@Post("/login")
	public void login(Usuario usuario) throws UnsupportedEncodingException, NoSuchAlgorithmException {
		Usuario carregado = usuarios.carrega(usuario);

		if (carregado == null) {
			validator.add(new SimpleMessage("usuario.login", "Login e/ou senha inválidos"));
		}
		validator.onErrorForwardTo(this).loginForm();

		// usuarioWeb.login(carregado);

		result.include("usuario", carregado.getFuncionario().getNome().toUpperCase().split(" ")[0] + "!")
		.redirectTo(IndexController.class).index();
	}

	@Get("/usuarios")
	public List<Usuario> lista() {
		return usuarios.todos();
	}

}
