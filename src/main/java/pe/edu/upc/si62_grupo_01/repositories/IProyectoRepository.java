package pe.edu.upc.si62_grupo_01.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.si62_grupo_01.dtos.ProyectoCountDTO;
import pe.edu.upc.si62_grupo_01.entities.Proyecto;

import java.util.List;

@Repository
public interface IProyectoRepository extends JpaRepository<Proyecto, Integer> {

    // Query para contar proyectos por usuario
    @Query("SELECT new pe.edu.upc.si62_grupo_01.dtos.ProyectoCountDTO(p.usuarioProyecto.nombreCompleto, COUNT(p)) " +
            "FROM Proyecto p WHERE p.usuarioProyecto.idUsuario = :idUsuario GROUP BY p.usuarioProyecto.nombreCompleto")
    public List<ProyectoCountDTO> contarProyectosPorUsuario(@Param("idUsuario") Long idUsuario);
}
