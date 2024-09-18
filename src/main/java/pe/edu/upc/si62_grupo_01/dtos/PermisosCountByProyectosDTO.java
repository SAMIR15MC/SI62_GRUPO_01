package pe.edu.upc.si62_grupo_01.dtos;

public class PermisosCountByProyectosDTO {
    private long idUsuario;
    private String nombreusuario;
    private String proyecto;
    private int numPermisos;

    public long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getProyecto() {
        return proyecto;
    }

    public void setProyecto(String proyecto) {
        this.proyecto = proyecto;
    }

    public int getNumPermisos() {
        return numPermisos;
    }

    public void setNumPermisos(int numPermisos) {
        this.numPermisos = numPermisos;
    }

    public String getNombreusuario() {
        return nombreusuario;
    }

    public void setNombreusuario(String nombreusuario) {
        this.nombreusuario = nombreusuario;
    }
}
