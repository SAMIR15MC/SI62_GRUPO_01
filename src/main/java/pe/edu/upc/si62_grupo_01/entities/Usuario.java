package pe.edu.upc.si62_grupo_01.entities;

import jakarta.persistence.*;

@Entity
@Table(name="Usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUsuario;
    @Column(name="nombreCompleto",nullable = false,length = 100)
    private String nombreCompleto;
    @Column(name="email",nullable = false,length = 100)
    private String email;
    @Column(name="contrasenia",nullable = false,length = 100)
    private String contrasenia;
    @ManyToOne
    @JoinColumn(name="idRol")
    private Rol role;
    public Usuario() {
    }

    public Usuario(String nombreCompleto, int idUsuario, String email, String contrasenia, Rol role) {
        this.nombreCompleto = nombreCompleto;
        this.idUsuario = idUsuario;
        this.email = email;
        this.contrasenia = contrasenia;
        this.role = role;
    }

    public Rol getRole() {
        return role;
    }

    public void setRole(Rol role) {
        this.role = role;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
}
