package pe.edu.upc.si62_grupo_01.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.upc.si62_grupo_01.entities.Usuario;

@Repository
public interface IUsuarioRepository extends JpaRepository<Usuario, Long> {

    // Cambié 'username' a 'nombreCompleto' para alinearlo con tu entidad
    public Usuario findOneByNombreCompleto(String nombreCompleto);

    // BUSCAR POR NOMBRE COMPLETO
    @Query("select count(u.nombreCompleto) from Usuario u where u.nombreCompleto = :nombreCompleto")
    public int buscarNombreCompleto(@Param("nombreCompleto") String nombreCompleto);

    // INSERTAR ROLES
    @Transactional
    @Modifying
    @Query(value = "insert into roles (rol, user_id) VALUES (:rol, :user_id)", nativeQuery = true)
    public void insRol(@Param("rol") String authority, @Param("user_id") Long user_id);
}
