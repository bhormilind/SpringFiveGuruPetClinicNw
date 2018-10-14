package com.milind.springPetClinic.services;

import com.milind.springPetClinic.model.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();

    Owner findByLastName(String lastName);

}
