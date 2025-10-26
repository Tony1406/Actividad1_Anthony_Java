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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Usuario> todos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int eliminarPorId(Long idUsuario) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Usuario insertarUno(Usuario usuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario actualizar(Usuario usuario) {
		// TODO Auto-generated method stub
		return null;
	}
}
