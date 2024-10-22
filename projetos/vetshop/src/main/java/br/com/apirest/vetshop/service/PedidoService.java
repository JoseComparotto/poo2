package br.com.apirest.vetshop.service;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import br.com.apirest.vetshop.model.Pedido;

@Service
public class PedidoService extends BaseBreadService<Pedido> {
    
    public PedidoService(JpaRepository<Pedido, Long> repository) {
        super(repository);
    }

    @Override
    public Optional<Pedido> edit(long id, Pedido object) {
        Optional<Pedido> old = this.repo.findById(id);
        if(!old.isPresent()) return old;
        Pedido entity = old.get();

        entity.setNome(object.getNome());
        entity.setCliente(object.getCliente());
        entity.setFornecedor(object.getFornecedor());
        entity.setProdutos(object.getProdutos());
        entity.setDataDeInclusao(object.getDataDeInclusao());
        entity.setDataDeAlteracao(object.getDataDeAlteracao());
        
        return Optional.of(repo.save(entity));
    }
}
