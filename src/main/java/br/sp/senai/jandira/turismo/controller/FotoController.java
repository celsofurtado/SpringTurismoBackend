package br.sp.senai.jandira.turismo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.sp.senai.jandira.turismo.model.Foto;
import br.sp.senai.jandira.turismo.repository.FotoRepository;

@RestController
@RequestMapping("/api/fotos")
public class FotoController {
	
	@Autowired
	private FotoRepository fotoRepository;
	
	@GetMapping("/{id}")
	private Foto getFoto(@PathVariable Long id) {
		return fotoRepository.findById(id).get(); 
	}
	
	@GetMapping("/capa/{destinoId}")
	private Foto getFotoDaCapa(@PathVariable Long destinoId) {
		System.out.println("Foto de capa...");
		return fotoRepository.getFotoDaCapa(destinoId);
	}

}
