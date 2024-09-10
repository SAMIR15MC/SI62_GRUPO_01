package pe.edu.upc.si62_grupo_01.dtos;

import pe.edu.upc.si62_grupo_01.entities.Evaluacion;
import pe.edu.upc.si62_grupo_01.entities.Proyecto;
import pe.edu.upc.si62_grupo_01.entities.Usuario;

import java.time.LocalDate;

public class ComentarioDTO {
    private int idComentario;
    private String contenidoComentario;
    private LocalDate fechaComentario;
    private Usuario usuario;
    private Proyecto proyecto;
    private Evaluacion evaluacion;
    // listar comentarios por proyecto por fecha

    public int getIdComentario() {
        return idComentario;
    }

    public void setIdComentario(int idComentario) {
        this.idComentario = idComentario;
    }

    public String getContenidoComentario() {
        return contenidoComentario;
    }

    public void setContenidoComentario(String contenidoComentario) {
        this.contenidoComentario = contenidoComentario;
    }

    public LocalDate getFechaComentario() {
        return fechaComentario;
    }

    public void setFechaComentario(LocalDate fechaComentario) {
        this.fechaComentario = fechaComentario;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Proyecto getProyecto() {
        return proyecto;
    }

    public void setProyecto(Proyecto proyecto) {
        this.proyecto = proyecto;
    }

    public Evaluacion getEvaluacion() {
        return evaluacion;
    }

    public void setEvaluacion(Evaluacion evaluacion) {
        this.evaluacion = evaluacion;
    }
}
