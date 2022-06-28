package com.generation.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class objetivos {
	@GetMapping
	public String metas() {
		return "Objetivos Thabata: " + "/n" + "Fazer novos cursos de SQL e Spring, pois não estou entendendo nada!";
	

}}
