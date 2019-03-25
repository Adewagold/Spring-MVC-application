package services;

import ade.springframework.spgpetclinic.model.Vet;

import java.util.Set;

public interface VetServices {
    Vet findById(Long id);
    Vet save(Vet Vet);
    Set<Vet> findAll();
}
