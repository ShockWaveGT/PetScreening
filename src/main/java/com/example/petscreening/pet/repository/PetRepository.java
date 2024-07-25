package com.example.petscreening.pet.repository;

import com.example.petscreening.pet.entity.Breed;
import com.example.petscreening.pet.entity.Pet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PetRepository extends JpaRepository<Pet, Long> {
    
    public List<Pet> findAllByWeightLessThan(double weight);

    public List<Pet> findByVaccinationStatus(@Param ("isVaccinated") boolean vaccinationStatus);
    
    @Query("SELECT p FROM Pet p WHERE p.breedID.name <> :breedName")
    public List<Pet> findByBreedNameNot(@Param("breedName") String breedName);

    public List<Pet> findAllByTrainingLevelGreaterThan(double trainingLevel);

}