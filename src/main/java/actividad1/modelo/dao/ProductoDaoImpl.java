package actividad1.modelo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import actividad1.modelo.entities.Producto;
import actividad1.modelo.repository.ProductoRepository;

@Service
public class ProductoDaoImpl implements ProductoDao {

    @Autowired
    private ProductoRepository productoRepository;

	@Override
	public Producto buscarUno(Long idProducto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Producto> todos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int eliminarPorId(Long idProducto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Producto insertarUno(Producto producto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Producto actualizar(Producto producto) {
		// TODO Auto-generated method stub
		return null;
	}
}
