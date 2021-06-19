package com.example.week6.service;

import com.example.week6.entity.Kulikovksy;
import com.example.week6.model.KulikovskyModel;
import com.example.week6.repository.KulikovskyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class KulikovskyService {

    @Autowired
    private KulikovskyRepository kulikovskyRepository;

    public List<Kulikovksy> getAll() {
        return kulikovskyRepository.findAll();
    }

    public Optional<Kulikovksy> findById(Integer id) {
        return kulikovskyRepository.findById(id);
    }
    public String deleteById(Integer id) {
        kulikovskyRepository.deleteById(id);
        return id + " was deleted";
    }


    public void addNewCake(KulikovskyModel model){
        Kulikovksy cake = new Kulikovksy();
        cake.setId(model.getId());
        cake.setName(model.getName());
        cake.setType(model.getType());
        cake.setShape(model.getShape());
        cake.setPrice(model.getPrice());
        cake.setDateOfManufacture(model.getDateOfManufacture());
        cake.setDateOfExpiration(model.getDateOfExpiration());

        kulikovskyRepository.save(cake);
        //"new cake was added"
    }

    public void updateById(int id, KulikovskyModel model) throws Exception {

        Optional<Kulikovksy> cake = kulikovskyRepository.findById(id);
        if(cake.isPresent()) {
            Kulikovksy updateCake = cake.get();

            updateCake.setId(model.getId());
            updateCake.setName(model.getName());
            updateCake.setType(model.getType());
            updateCake.setShape(model.getShape());
            updateCake.setPrice(model.getPrice());
            updateCake.setDateOfManufacture(model.getDateOfManufacture());
            updateCake.setDateOfExpiration(model.getDateOfExpiration());

            kulikovskyRepository.save(updateCake);
            //"cake was updated";
        }
    }
}
