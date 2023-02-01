package com.prostopizza.service.pizzeriasService;

import com.prostopizza.model.Pizzerias;
import com.prostopizza.repository.PizzeriasRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("pizzeriasService")
public class PizzeriasService {
    final PizzeriasRepository pizzeriasRepository;
    public PizzeriasService(PizzeriasRepository pizzeriasRepository){
        this.pizzeriasRepository=pizzeriasRepository;
    }
    public List<Pizzerias>getAllPizzerias(){
        return pizzeriasRepository.findAll();
    }
}
