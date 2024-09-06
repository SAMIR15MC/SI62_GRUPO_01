package pe.edu.upc.si62_grupo_01.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.si62_grupo_01.entities.Material;
import pe.edu.upc.si62_grupo_01.repositories.IMaterialRepository;
import pe.edu.upc.si62_grupo_01.servicesinterfaces.IMaterialService;

import java.util.List;

@Service
public class MaterialServiceImplement implements  IMaterialService {
    @Autowired
    private IMaterialRepository materialRepository;

    @Override
    public  List<Material> list(){return materialRepository.findAll();}

    @Override
    public void insert(Material material) {
        materialRepository.save(material);
    }

    @Override
    public void delete(int id) {
        materialRepository.deleteById(id);
    }

    @Override
    public void update(Material material) {
        materialRepository.save(material);
    }
}
