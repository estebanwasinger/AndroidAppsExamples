package com.example.esteban.myapplication;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase para un Home de Personas
 * ------------------------------
 * <p/>
 * Acá se van a guardar temporalmente todas las personas que se creen en vez de usar una DB
 * <p/>
 * Created by esteban on 06/09/14.
 */
public class HomePersonas {
    List<Persona> personaList = new ArrayList<Persona>();

    private static HomePersonas INSTANCE = null;

    // Private constructor suppresses
    private HomePersonas() {
    }

    // creador sincronizado para protegerse de posibles problemas  multi-hilo
    // otra prueba para evitar instanciación múltiple
    private synchronized static void createInstance() {
        if (INSTANCE == null) {
            INSTANCE = new HomePersonas();
        }
    }

    public static HomePersonas getInstance() {
        if (INSTANCE == null) createInstance();
        return INSTANCE;
    }

    public void addPersona(Persona persona) {
        personaList.add(persona);
    }

    public Integer size() {
        return personaList.size();
    }
}
