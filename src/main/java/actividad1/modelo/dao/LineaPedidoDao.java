package actividad1.modelo.dao;

import java.util.List;

import actividad1.modelo.entities.LineaPedido;

public interface LineaPedidoDao {
    LineaPedido buscarUno(Long numeroOrden);
    List<LineaPedido> todos();
    int eliminarPorId(Long numeroOrden);
    LineaPedido insertarUno(LineaPedido lineaPedido);
    LineaPedido actualizar(LineaPedido lineaPedido);
}
