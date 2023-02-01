package com.prostopizza.controller;

import com.prostopizza.model.Phones;
import com.prostopizza.model.Pizzerias;
import com.prostopizza.service.phonesService.PhonesService;
import com.prostopizza.service.pizzeriasService.PizzeriasService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/contacts")
public class ContactsController {
    final
    PhonesService phonesService;
    final PizzeriasService pizzeriasService;
    public ContactsController(PhonesService phonesService, PizzeriasService pizzeriasService){
        this.phonesService=phonesService;
        this.pizzeriasService = pizzeriasService;
    }

    @RequestMapping("phones")
    public List<Phones> getAllPhones(){
        return phonesService.getAllPhones();
    }
    @RequestMapping("pizzeria")
    public List<Pizzerias> getPizzeria(){
        return pizzeriasService.getAllPizzerias();
    }
}
