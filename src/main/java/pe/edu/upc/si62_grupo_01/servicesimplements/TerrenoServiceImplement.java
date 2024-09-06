package pe.edu.upc.si62_grupo_01.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.si62_grupo_01.entities.Terreno;
import pe.edu.upc.si62_grupo_01.repositories.ITerrenoRepository;
import pe.edu.upc.si62_grupo_01.servicesinterfaces.ITerrenoService;

import java.util.List;

@Service
public class TerrenoServiceImplement implements ITerrenoService {
    @Autowired
    private ITerrenoRepository terrenoRepository;

    @Override
    public List<Terreno> list(){return terrenoRepository.findAll();}

    @Override
    public void insert(Terreno terreno) {
        terrenoRepository.save(terreno);
    }

    @Override
    public void delete(int id) {
        terrenoRepository.deleteById(id);
    }

    @Override
    public void update(Terreno terreno) {
        terrenoRepository.save(terreno);
    }
}
