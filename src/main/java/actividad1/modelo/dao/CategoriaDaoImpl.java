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
		return categoriaRepository.findById(idCategoria).orElse(null);
	}

	@Override
	public List<Categoria> todos() {
		// TODO Auto-generated method stub
		return categoriaRepository.findAll();
	}

	@Override
	public int eliminarPorId(Long idCategoria) {
		// TODO Auto-generated method stub
		try {
			
			if(categoriaRepository.findById(idCategoria).orElse(null)==null)
				return 0; // no existe o es nulo
			
			categoriaRepository.deleteById(idCategoria);
			return 1; // todo va bien

		} catch (Exception e) {
			return -1; //excepcion no se persiste
		}
	}

	@Override
	public Categoria insertarUno(Categoria categoria) {
		// TODO Auto-generated method stub
		try {
			return categoriaRepository.save(categoria);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public Categoria actualizar(Categoria categoria) {
		// TODO Auto-generated method stub
		try {
			return categoriaRepository.save(categoria);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
