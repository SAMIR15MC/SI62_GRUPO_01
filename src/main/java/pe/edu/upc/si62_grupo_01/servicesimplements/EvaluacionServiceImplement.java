package pe.edu.upc.si62_grupo_01.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.si62_grupo_01.entities.Evaluacion;
import pe.edu.upc.si62_grupo_01.repositories.IEvaluacionRepository;
import pe.edu.upc.si62_grupo_01.servicesinterfaces.IEvaluacionService;

import java.util.List;
@Service
public class EvaluacionServiceImplement implements IEvaluacionService {
    @Autowired
    private IEvaluacionRepository eR;
    @Override
    public List<Evaluacion> list() {
        return eR.findAll();
    }

    @Override
    public void insert(Evaluacion evaluacion) {
        eR.save(evaluacion);
    }

    @Override
    public void update(Evaluacion evaluacion) {
        eR.save(evaluacion);
    }

    @Override
    public void delete(int id) {
        eR.deleteById(id);
    }
}
