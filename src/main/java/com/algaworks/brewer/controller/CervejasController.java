package com.algaworks.brewer.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.algaworks.brewer.model.Cerveja;


@Controller
public class CervejasController {

	
	@RequestMapping("/cerveja")
	public String novo(Cerveja cerveja){
		return "cerveja/CadastroCerveja";
	}
	
	@RequestMapping(value="/cerveja", method=RequestMethod.POST)
	public String cadastroCerveja(@Valid Cerveja cerveja, BindingResult result, Model model, RedirectAttributes attributes){
		if (result.hasErrors()){
			return novo(cerveja);
		}
		attributes.addFlashAttribute("mensagem", "Cerveja salva com sucesso!");
		
		return "redirect:/cerveja";
	}
	
	@RequestMapping("/cliente")
	public String cadastroCliente(Cerveja cerveja){
		return "cerveja/CadastroCliente";
	}
	
	@RequestMapping("/usuario")
	public String cadastroUsuario(Cerveja cerveja){
		return "cerveja/CadastroUsuario";
	}
	
	@RequestMapping("/cidade")
	public String cadastroCidade(Cerveja cerveja){
		return "cerveja/CadastroCidade";
	}
	
	@RequestMapping("/estilo")
	public String cadastroEstilo(Cerveja cerveja){
		return "cerveja/CadastroEstilo";
	}
}
