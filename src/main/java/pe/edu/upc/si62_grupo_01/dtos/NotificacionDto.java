package pe.edu.upc.si62_grupo_01.dtos;

import pe.edu.upc.si62_grupo_01.entities.Usuario;

import java.time.LocalDate;

public class NotificacionDto {

    private int idNotificacion;
    private String tituloNotificacion;
    private String mensajeNotificacion;
    private LocalDate fechaNotificacion;
    Usuario usuario;

    public int getIdNotificacion() {
        return idNotificacion;
    }

    public void setIdNotificacion(int idNotificacion) {
        this.idNotificacion = idNotificacion;
    }

    public String getTituloNotificacion() {
        return tituloNotificacion;
    }

    public void setTituloNotificacion(String tituloNotificacion) {
        this.tituloNotificacion = tituloNotificacion;
    }

    public LocalDate getFechaNotificacion() {
        return fechaNotificacion;
    }

    public void setFechaNotificacion(LocalDate fechaNotificacion) {
        this.fechaNotificacion = fechaNotificacion;
    }

    public String getMensajeNotificacion() {
        return mensajeNotificacion;
    }

    public void setMensajeNotificacion(String mensajeNotificacion) {
        this.mensajeNotificacion = mensajeNotificacion;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
