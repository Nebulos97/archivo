package co.edu.asys.persistencia;

import co.edu.asys.entidades.Persona;

public interface Almacenamiento {

    public String guardar(Persona p);

    public String eliminar(Persona p);

    public String buscar(Persona p);

}
