package org.example.services;


import org.example.model.Tarea;
import org.example.repositories.TareaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TareaService {
    TareaRepository tareaRepository;

    @Autowired
    public TareaService(TareaRepository tareaRepository) {
        this.tareaRepository= tareaRepository;
    }

    public Tarea guardar(Tarea s){
        return tareaRepository.save(s);
    }
}
