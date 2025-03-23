package service;

import domain.Cliente;

public interface IClienteService {
    Boolean salvar(Cliente cliente);

    Cliente buscarPorCPF(Long cpf);

    void excluir(Long cpf);

    void alterar(Cliente cliente);
}
