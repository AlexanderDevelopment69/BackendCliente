package com.backend.backendservices.Model;
import javax.persistence.*;


@Entity
@Table(name = "users")
public class Usuario {

        private int id;
        private String dni;
        private String nombres;


    public Usuario(int id, String dni, String nombres) {
        this.id = id;
        this.dni = dni;
        this.nombres = nombres;
    }

    public Usuario() {

    }


    @Id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

}
