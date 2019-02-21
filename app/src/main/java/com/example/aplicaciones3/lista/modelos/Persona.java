package com.example.aplicaciones3.lista.modelos;

public class Persona {

    private String Nombre;
    private String Sexo;
    private Integer Edad;
    private Integer Id;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String sexo) {
        Sexo = sexo;
    }

    public Integer getEdad() {
        return Edad;
    }

    public void setEdad(Integer edad) {
        Edad = edad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }
}
