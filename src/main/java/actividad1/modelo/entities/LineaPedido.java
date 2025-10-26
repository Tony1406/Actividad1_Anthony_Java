package actividad1.modelo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "lineas_pedido")
public class LineaPedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "numero_orden")
    private Long numeroOrden;

    @ManyToOne
    @JoinColumn(name = "id_producto")
    private Producto producto;

    @Column(nullable = false)
    private Integer cantidad;

    @Column(name = "precio_unitario", nullable = false)
    private Double precioUnitario;

    @ManyToOne
    @JoinColumn(name = "id_pedido")
    private Pedido pedido;

    public LineaPedido() {
        super();
    }

    public LineaPedido(Long numeroOrden, Producto producto, Integer cantidad,
                       Double precioUnitario, Pedido pedido) {
        super();
        this.numeroOrden = numeroOrden;
        this.producto = producto;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
        this.pedido = pedido;
    }

    public Long getNumeroOrden() {
        return numeroOrden;
    }

    public void setNumeroOrden(Long numeroOrden) {
        this.numeroOrden = numeroOrden;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(Double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    @Override
    public String toString() {
        return "LineaPedido [numeroOrden=" + numeroOrden + ", cantidad=" + cantidad +
               ", precioUnitario=" + precioUnitario + "]";
    }
}
