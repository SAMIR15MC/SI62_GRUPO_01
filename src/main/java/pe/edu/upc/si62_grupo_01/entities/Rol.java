package pe.edu.upc.si62_grupo_01.entities;

import jakarta.persistence.*;
@Entity
@Table(name="Rol")

public class Rol {
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private int idRol;
    @Column(name="nombreRol",nullable = false,length = 100)
    private String nombreRol;
    @Column(name="descripcionRol",nullable = false,length = 200)
    private String descripcionRol;

    public Rol() {

    }
    public Rol(int idRol,String nombreRol, String descripcionRol) {
        this.idRol = idRol;
        this.nombreRol = nombreRol;
        this.descripcionRol = descripcionRol;

    }

    public int getIdRol() {
        return idRol;
    }

    public void setIdRol(int idRol) {
        this.idRol = idRol;
    }

    public String getNombreRol() {
        return nombreRol;
    }

    public void setNombreRol(String nombreRol) {
        this.nombreRol = nombreRol;
    }

    public String getDescripcionRol() {
        return descripcionRol;
    }

    public void setDescripcionRol(String descripcionRol) {
        this.descripcionRol = descripcionRol;
    }
}
