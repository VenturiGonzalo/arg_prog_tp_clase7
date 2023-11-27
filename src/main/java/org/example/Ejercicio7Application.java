package org.example;


import org.example.model.Administrador;
import org.example.model.Prestador;
import org.example.model.Servicio;
import org.example.model.Tarea;
import org.example.services.AdministradorService;
import org.example.services.PrestadorService;
import org.example.services.ServicioService;
import org.example.services.TareaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class Ejercicio7Application {


	private static ServicioService servicioService;
	private static AdministradorService administradorService;
	private static PrestadorService prestadorService;
	private static TareaService tareaService;

	@Autowired
	public Ejercicio7Application(
			ServicioService servicioService,
			AdministradorService administradorService,
			PrestadorService prestadorService,
			TareaService tareaService){
		Ejercicio7Application.servicioService = servicioService;
		Ejercicio7Application.administradorService = administradorService;
		Ejercicio7Application.prestadorService = prestadorService;
		Ejercicio7Application.tareaService = tareaService;
	}



	public static void main(String[] args) {
		SpringApplication.run(Ejercicio7Application.class, args);

		Administrador a1 = new Administrador("Juan", "Pelotas", "juanpeot@s.com", "12345678");
		Prestador p1 = new Prestador("Gonzalo","Venturi","gonzaloventuri@gmail.com");
		Tarea t1 = new Tarea("Pintar uñas", 6540.00);
		Servicio s1 = new Servicio("servicio maquillaje","descripcion",a1, p1, List.of(t1));

		a1 = administradorService.guardar(a1);
		p1 = prestadorService.guardar(p1);
		t1 = tareaService.guardar(t1);
		s1 = servicioService.guardar(s1);

		System.out.println(servicioService.findAll().toString());

	}

}
