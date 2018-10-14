package com.milind.springPetClinic.services;

import com.milind.springPetClinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);

    Vet save(Vet owner);

    Set<Vet> findAll();
}
