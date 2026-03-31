package co.edu.asys.entidades;

import co.edu.asys.entidades.Genero;
import co.edu.asys.entidades.TipoDocumento;

public class Persona {
    private String nombre;
    private String apellidos;
    private int edad;
    private String telefono;
    private TipoDocumento tipoDocumento;
    private String numeroDocumento;
    private Genero genero;

    public Persona(String nombre, String apellidos, int edad, String telefono, TipoDocumento tipoDocumento, String numeroDocumento, Genero genero) throws Exception {

        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.telefono = telefono;
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
        this.genero = genero;
        validador();
    }


    public void validador() throws Exception {
        if(this.edad < 0) throw new Exception("La edad  no puede ser negativa");
        if (this.edad > 100) throw  new Exception("Muy viejo");
    }

    public String nombre() {
        return nombre;
    }

    public Persona setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public String apellidos() {
        return apellidos;
    }

    public Persona setApellidos(String apellidos) {
        this.apellidos = apellidos;
        return this;
    }

    public int edad() {
        return edad;
    }

    public Persona setEdad(int edad) {
        this.edad = edad;
        return this;
    }

    public String telefono() {
        return telefono;
    }

    public Persona setTelefono(String telefono) {
        this.telefono = telefono;
        return this;
    }

    public TipoDocumento tipoDocumento() {
        return tipoDocumento;
    }

    public Persona setTipoDocumento(TipoDocumento tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
        return this;
    }

    public String numeroDocumento() {
        return numeroDocumento;
    }

    public Persona setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
        return this;
    }

    public Genero genero() {
        return genero;
    }

    public Persona setGenero(Genero genero) {
        this.genero = genero;
        return this;
    }

    public String formatearNombre(){
        return this.nombre+","+this.apellidos+","+this.tipoDocumento+","+this.numeroDocumento+","+this.edad+","+this.telefono+","+this.genero;
    }
}