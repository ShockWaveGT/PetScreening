package com.example.petscreening.pet.repository;

import com.example.petscreening.pet.entity.Pet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PetRepository extends JpaRepository<Pet, Long> {
}