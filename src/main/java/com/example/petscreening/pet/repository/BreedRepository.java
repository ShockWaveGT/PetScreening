package com.example.petscreening.pet.repository;

import com.example.petscreening.pet.entity.Breed;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BreedRepository extends JpaRepository<Breed, Long> {
}