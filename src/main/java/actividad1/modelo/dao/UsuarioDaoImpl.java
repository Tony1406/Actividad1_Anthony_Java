package actividad1.modelo.dao;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import actividad1.modelo.entities.Usuario;
import actividad1.modelo.repository.UsuarioRepository;

@Service
public class UsuarioDaoImpl implements UsuarioDao {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public Usuario buscarUno(Long idUsuario) {
        return usuarioRepository.findById(idUsuario).orElse(null);
    }

    @Override
    public List<Usuario> todos() {
        return usuarioRepository.findAll();
    }

    @Override
    public int eliminarPorId(Long idUsuario) {
        try {
            if (usuarioRepository.findById(idUsuario).orElse(null) == null)
                return 0;
            usuarioRepository.deleteById(idUsuario);
            return 1;
        } catch (Exception e) {
            return -1;
        }
    }

    @Override
    public Usuario insertarUno(Usuario usuario) {
        try {
            return usuarioRepository.save(usuario);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public Usuario actualizar(Usuario usuario) {
        try {
            return usuarioRepository.save(usuario);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
