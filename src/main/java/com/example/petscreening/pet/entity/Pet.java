package com.example.petscreening.pet.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "\"pet\"", schema = "public")
public class Pet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "\"id\"", nullable = false)
    private Long id;

    @Column(name = "\"name\"", nullable = false, length = 50)
    private String name;

    @Column(name = "\"weight\"", nullable = false)
    private BigDecimal weight;

    @Column(name = "\"vaccination_status\"", nullable = false)
    private Boolean vaccinationStatus = false;

    @Column(name = "\"training_level\"", nullable = false)
    private Integer trainingLevel;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "\"breed_id\"")
    private Breed breedID;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public Boolean getVaccinationStatus() {
        return vaccinationStatus;
    }

    public void setVaccinationStatus(Boolean vaccinationStatus) {
        this.vaccinationStatus = vaccinationStatus;
    }

    public Integer getTrainingLevel() {
        return trainingLevel;
    }

    public void setTrainingLevel(Integer trainingLevel) {
        this.trainingLevel = trainingLevel;
    }

    public Breed getBreedID() {
        return breedID;
    }

    public void setBreedID(Breed breedID) {
        this.breedID = breedID;
    }

}