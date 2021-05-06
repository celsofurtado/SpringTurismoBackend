package br.sp.senai.jandira.turismo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.sp.senai.jandira.turismo.model.Foto;

public interface FotoRepository extends JpaRepository<Foto, Long> {
	
	@Query("from Foto where destino_id = :id")
	Foto getFotoDaCapa(@Param("id") Long destinoId);

}
