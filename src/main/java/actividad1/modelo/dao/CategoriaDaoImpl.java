package actividad1.modelo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import actividad1.modelo.entities.Categoria;
import actividad1.modelo.repository.CategoriaRepository;

@Service
public class CategoriaDaoImpl implements CategoriaDao {

    @Autowired
    private CategoriaRepository categoriaRepository;

	@Override
	public Categoria buscarUno(Long idCategoria) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Categoria> todos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int eliminarPorId(Long idCategoria) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Categoria insertarUno(Categoria categoria) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Categoria actualizar(Categoria categoria) {
		// TODO Auto-generated method stub
		return null;
	}
}
