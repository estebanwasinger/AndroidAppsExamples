package com.example.esteban.myapplication;

/**
 * Created by esteban on 06/09/14.
 */
public class Persona {
    private Integer edad;
    private String nombre;
    private String apellido;
    private String nacionalidad;

    public Persona(Integer edad, String nombre, String apellido, String nacionalidad) {
        this.edad = edad;
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacionalidad = nacionalidad;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
}
