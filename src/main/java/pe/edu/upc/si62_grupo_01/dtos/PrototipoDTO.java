package pe.edu.upc.si62_grupo_01.dtos;

import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import pe.edu.upc.si62_grupo_01.entities.Terreno;

import java.time.LocalDate;

public class PrototipoDTO {
    private int idPrototipo;
    private String tipoEstructuraPrototipo;
    private String descripcionPrototipo;
    private LocalDate fechaCreacionPrototipo;
    private Terreno terreno;

    public int getIdPrototipo() {
        return idPrototipo;
    }

    public void setIdPrototipo(int idPrototipo) {
        this.idPrototipo = idPrototipo;
    }

    public String getTipoEstructuraPrototipo() {
        return tipoEstructuraPrototipo;
    }

    public void setTipoEstructuraPrototipo(String tipoEstructuraPrototipo) {
        this.tipoEstructuraPrototipo = tipoEstructuraPrototipo;
    }

    public String getDescripcionPrototipo() {
        return descripcionPrototipo;
    }

    public void setDescripcionPrototipo(String descripcionPrototipo) {
        this.descripcionPrototipo = descripcionPrototipo;
    }

    public Terreno getTerreno() {
        return terreno;
    }

    public void setTerreno(Terreno terreno) {
        this.terreno = terreno;
    }

    public LocalDate getFechaCreacionPrototipo() {
        return fechaCreacionPrototipo;
    }

    public void setFechaCreacionPrototipo(LocalDate fechaCreacionPrototipo) {
        this.fechaCreacionPrototipo = fechaCreacionPrototipo;
    }
}
