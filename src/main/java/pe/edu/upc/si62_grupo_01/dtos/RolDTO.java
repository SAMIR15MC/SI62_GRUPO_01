package pe.edu.upc.si62_grupo_01.dtos;

import jakarta.persistence.Column;


public class RolDTO {
    private int idRol;
    private String nombreRol;
    private  String descripcionRol;

    public int getIdRol() {return idRol;}
    public void setIdRol(int idRol) {this.idRol = idRol;}
    public String getNombreRol() {return nombreRol;}
    public void setNombreRol(String nombreRol) {this.nombreRol = nombreRol;}
    public String getDescripcionRol() {return descripcionRol;}
    public void setDescripcionRol(String descripcionRol) {this.descripcionRol = descripcionRol;}

}
