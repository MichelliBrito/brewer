package com.algaworks.brewer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.algaworks.brewer.model.Cerveja;

@Controller
public class UsuarioController {

	
	@RequestMapping("/usuario")
	public String cadastroUsuario(Cerveja cerveja){
		return "cerveja/CadastroUsuario";
	}
}
