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
        return productoRepository.findById(idProducto).orElse(null);
    }

    @Override
    public List<Producto> todos() {
        return productoRepository.findAll();
    }

    @Override
    public int eliminarPorId(Long idProducto) {
        try {
            if (productoRepository.findById(idProducto).orElse(null) == null)
                return 0;
            productoRepository.deleteById(idProducto);
            return 1;
        } catch (Exception e) {
            return -1;
        }
    }

    @Override
    public Producto insertarUno(Producto producto) {
        try {
            return productoRepository.save(producto);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public Producto actualizar(Producto producto) {
        try {
            return productoRepository.save(producto);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
