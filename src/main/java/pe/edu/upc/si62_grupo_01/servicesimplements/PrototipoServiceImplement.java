package pe.edu.upc.si62_grupo_01.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.si62_grupo_01.entities.Prototipo;
import pe.edu.upc.si62_grupo_01.repositories.IPrototipoRepository;
import pe.edu.upc.si62_grupo_01.servicesinterfaces.IPrototipoService;

import java.util.List;

@Service()
public class PrototipoServiceImplement implements IPrototipoService {
    @Autowired
    private IPrototipoRepository prototipoRepository;

    @Override
    public List<Prototipo> list() {
        return prototipoRepository.findAll();
    }

    @Override
    public void insert(Prototipo prototipo) {
        prototipoRepository.save(prototipo);
    }

    @Override
    public void delete(int id) {
        prototipoRepository.deleteById(id);
    }

    @Override
    public void update(Prototipo prototipo) {
        prototipoRepository.save(prototipo);
    }
}
