package com.sigcart.sigcart.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sigcart.sigcart.dto.GameMinDTO;
import com.sigcart.sigcart.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	
	
	public List<GameMinDTO> findAll(){
		
		var result           =  gameRepository.findAll();
		List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
		return dto;	
		
	}
	

}
