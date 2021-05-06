package br.sp.senai.jandira.turismo.model.dto;

public class DestinoDto {

	private Long id;
	private String nome;
	private Double valor;
	private String nomeCidade;
	private String siglaEstado;
	private String descricao;
	private String urlFotoCapa;

	public DestinoDto(
			Long id, 
			String nome, 
			Double valor, 
			String nomeCidade, 
			String siglaEstado, 
			String descricao,
			String urlFotoCapa) {
		super();
		this.id = id;
		this.nome = nome;
		this.valor = valor;
		this.nomeCidade = nomeCidade;
		this.siglaEstado = siglaEstado;
		this.descricao = descricao;
		this.urlFotoCapa = urlFotoCapa;
	}

	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public Double getValor() {
		return valor;
	}

	public String getNomeCidade() {
		return nomeCidade;
	}

	public String getSiglaEstado() {
		return siglaEstado;
	}

	public String getDescricao() {
		return descricao;
	}

	public String getUrlFotoCapa() {
		return urlFotoCapa;
	}
	
	

}
