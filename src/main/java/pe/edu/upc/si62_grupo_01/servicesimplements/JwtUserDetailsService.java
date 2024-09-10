package pe.edu.upc.si62_grupo_01.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import pe.edu.upc.si62_grupo_01.entities.Usuario;
import pe.edu.upc.si62_grupo_01.repositories.IUsuarioRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class JwtUserDetailsService implements UserDetailsService {
    @Autowired
    private IUsuarioRepository repo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // Buscar al usuario por su nombre de usuario
        Usuario user = repo.findOneByNombreCompleto(username);

        // Si el usuario no existe, lanzar excepción
        if (user == null) {
            throw new UsernameNotFoundException(String.format("User not exists: %s", username));
        }

        // Crear la lista de roles (GrantedAuthority), en este caso solo un rol
        List<GrantedAuthority> authorities = new ArrayList<>();
        authorities.add(new SimpleGrantedAuthority(user.getRole().getNombreRol()));

        // Crear el objeto UserDetails y almacenarlo en la variable "ud"
        UserDetails ud = new org.springframework.security.core.userdetails.User(
                user.getNombreCompleto(), // El nombre completo del usuario
                user.getContrasenia(),    // La contraseña
                user.getEnabled(),        // Si el usuario está habilitado
                true,                     // Cuenta no expirada
                true,                     // Credenciales no expiradas
                true,                     // Cuenta no bloqueada
                authorities               // Lista de roles (GrantedAuthority)
        );

        // Devolver el objeto ud
        return ud;
    }
}

