package pe.edu.upc.si62_grupo_01.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.si62_grupo_01.dtos.EstadosProyectosDTO;
import pe.edu.upc.si62_grupo_01.dtos.UsuarioDTO;
import pe.edu.upc.si62_grupo_01.dtos.UsuariosTerrenoDTO;
import pe.edu.upc.si62_grupo_01.entities.Usuario;
import pe.edu.upc.si62_grupo_01.servicesinterfaces.IUsuarioService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    private IUsuarioService uS;

    @Autowired
    private PasswordEncoder passwordEncoder;

    // Método POST para registrar un nuevo usuario
    @PostMapping
    public void insertar(@RequestBody UsuarioDTO dto) {
        ModelMapper m = new ModelMapper();
        Usuario usuario = m.map(dto, Usuario.class);
        String encodedPassword = passwordEncoder.encode(usuario.getContrasenia());
        usuario.setContrasenia(encodedPassword);
        uS.insert(usuario);
    }

    // Método GET para listar todos los usuarios
    @GetMapping
    public List<UsuarioDTO> listar() {
        return uS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, UsuarioDTO.class);
        }).collect(Collectors.toList());
    }

    // Método PUT para modificar un usuario existente
    @PutMapping
    public void modificar(@RequestBody UsuarioDTO usuarioDTO) {
        ModelMapper m = new ModelMapper();
        Usuario usuario = m.map(usuarioDTO, Usuario.class);

        // Codificar nuevamente la contraseña antes de actualizar
        String encodedPassword = passwordEncoder.encode(usuario.getContrasenia());
        usuario.setContrasenia(encodedPassword);

        uS.update(usuario);
    }

    // Método DELETE para eliminar un usuario por ID
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Long id) {
        uS.delete(id);
    }

    @GetMapping("/estado_proyecto")
    public List<EstadosProyectosDTO>listarProyectosEstados()
    {
        List<String[]>lista=uS.ListarProyectosEstado();
        List<EstadosProyectosDTO>listaDTO=new ArrayList<>();
        for(String[] columna:lista){
            EstadosProyectosDTO dto=new EstadosProyectosDTO();
            dto.setIdUsuario(Integer.parseInt(columna[0]));
            dto.setNombre(columna[1]);
            dto.setEmail(columna[2]);
            dto.setEstado(columna[3]);
            listaDTO.add(dto);
        }
        return listaDTO;
    }
}
