package actividad1.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import actividad1.modelo.dao.UsuarioDao;
import actividad1.modelo.entities.Usuario;

@RestController
@RequestMapping("/usuarios")
public class UsuarioRestController {

    @Autowired
    private UsuarioDao usuarioDao;

    @GetMapping("/todos")
    public List<Usuario> listarTodos() {
        return usuarioDao.todos();
    }

    @GetMapping("/{idUsuario}")
    public Usuario buscarPorId(@PathVariable Long idUsuario) {
        return usuarioDao.buscarUno(idUsuario);
    }

    @PostMapping("/crear")
    public Usuario crear(@RequestBody Usuario usuario) {
        return usuarioDao.insertarUno(usuario);
    }

    @PutMapping("/actualizar")
    public Usuario actualizar(@RequestBody Usuario usuario) {
        return usuarioDao.actualizar(usuario);
    }

    @DeleteMapping("/eliminar/{idUsuario}")
    public int eliminar(@PathVariable Long idUsuario) {
        return usuarioDao.eliminarPorId(idUsuario);
    }
}
