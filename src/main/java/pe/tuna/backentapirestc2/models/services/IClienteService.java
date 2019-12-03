package pe.tuna.backentapirestc2.models.services;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import pe.tuna.backentapirestc2.models.intetity.Cliente;

import java.util.List;

public interface IClienteService {
    public List<Cliente> findAll();
    public Page<Cliente> findAll(Pageable pageable);
    public Cliente findById(Long id);
    public Cliente save(Cliente cliente);
    public void delete(Long id);
}
