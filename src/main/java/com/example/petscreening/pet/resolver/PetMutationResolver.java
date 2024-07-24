package com.example.petscreening.pet.resolver;

import com.example.petscreening.pet.entity.Breed;
import com.example.petscreening.pet.entity.Pet;
import com.example.petscreening.pet.repository.BreedRepository;
import com.example.petscreening.pet.repository.PetRepository;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class PetMutationResolver {
    
    private PetRepository petRepository;
    private BreedRepository breedRepository;

    @MutationMapping
    public Pet addPet(@Argument String name,@Argument BigDecimal weight,@Argument Long breedId,@Argument boolean vaccinated,@Argument int trainingLevel) {
        Breed breed = breedRepository.getReferenceById(breedId);
        Pet pet = new Pet();
        pet.setName(name);
        pet.setWeight(weight);
        pet.setBreedID(breed);
        pet.setTrainingLevel(trainingLevel);
        pet.setVaccinationStatus(vaccinated);
        return petRepository.save(pet);
    }
}