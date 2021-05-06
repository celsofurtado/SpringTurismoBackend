package br.sp.senai.jandira.turismo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.sp.senai.jandira.turismo.model.Destino;
import br.sp.senai.jandira.turismo.model.dto.DestinoDto;

public interface DestinoRepository extends JpaRepository<Destino, Long> {
	
//	@Query(value = "SELECT d.nome, d.valor, f.url, f.foto_capa " + 
//			"FROM destino AS d INNER JOIN foto as f " + 
//			"on (f.destino_id = d.id) " + 
//			"WHERE f.foto_capa = false;", nativeQuery = true)
//	List<Destino> listarDestinos();

}
