package pe.edu.upc.si62_grupo_01.dtos;

import pe.edu.upc.si62_grupo_01.entities.Terreno;

import java.time.LocalDate;

public class PlanoDTO {
    private int idPlano;
    private String tipoPlano;
    private String descripcionPlano;
    private LocalDate fechaPlano;
    private Terreno terreno;

    public int getIdPlano() {
        return idPlano;
    }

    public void setIdPlano(int idPlano) {
        this.idPlano = idPlano;
    }

    public String getTipoPlano() {
        return tipoPlano;
    }

    public void setTipoPlano(String tipoPlano) {
        this.tipoPlano = tipoPlano;
    }

    public String getDescripcionPlano() {
        return descripcionPlano;
    }

    public void setDescripcionPlano(String descripcionPlano) {
        this.descripcionPlano = descripcionPlano;
    }

    public LocalDate getFechaPlano() {
        return fechaPlano;
    }

    public void setFechaPlano(LocalDate fechaPlano) {
        this.fechaPlano = fechaPlano;
    }

    public Terreno getTerreno() {
        return terreno;
    }

    public void setTerreno(Terreno terreno) {
        this.terreno = terreno;
    }
}
