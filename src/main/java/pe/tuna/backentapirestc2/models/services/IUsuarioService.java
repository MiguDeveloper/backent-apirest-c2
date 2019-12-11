package pe.tuna.backentapirestc2.models.services;

import pe.tuna.backentapirestc2.models.intetity.Usuario;

public interface IUsuarioService {
    public Usuario findByUsername(String username);
}
