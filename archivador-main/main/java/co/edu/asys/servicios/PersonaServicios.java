package org.example.servicios;


import co.edu.asys.entidades.Persona;
import co.edu.asys.persistencia.Almacenamiento;

public class PersonaServicios {
    private Almacenamiento almacenamiento;

    public PersonaServicios(Almacenamiento almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public String guardar(Persona p ){
        return almacenamiento.guardar(p);
    }

    public String eliminar(Persona p){
        return almacenamiento.eliminar(p);
    }

    public String buscar(Persona p){
        return almacenamiento.buscar(p);
    }

    public Almacenamiento almacenamiento() {
        return almacenamiento;
    }
}