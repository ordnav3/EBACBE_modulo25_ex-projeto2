import dao.ClienteDaoMock;
import dao.IClienteDAO;
import domain.Cliente;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import service.ClienteService;
import service.IClienteService;

/**
 * @author Evandro Santos
 */

public class ClienteServiceTest {
    private IClienteService clienteService;

    private Cliente cliente;

    public ClienteServiceTest() {
        IClienteDAO dao = new ClienteDaoMock();
        clienteService = new ClienteService(dao);
    }

    @Before
    public void init() {
        cliente = new Cliente();
        cliente.setNome("Evandro");
        cliente.setCpf(36231280071l);
        cliente.setTel(99999999999l);
        cliente.setEnd("Rua SLA");
        cliente.setNumero(999);
        cliente.setCidade("SP");
        cliente.setEstado("SP");
    }

    @Test
    public void pesquisaCliente() {
        Cliente clienteConsultado = clienteService.buscarPorCPF(cliente.getCpf());

        Assert.assertNotNull(clienteConsultado);
    }

    @Test
    public void salvarCliente() {
        Boolean retorno = clienteService.salvar(cliente);
        Assert.assertTrue(retorno);
    }

    @Test
    public void excluirCliente() {
        clienteService.excluir(cliente.getCpf());
    }

    @Test
    public void alterarCliente() {
        cliente.setNome("Evandro Santos Afonso");
        clienteService.alterar(cliente);
        Assert.assertEquals("Evandro Santos Afonso", cliente.getNome());
    }
}
