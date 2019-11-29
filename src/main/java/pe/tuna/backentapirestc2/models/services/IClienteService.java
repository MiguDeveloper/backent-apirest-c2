package pe.tuna.backentapirestc2.models.services;

import pe.tuna.backentapirestc2.models.intetity.Cliente;

import java.util.List;

public interface IClienteService {
    public List<Cliente> findAll();
    public Cliente findById(Long id);
    public Cliente save(Cliente cliente);
    public void delete(Long id);
}
