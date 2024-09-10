package pe.edu.upc.si62_grupo_01.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "Proyecto")
public class Proyecto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int idProyecto;
    @Column (name="nombreProyecto",nullable = false,length = 100)
    private String nombreProyecto;
    @Column (name="descripcionProyecto",nullable = false,length = 250)
    private String descripcionProyecto;
    @Column (name="fechaCreacionProyecto",nullable = false)
    private LocalDate fechaCreacionProyecto;
    @Column (name="estadoProyecto",nullable = false,length = 25)
    private String estadoProyecto;
    @ManyToOne
    @JoinColumn(name="idUsuario")
    private Usuario usuarioProyecto;
    @OneToOne
    @JoinColumn(name="idTerreno")
    private Terreno terrenoProyecto;

    public Proyecto() {
    }

    public Proyecto(int idProyecto, String nombreProyecto, String descripcionProyecto, LocalDate fechaCreacionProyecto, String estadoProyecto, Usuario usuarioProyecto,Terreno terrenoProyecto) {
        this.idProyecto = idProyecto;
        this.nombreProyecto = nombreProyecto;
        this.descripcionProyecto = descripcionProyecto;
        this.fechaCreacionProyecto = fechaCreacionProyecto;
        this.estadoProyecto = estadoProyecto;
        this.usuarioProyecto = usuarioProyecto;
        this.terrenoProyecto= terrenoProyecto;
    }

    public int getIdProyecto() {
        return idProyecto;
    }

    public void setIdProyecto(int idProyecto) {
        this.idProyecto = idProyecto;
    }

    public String getNombreProyecto() {
        return nombreProyecto;
    }

    public void setNombreProyecto(String nombreProyecto) {
        this.nombreProyecto = nombreProyecto;
    }

    public String getDescripcionProyecto() {
        return descripcionProyecto;
    }

    public void setDescripcionProyecto(String descripcionProyecto) {
        this.descripcionProyecto = descripcionProyecto;
    }

    public LocalDate getFechaCreacionProyecto() {
        return fechaCreacionProyecto;
    }

    public void setFechaCreacionProyecto(LocalDate fechaCreacionProyecto) {
        this.fechaCreacionProyecto = fechaCreacionProyecto;
    }

    public String getEstadoProyecto() {
        return estadoProyecto;
    }

    public void setEstadoProyecto(String estadoProyecto) {
        this.estadoProyecto = estadoProyecto;
    }

    public Usuario getUsuarioProyecto() {
        return usuarioProyecto;
    }

    public void setUsuarioProyecto(Usuario usuarioProyecto) {
        this.usuarioProyecto = usuarioProyecto;
    }
    public Terreno getTerrenoProyecto(){return terrenoProyecto;}
    public void setTerrenoProyecto(Terreno terrenoProyecto){this.terrenoProyecto=terrenoProyecto;}
}
