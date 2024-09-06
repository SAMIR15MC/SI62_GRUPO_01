package pe.edu.upc.si62_grupo_01.entities;

import jakarta.persistence.*;

@Entity
@Table(name="Terreno")
public class Terreno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTerreno;
    @Column(name="ubicacionTerreno", nullable=false,length = 255)
    private String ubicacionTerreno;
    @Column(name="tamanioTerreno", nullable=false)
    private String tamanioTerreno;
    @Column(name="descripcionTerreno",nullable = false,length = 300)
    private String descripcionTerreno;

    public Terreno(){
    }

    public Terreno(int idTerreno,String ubicacionTerreno,String tamanioTerreno,String descripcionTerreno){
        this.idTerreno = idTerreno;
        this.ubicacionTerreno = ubicacionTerreno;
        this.tamanioTerreno = tamanioTerreno;
        this.descripcionTerreno = descripcionTerreno;
    }

    public int getIdTerreno() {
        return idTerreno;
    }

    public void setIdTerreno(int idTerreno) {
        this.idTerreno = idTerreno;
    }

    public String getUbicacionTerreno() {
        return ubicacionTerreno;
    }

    public void setUbicacionTerreno(String ubicacionTerreno) {
        this.ubicacionTerreno = ubicacionTerreno;
    }

    public String getTamanioTerreno() {
        return tamanioTerreno;
    }

    public void setTamanioTerreno(String tamanioTerreno) {
        this.tamanioTerreno = tamanioTerreno;
    }

    public String getDescripcionTerreno() {
        return descripcionTerreno;
    }

    public void setDescripcionTerreno(String descripcionTerreno) {
        this.descripcionTerreno = descripcionTerreno;
    }
}
