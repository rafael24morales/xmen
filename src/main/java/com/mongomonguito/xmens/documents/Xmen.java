package com.mongomonguito.xmens.documents;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
public class Xmen {
    @Id
    private int id_xmen;
    private String nombre;
    private List<Poder> poderes;
    private String genero;
    private int nivel;
    private Aparicion aparicion;

    public Xmen() {
    }

    public Xmen(int id_xmen, String nombre, List<Poder> poderes, String genero, int nivel) {
        this.id_xmen = id_xmen;
        this.nombre = nombre;
        this.poderes = poderes;
        this.genero = genero;
        this.nivel = nivel;
    }

    public int getId_xmen() {
        return id_xmen;
    }

    public void setId_xmen(int id_xmen) {
        this.id_xmen = id_xmen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Poder> getPoderes() {
        return poderes;
    }

    public void setPoderes(List<Poder> poderes) {
        this.poderes = poderes;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public Aparicion getAparicion() {
        return aparicion;
    }

    public void setAparicion(Aparicion aparicion) {
        this.aparicion = aparicion;
    }
}
