package actividad1.modelo.entities;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private Long idUsuario;

    @Column(nullable = false, length = 50)
    private String nombre;

    @Column(nullable = false, unique = true, length = 50)
    private String email;

    @Column(nullable = false, length = 45)
    private String password;

    @Column(nullable = false)
    private Integer enabled;

    @Column(nullable = false, length = 45)
    private String rol;

    @Column(name = "fecha_registro")
    private LocalDate fechaRegistro;

    public Usuario() {
        super();
    }

    public Usuario(Long idUsuario, String nombre, String email, String password,
                   Integer enabled, String rol, LocalDate fechaRegistro) {
        super();
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.email = email;
        this.password = password;
        this.enabled = enabled;
        this.rol = rol;
        this.fechaRegistro = fechaRegistro;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getEnabled() {
        return enabled;
    }

    public void setEnabled(Integer enabled) {
        this.enabled = enabled;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public LocalDate getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDate fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    @Override
    public String toString() {
        return "Usuario [idUsuario=" + idUsuario + ", nombre=" + nombre + ", email=" + email +
               ", rol=" + rol + ", enabled=" + enabled + ", fechaRegistro=" + fechaRegistro + "]";
    }
}
