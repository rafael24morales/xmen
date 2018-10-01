package com.mongomonguito.xmens.documents;

public class Poder {

    private String nombre_poder;
    private String descripcion;

    public Poder(String nombre_poder, String descripcion) {
        this.nombre_poder = nombre_poder;
        this.descripcion = descripcion;
    }

    public Poder() {
    }

    public String getNombre_poder() {
        return nombre_poder;
    }

    public void setNombre_poder(String nombre_poder) {
        this.nombre_poder = nombre_poder;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
