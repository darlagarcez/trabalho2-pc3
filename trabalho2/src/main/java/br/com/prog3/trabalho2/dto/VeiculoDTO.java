package br.com.prog3.trabalho2.dto;

import br.com.prog3.trabalho2.domain.Marca;
import br.com.prog3.trabalho2.domain.Veiculo;

public class VeiculoDTO {
	private Long id;
	private String placa;
	private String cor;
	private Integer anoModelo;
	private Marca marca;
	
	public VeiculoDTO(Veiculo veiculo) {
		this.id = veiculo.getId();
		this.placa = veiculo.getPlaca();
		this.cor = veiculo.getCor();
		this.anoModelo = veiculo.getAnoModelo();
		this.marca = veiculo.getMarca();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public Integer getAnoModelo() {
		return anoModelo;
	}

	public void setAnoModelo(Integer anoModelo) {
		this.anoModelo = anoModelo;
	}

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}
}
