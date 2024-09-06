package pe.edu.upc.si62_grupo_01.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.si62_grupo_01.entities.Plano;
import pe.edu.upc.si62_grupo_01.repositories.IPlanoRepository;
import pe.edu.upc.si62_grupo_01.servicesinterfaces.IPlanoService;

import java.util.List;
@Service
public class PlanoServiceImplement implements IPlanoService {

    @Autowired
    private IPlanoRepository planoRepository;

    @Override
    public List<Plano> list() {
        return planoRepository.findAll();
    }

    @Override
    public void insert(Plano plano) {
        planoRepository.save(plano);
    }

    @Override
    public void update(Plano plano) {
        planoRepository.save(plano);
    }

    @Override
    public void delete(int id) {
        planoRepository.deleteById(id);
    }
}
