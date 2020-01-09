package guru.springframework.idjpetclinic.services;

import guru.springframework.idjpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}
