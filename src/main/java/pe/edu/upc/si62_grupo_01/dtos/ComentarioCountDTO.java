package pe.edu.upc.si62_grupo_01.dtos;

public class ComentarioCountDTO {
    private String nombreUsuario;
    private Long cantidadComentarios;

    public ComentarioCountDTO() {
    }

    public ComentarioCountDTO(String nombreUsuario, Long cantidadComentarios) {
        this.nombreUsuario = nombreUsuario;
        this.cantidadComentarios = cantidadComentarios;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public Long getCantidadComentarios() {
        return cantidadComentarios;
    }

    public void setCantidadComentarios(Long cantidadComentarios) {
        this.cantidadComentarios = cantidadComentarios;
    }
}