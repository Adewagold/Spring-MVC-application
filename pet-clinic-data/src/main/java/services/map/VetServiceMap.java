package services.map;

import ade.springframework.spgpetclinic.model.Vet;
import services.CrudServices;

import java.util.Set;

/**
 * Created by adewale adeleye on 26/03/2019
 **/
public class VetServiceMap extends AbstractMapService<Vet, Long> implements CrudServices<Vet, Long> {
    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(),object);
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }
}
