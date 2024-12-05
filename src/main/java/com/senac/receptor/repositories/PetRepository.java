package com.senac.receptor.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senac.receptor.entities.Pet;

public interface PetRepository extends JpaRepository<Pet, Integer>{

}
