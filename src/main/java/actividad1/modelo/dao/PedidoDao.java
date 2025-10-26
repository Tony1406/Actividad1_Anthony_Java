package actividad1.modelo.dao;

import java.util.List;

import actividad1.modelo.entities.Pedido;

public interface PedidoDao {
    Pedido buscarUno(Long idPedido);
    List<Pedido> todos();
    int eliminarPorId(Long idPedido);
    Pedido insertarUno(Pedido pedido);
    Pedido actualizar(Pedido pedido);
}
