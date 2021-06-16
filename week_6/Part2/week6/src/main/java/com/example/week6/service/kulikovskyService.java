package com.example.week6.service;

import com.example.week6.entity.kulikovksy;
import com.example.week6.model.kulikovskyModel;
import com.example.week6.repository.kulikovskyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class kulikovskyService {

    @Autowired
    private kulikovskyRepository kulikovskyRepository;

    public List<kulikovksy> getAll() {
        return kulikovskyRepository.findAll();
    }

    public Optional<kulikovksy> findById(Integer id) {
        return kulikovskyRepository.findById(id);
    }
    public String deleteById(Integer id) {
        kulikovskyRepository.deleteById(id);
        return id + " was deleted";
    }


    public void addNewCake(kulikovskyModel model){
        kulikovksy cake = new kulikovksy();
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

    public void updateById(int id, kulikovskyModel model) throws Exception {

        Optional<kulikovksy> cake = kulikovskyRepository.findById(id);
        if(cake.isPresent()) {
            kulikovksy updateCake = cake.get();

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
