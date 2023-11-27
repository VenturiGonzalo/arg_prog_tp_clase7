package org.example.services;


import org.example.model.Administrador;
import org.example.repositories.AdministradorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdministradorService {
    AdministradorRepository administradorRepository;

    @Autowired
    public AdministradorService(AdministradorRepository administradorRepository) {
        this.administradorRepository= administradorRepository;
    }

    public Administrador guardar(Administrador s){
        return administradorRepository.save(s);
    }
}
