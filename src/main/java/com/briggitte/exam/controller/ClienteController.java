package com.briggitte.exam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.briggitte.exam.models.Cliente;
import com.briggitte.exam.service.ClienteService;


@Controller
@RequestMapping("/api/v1/cliente")
public class ClienteController {

	
	@Autowired
	private ClienteService service;
	
	
	@GetMapping("/listar")
	public @ResponseBody List<Cliente> listarCliente(){
		return service.listarCliente();
	}
	
	@PostMapping("/guardar")
	public @ResponseBody void guardarAlumno(@RequestBody Cliente cliente) {
		service.guardarCliente(cliente);
	}
}
