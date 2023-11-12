package br.com.prog3.trabalho2.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.prog3.trabalho2.domain.Veiculo;
import br.com.prog3.trabalho2.dto.VeiculoDTO;
import br.com.prog3.trabalho2.repository.VeiculoRepository;

@Service
public class VeiculoService {
	@Autowired
	private VeiculoRepository veiculoRepository; 
	
	public Veiculo save(Veiculo veiculo) {
		return veiculoRepository.save(veiculo);
	}
	
	public List<VeiculoDTO> findAll(){
		return veiculoRepository.findAll().stream().map(veiculo -> new VeiculoDTO(veiculo)).collect(Collectors.toList());
	}
	
	public Optional<Veiculo> findById(Long id) {
		return veiculoRepository.findById(id);
	}
	
	public Veiculo update(Veiculo veiculo) {
		return veiculoRepository.save(veiculo);
	}
	
	public void deleteById(Long id) {
		veiculoRepository.deleteById(id);
	}
}
