package pe.tuna.backentapirestc2.models.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.tuna.backentapirestc2.models.intetity.Usuario;

public interface IUsuarioRepository extends JpaRepository<Usuario, Long> {

    public Usuario findByUsername(String username);

    // Probamos un ejemplo con la anotacion Query solo demostrativo ya vamos a obtener el mismo resultado
    @Query("SELECT u FROM Usuario u WHERE u.username = ?1")
    public Usuario findByUsername2(String username);
}
