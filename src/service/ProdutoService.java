/**
 * @author Evandro Santos
 */

package service;

import dao.IProdutoDAO;
import domain.Produto;
import service.generic.GenericService;

public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {

    public ProdutoService(IProdutoDAO dao) {
        super(dao);
    }

}
