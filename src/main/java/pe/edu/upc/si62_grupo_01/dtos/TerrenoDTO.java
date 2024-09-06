package pe.edu.upc.si62_grupo_01.dtos;

import jakarta.persistence.Column;

public class TerrenoDTO {
    private int idTerreno;
    private  String ubicacionTerreno;
    private float tamanioTerreno;
    private String descripcionTerreno;

    public int getIdTerreno(){return idTerreno;}
    public  void setIdTerreno(int id){this.idTerreno=id;}
    public String getUbicacionTerreno(){return ubicacionTerreno;}
    public void setUbicacionTerreno(String ubicacionTerreno){this.ubicacionTerreno=ubicacionTerreno;}
    public float getTamanioTerreno(){return tamanioTerreno;}
    public void setTamanioTerreno(float tamanioTerreno){this.tamanioTerreno=tamanioTerreno;}
    public String getDescripcionTerreno(){return descripcionTerreno;}
    public  void setDescripcionTerreno(String descripcionTerreno){this.descripcionTerreno=descripcionTerreno;}

}
