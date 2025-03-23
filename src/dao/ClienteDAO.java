package dao;

import dao.generic.GenericDAO;
import domain.Cliente;

import java.util.Collection;
import java.util.List;

public class ClienteDAO extends GenericDAO<Cliente, Long> implements IClienteDAO {

    public ClienteDAO() {
        super();
    }

    @Override
    public Class<Cliente> getTipoClasse() {
        return Cliente.class;
    }

    @Override
    public void atualiarDados(Cliente entity, Cliente entityCadastrado) {
        entityCadastrado.setCidade(entity.getCidade());
        entityCadastrado.setCpf(entity.getCpf());
        entityCadastrado.setEnd(entity.getEnd());
        entityCadastrado.setEstado(entity.getEstado());
        entityCadastrado.setNome(entity.getNome());
        entityCadastrado.setNumero(entity.getNumero());
        entityCadastrado.setTel(entity.getTel());

    }


    @Override
    public void excluir(Number valor) {

    }

    @Override
    public Collection<Cliente> buscarTodos() {
        return List.of();
    }

    @Override
    public Cliente consultar(Long valor) {
        return null;
    }
}
