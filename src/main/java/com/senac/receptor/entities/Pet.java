package com.senac.receptor.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="pet")
public class Pet {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pet_id", nullable = false)
    private int petId;

    @Column(name = "pet_nome", nullable = false)
    private String petNome;

	public Pet(String petNome) {
		this.petNome=petNome;
	}

	public int getPetId() {
		return petId;
	}

	public void setPetId(int petId) {
		this.petId = petId;
	}

	public String getPetNome() {
		return petNome;
	}

	public void setPetNome(String petNome) {
		this.petNome = petNome;
	}

	
    
    
}
