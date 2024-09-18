package pe.edu.upc.si62_grupo_01.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.si62_grupo_01.entities.Terreno;

import java.util.List;

@Repository
public interface ITerrenoRepository extends JpaRepository<Terreno,Integer> {
    @Query(value ="SELECT t.ubicacion_terreno, COUNT(DISTINCT u.id_usuario) AS num_usuarios\n" +
            "FROM terreno t\n" +
            "JOIN proyecto p\n" +
            "ON t.id_terreno = p.id_terreno\n" +
            "JOIN usuario u\n" +
            "ON p.id_usuario = u.id_usuario\n" +
            "GROUP BY t.ubicacion_terreno;" ,nativeQuery = true)
    public List<String[]>cantidad();
}
