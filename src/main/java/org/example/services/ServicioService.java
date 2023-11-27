package org.example.services;


import lombok.NoArgsConstructor;
import org.example.model.Servicio;
import org.example.repositories.ServicioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@NoArgsConstructor
public class ServicioService {
    ServicioRepository servicioRepository;

    @Autowired
    public ServicioService(ServicioRepository servicioRepository) {
        this.servicioRepository = servicioRepository;
    }

    public Servicio guardar(Servicio s){
        return servicioRepository.save(s);
    }

    public List<Servicio> findAll() {
        return servicioRepository.findAll();
    }
}
