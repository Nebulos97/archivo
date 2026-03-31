package co.edu.asys.entidades;

public class Empresa {

    private String nit;
    private String nombre;
    private String direccion;
    private co.edu.asys.entidades.TipoEmpresa tipo;

    public Empresa(String nit, String nombre, String direccion, co.edu.asys.entidades.TipoEmpresa tipo) {
        this.nit = nit;
        this.nombre = nombre;
        this.direccion = direccion;
        this.tipo = tipo;
    }

    public String getNit() {
        return nit;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public co.edu.asys.entidades.TipoEmpresa getTipo() {
        return tipo;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTipo(co.edu.asys.entidades.TipoEmpresa tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "nit='" + nit + '\'' +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", tipo=" + tipo +
                '}';
    }
}