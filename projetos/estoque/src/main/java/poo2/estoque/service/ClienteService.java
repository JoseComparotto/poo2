package poo2.estoque.service;

import org.springframework.stereotype.Service;

import poo2.estoque.domain.Cliente;
import poo2.estoque.repository.BaseListRepository;

@Service
public class ClienteService extends BaseBreadService<Cliente> {

    public ClienteService(BaseListRepository<Cliente> repository) {
        super(repository);
    }

}
