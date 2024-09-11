package pe.edu.upc.si62_grupo_01.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.si62_grupo_01.entities.Comentario;
import pe.edu.upc.si62_grupo_01.dtos.ComentarioCountDTO;

import java.util.List;

@Repository
public interface IComentarioRepository extends JpaRepository<Comentario, Integer> {

    // Query para contar los comentarios por usuario
    @Query("SELECT new pe.edu.upc.si62_grupo_01.dtos.ComentarioCountDTO(c.usuario.nombreCompleto, COUNT(c)) " +
            "FROM Comentario c WHERE c.usuario.idUsuario = :idUsuario GROUP BY c.usuario.nombreCompleto")
    public List<ComentarioCountDTO> contarComentariosPorUsuario(@Param("idUsuario") Long idUsuario);
}
