package com.example.week6.controller;

import com.example.week6.entity.kulikovksy;
import com.example.week6.model.kulikovskyModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.week6.service.kulikovskyService;

@RestController
@RequestMapping(path = "/kulikovksy")
public class kulikovksyController {

    @Autowired
    private kulikovskyService kulikovskyService;

    @GetMapping("/getAll")

    public Iterable<kulikovksy> getAll() {
        Iterable<kulikovksy> values =  kulikovskyService.getAll();
        return values;
    }


    @PostMapping("/add")
    public String  addNewCake(@RequestBody kulikovskyModel cake){
        kulikovskyService.addNewCake(cake);
        return "new cake was added";
    }


    @PutMapping("/update/{id}")
    public String updateCar(@PathVariable("id") int id, @RequestBody kulikovskyModel cake) throws Exception {
        kulikovskyService.updateById(id, cake);
        return "cake was updated";
    }

    @DeleteMapping("/delete/{id}")
    public String remove(@PathVariable("id") int id){
        kulikovskyService.deleteById(id);
        return "cake was deleted";
    }
}
