package org.example.services;



import org.example.model.Prestador;
import org.example.repositories.PrestadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PrestadorService {
    PrestadorRepository prestadorRepository;

    @Autowired
    public PrestadorService(PrestadorRepository prestadorRepository) {
        this.prestadorRepository= prestadorRepository;
    }

    public Prestador guardar(Prestador s){
        return prestadorRepository.save(s);
    }
}
