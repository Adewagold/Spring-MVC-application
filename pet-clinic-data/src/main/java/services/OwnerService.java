package services;

import ade.springframework.spgpetclinic.model.Owner;

public interface OwnerService extends CrudServices<Owner,Long>{
    Owner findByFirstName(String firstName);
}
