package br.sp.senai.jandira.turismo.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.sp.senai.jandira.turismo.model.Destino;
import br.sp.senai.jandira.turismo.model.Foto;
import br.sp.senai.jandira.turismo.model.dto.DestinoDto;
import br.sp.senai.jandira.turismo.repository.DestinoRepository;
import br.sp.senai.jandira.turismo.repository.FotoRepository;

@RestController
@RequestMapping("/api/destinos")
public class DestinoController  {

	@Autowired
	private DestinoRepository destinoRepository;
	
	@GetMapping
	private List<DestinoDto> getAll() {
		List<Destino> destinos = destinoRepository.findAll();
		
		List<DestinoDto> destinosDto = new ArrayList<DestinoDto>();
		
		for (Destino d : destinos) {
			List<Foto> fotoCapa = getFotoCapa(d);
			DestinoDto destinoDto = new DestinoDto(
					d.getId(), 
					d.getNome(),
					d.getValor(),
					d.getCidade().getNome(), 
					d.getCidade().getEstado().getNome(), 
					d.getDescricao(), 
					fotoCapa.size() > 0 ? fotoCapa.get(0).getUrl() : "");
			
			destinosDto.add(destinoDto);
		}
		
		return destinosDto;
		
	}
	
	@GetMapping("/{id}")
	private DestinoDto getDestinoById(@PathVariable Long id) {
		
		Destino destino = destinoRepository.findById(id).get();
		
		System.out.println(destino.getFotos());
		
		List<Foto> fotoCapa = getFotoCapa(destino);
		
		DestinoDto destinoDto = new DestinoDto(
				destino.getId(),
				destino.getNome(),
				destino.getValor(),
				destino.getCidade().getNome(),
				destino.getCidade().getEstado().getSigla(),
				destino.getDescricao(), 
				fotoCapa.size() > 0 ? fotoCapa.get(0).getUrl() : "");
		
		return destinoDto;
	}

	private List<Foto> getFotoCapa(Destino fotos) {
		List<Foto> fotoCapa = fotos.getFotos()
				.stream()
				.filter(foto -> foto.isFotoCapa())
				.collect(Collectors.toList());
		return fotoCapa;
	}
	
}
