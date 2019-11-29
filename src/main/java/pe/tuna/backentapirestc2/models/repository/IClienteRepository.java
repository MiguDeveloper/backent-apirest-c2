package pe.tuna.backentapirestc2.models.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.tuna.backentapirestc2.models.intetity.Cliente;

@Repository
public interface IClienteRepository extends JpaRepository<Cliente, Long> {
}
