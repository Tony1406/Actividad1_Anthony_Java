package actividad1.modelo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import actividad1.modelo.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
