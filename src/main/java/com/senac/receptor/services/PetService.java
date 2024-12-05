package com.senac.receptor.services;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senac.receptor.entities.Pet;
import com.senac.receptor.repositories.PetRepository;
import lombok.RequiredArgsConstructor;

@Service

public class PetService {
	
	@Autowired
	private PetRepository petRepository;
	
	 @RabbitListener(queues = "fila-ecommerce")
	    private void subscribe(Pet pet){
	        Pet novoPet = new Pet(pet.getPetNome());
	        petRepository.save(novoPet);
	        System.out.println("Pet "  + novoPet.getPetNome() + " adicionado");
	    }
}
