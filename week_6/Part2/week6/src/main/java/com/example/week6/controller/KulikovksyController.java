package com.example.week6.controller;

import com.example.week6.entity.Kulikovksy;
import com.example.week6.model.KulikovskyModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.week6.service.KulikovskyService;

@RestController
@RequestMapping(path = "/kulikovksy")
public class KulikovksyController {

    @Autowired
    private KulikovskyService kulikovskyService;

    @GetMapping("/getAll")

    public Iterable<Kulikovksy> getAll() {
        Iterable<Kulikovksy> values =  kulikovskyService.getAll();
        return values;
    }


    @PostMapping("/add")
    public String  addNewCake(@RequestBody KulikovskyModel cake){
        kulikovskyService.addNewCake(cake);
        return "new cake was added";
    }


    @PutMapping("/update/{id}")
    public String updateCar(@PathVariable("id") int id, @RequestBody KulikovskyModel cake) throws Exception {
        kulikovskyService.updateById(id, cake);
        return "cake was updated";
    }

    @DeleteMapping("/delete/{id}")
    public String remove(@PathVariable("id") int id){
        kulikovskyService.deleteById(id);
        return "cake was deleted";
    }
}
