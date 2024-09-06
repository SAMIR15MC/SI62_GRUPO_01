package pe.edu.upc.si62_grupo_01.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "Prototipo")
public class Prototipo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPrototipo;
    @Column(name ="tipoEstructuraPrototipo", nullable = false,length = 100)
    private String tipoEstructuraPrototipo;
    @Column(name ="descripcionPrototipo", nullable = false,length = 250)
    private String descripcionPrototipo;
    @Column(name = "fechaCreacionPrototipo", nullable = false)
    private LocalDate fechaCreacionPrototipo;
    @ManyToOne
    @JoinColumn(name = "idTerreno")
    private Terreno terreno;

    public Prototipo() {
    }

    public Prototipo(int idPrototipo, String tipoEstructuraPrototipo, String descripcionPrototipo, LocalDate fechaCreacionPrototipo, Terreno terreno) {
        this.idPrototipo = idPrototipo;
        this.tipoEstructuraPrototipo = tipoEstructuraPrototipo;
        this.descripcionPrototipo = descripcionPrototipo;
        this.fechaCreacionPrototipo = fechaCreacionPrototipo;
        this.terreno = terreno;
    }

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

    public LocalDate getFechaCreacionPrototipo() {
        return fechaCreacionPrototipo;
    }

    public void setFechaCreacionPrototipo(LocalDate fechaCreacionPrototipo) {
        this.fechaCreacionPrototipo = fechaCreacionPrototipo;
    }

    public Terreno getTerreno() {
        return terreno;
    }

    public void setTerreno(Terreno terreno) {
        this.terreno = terreno;
    }
}
