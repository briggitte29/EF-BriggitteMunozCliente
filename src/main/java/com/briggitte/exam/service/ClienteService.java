package com.briggitte.exam.service;

import java.util.List;

import com.briggitte.exam.models.Cliente;

public interface ClienteService {
	
	public List<Cliente> listarCliente();
	public void guardarCliente(Cliente cliente);
	

}
