package pe.edu.upc.si62_grupo_01.servicesinterfaces;

import pe.edu.upc.si62_grupo_01.entities.Terreno;

import  java.util.List;

public interface ITerrenoService {
    public List<Terreno> list();
    public void insert(Terreno terreno);
    public void delete(int id);
    public void update(Terreno terreno);
}
