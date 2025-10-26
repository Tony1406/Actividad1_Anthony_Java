package actividad1.modelo.dao;

import java.util.List;

import actividad1.modelo.entities.Usuario;

public interface UsuarioDao {
    Usuario buscarUno(Long idUsuario);
    List<Usuario> todos();
    int eliminarPorId(Long idUsuario);
    Usuario insertarUno(Usuario usuario);
    Usuario actualizar(Usuario usuario);
}
