package com.prostopizza.service.phonesService;

import com.prostopizza.model.Phones;
import com.prostopizza.repository.PhonesRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("phonesService")
public class PhonesService {
    final
    PhonesRepository phonesRepository;
    public PhonesService(PhonesRepository phonesRepository){
        this.phonesRepository=phonesRepository;
    }

    public List<Phones> getAllPhones(){
        return phonesRepository.findAll();
    }
}
