package br.sp.senai.jandira.turismo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.sp.senai.jandira.turismo.model.Estado;
import br.sp.senai.jandira.turismo.repository.EstadoRepository;

@RestController
@RequestMapping("/api/estados")
public class EstadoController {
	
	@Autowired
	private EstadoRepository estadoRepository;

	@GetMapping
	private List<Estado> getAll(){
		return estadoRepository.findAll();
	}
	
	@GetMapping("/{id}")
	private Estado getEstadoById(@PathVariable Long id) {
		return estadoRepository.findById(id).get();
	}
	
}










