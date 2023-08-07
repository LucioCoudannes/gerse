package Entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Sucursal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;

    protected Integer Numero;
    protected String CentroCosto;
    protected String Nombre;
    protected String Direccion;
    protected String Ciudad;
    protected String Provincia;
    protected Integer Telefono;

    //Constructores

    public Sucursal(){}

    public Sucursal(Long id, Integer numero, String centroCosto, String nombre, String direccion, String ciudad,
            String provincia, Integer telefono) {
        this.id = id;
        Numero = numero;
        CentroCosto = centroCosto;
        Nombre = nombre;
        Direccion = direccion;
        Ciudad = ciudad;
        Provincia = provincia;
        Telefono = telefono;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getNumero() {
        return Numero;
    }

    public void setNumero(Integer numero) {
        Numero = numero;
    }

    public String getCentroCosto() {
        return CentroCosto;
    }

    public void setCentroCosto(String centroCosto) {
        CentroCosto = centroCosto;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String ciudad) {
        Ciudad = ciudad;
    }

    public String getProvincia() {
        return Provincia;
    }

    public void setProvincia(String provincia) {
        Provincia = provincia;
    }

    public Integer getTelefono() {
        return Telefono;
    }

    public void setTelefono(Integer telefono) {
        Telefono = telefono;
    }

    

    

    
}
