package pe.edu.upc.si62_grupo_01.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUsuario; // Cambiado de int a Long

    @Column(name = "nombreCompleto", nullable = false, length = 100)
    private String nombreCompleto;

    private Boolean enabled;

    @Column(name = "contrasenia", nullable = false, length = 100)
    private String contrasenia;

    @ManyToOne
    @JoinColumn(name = "idRol")
    private Rol role;

    public Usuario() {
    }

    public Usuario(Long idUsuario, String nombreCompleto, Boolean enabled, String contrasenia, Rol role) {
        this.idUsuario = idUsuario;
        this.nombreCompleto = nombreCompleto;
        this.enabled = enabled;
        this.contrasenia = contrasenia;
        this.role = role;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public Rol getRole() {
        return role;
    }

    public void setRole(Rol role) {
        this.role = role;
    }
}
