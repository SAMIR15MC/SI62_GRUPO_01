package pe.edu.upc.si62_grupo_01.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.si62_grupo_01.dtos.TerrenoDTO;
import pe.edu.upc.si62_grupo_01.entities.Terreno;
import pe.edu.upc.si62_grupo_01.servicesinterfaces.ITerrenoService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("terreno")
public class TerrenoController {
    @Autowired
    private ITerrenoService terrenoService;


    @GetMapping
    public List<TerrenoDTO>listarTerrenos(){
        return terrenoService.list().stream().map(x->{
            ModelMapper m= new ModelMapper();
            return m.map(x, TerrenoDTO.class);
        }).collect(Collectors.toList());
    }
    @PostMapping
    private void insertar(@RequestBody TerrenoDTO terrenoDTO){
        ModelMapper m= new ModelMapper();
        Terreno t=m.map(terrenoDTO, Terreno.class);
        terrenoService.insert(t);
    }
    @PutMapping
    public void modificar(@RequestBody TerrenoDTO terrenoDTO){
        ModelMapper m= new ModelMapper();
        Terreno t= m.map(terrenoDTO,Terreno.class);
        terrenoService.update(t);
    }
    @DeleteMapping
    public void eliminar(@PathVariable ("id")Integer id){
        terrenoService.delete(id);
    }
}
