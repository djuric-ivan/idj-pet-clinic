package guru.springframework.idjpetclinic.services;

import guru.springframework.idjpetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();

}
