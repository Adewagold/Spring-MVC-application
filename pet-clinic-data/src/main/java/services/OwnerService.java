package services;

import ade.springframework.spgpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService {
    Owner findById(Long id);
    Owner findByFirstName(String firstName);
    Owner save(Owner owner);
    Set<Owner> findAll();
}
