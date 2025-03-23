/**
 * @author Evandro Santos
 */

package dao;

import dao.exception.TipoChaveNaoEncontradaException;
import domain.Cliente;

import java.util.Collection;
import java.util.List;

public class ClienteDaoMock implements IClienteDAO {

    public Boolean salvar(Cliente cliente) {
        return true;
    }

    public Cliente buscarPorCPF(Long cpf) {
        Cliente cliente = new Cliente();
        cliente.setCpf(cpf);
        return cliente;
    }

    @Override
    public Boolean cadastrar(Cliente entity) throws TipoChaveNaoEncontradaException {
        return null;
    }

    @Override
    public void excluir(Long cpf) {

    }

    @Override
    public void alterar(Cliente cliente) {

    }

    @Override
    public Cliente consultar(Long valor) {
        return null;
    }

    @Override
    public Collection<Cliente> buscarTodos() {
        return List.of();
    }
}
