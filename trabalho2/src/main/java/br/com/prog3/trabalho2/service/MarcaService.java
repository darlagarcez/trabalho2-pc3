package br.com.prog3.trabalho2.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.prog3.trabalho2.domain.Marca;
import br.com.prog3.trabalho2.dto.MarcaDTO;
import br.com.prog3.trabalho2.repository.MarcaRepository;

@Service
public class MarcaService {
	@Autowired
	private MarcaRepository marcaRepository; 
	
	public Marca save(Marca marca) {
		return marcaRepository.save(marca);
	}
	
	public List<MarcaDTO> findAll(){
		return marcaRepository.findAll().stream().map(marca -> new MarcaDTO(marca)).collect(Collectors.toList());
	}
	
	public Optional<Marca> findById(Long id) {
		return marcaRepository.findById(id);
	}
	
	public Marca update(Marca marca) {
		return marcaRepository.save(marca);
	}
		
	public void deleteById(Long id) {
		marcaRepository.deleteById(id);
	}
}

