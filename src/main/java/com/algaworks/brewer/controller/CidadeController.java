package com.algaworks.brewer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.algaworks.brewer.model.Cerveja;

@Controller
public class CidadeController {

	
	@RequestMapping("/cidade")
	public String cadastroCidade(Cerveja cerveja){
		return "cerveja/CadastroCidade";
	}
}
