package actividad1.modelo.dao;

import java.util.List;

import actividad1.modelo.entities.Producto;

public interface ProductoDao {
    Producto buscarUno(Long idProducto);
    List<Producto> todos();
    int eliminarPorId(Long idProducto);
    Producto insertarUno(Producto producto);
    Producto actualizar(Producto producto);
}
