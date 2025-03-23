package service;

import dao.ClienteDAO;
import dao.IClienteDAO;
import domain.Cliente;

/**
 * @author Evandro Santos
 */

public class ClienteService <Cliente, Long> implements IClienteService {
    private ClienteDAO dao;

    //private IClienteDAO clienteDAO;

    public ClienteService(IClienteDAO clienteDAO) {
        super();
        //this.clienteDAO = clienteDAO;
    }

//	@Override
//	public Boolean salvar(Cliente cliente) throws TipoChaveNaoEncontradaException {
//		return clienteDAO.cadastrar(cliente);
//	}


    @Override
    public Boolean salvar(domain.Cliente cliente) {
        return null;
    }

    @Override
    public domain.Cliente buscarPorCPF(java.lang.Long cpf) {
        return null;
    }

    @Override
    public void excluir(java.lang.Long cpf) {

    }

    @Override
    public void alterar(domain.Cliente cliente) {

    }

//	@Override
//	public void excluir(Long cpf) {
//		clienteDAO.excluir(cpf);
//	}
//
//	@Override
//	public void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException{
//		clienteDAO.alterar(cliente);
//	}

}