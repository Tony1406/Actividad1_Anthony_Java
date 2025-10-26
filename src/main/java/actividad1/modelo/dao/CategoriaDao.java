package actividad1.modelo.dao;

import java.util.List;

import actividad1.modelo.entities.Categoria;

public interface CategoriaDao {
    Categoria buscarUno(Long idCategoria);
    List<Categoria> todos();
    int eliminarPorId(Long idCategoria);
    Categoria insertarUno(Categoria categoria);
    Categoria actualizar(Categoria categoria);
}
