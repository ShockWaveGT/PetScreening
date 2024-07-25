package com.example.petscreening.pet.resolver;

import com.example.petscreening.pet.entity.Breed;
import com.example.petscreening.pet.entity.Pet;
import com.example.petscreening.pet.repository.BreedRepository;
import com.example.petscreening.pet.repository.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class PetQueryResolver {

    @Autowired
    private PetRepository petRepository;
    
    @QueryMapping
    public List<Pet> weightLessThan(@Argument float weight) {
        return petRepository.findAllByWeightLessThan(weight);
    }
    
    @QueryMapping
    public List<Pet> isVaccinated() {
        return petRepository.findByVaccinationStatus(true);
    }

    @QueryMapping
    public List<Pet> isNotAPoodle() {
        return petRepository.findByBreedNameNot("poodle");
    }
    
    @QueryMapping
    public List<Pet> trainingLevelGreaterThan(@Argument float trainingLevel) {
        return petRepository.findAllByTrainingLevelGreaterThan(trainingLevel);
    }
}