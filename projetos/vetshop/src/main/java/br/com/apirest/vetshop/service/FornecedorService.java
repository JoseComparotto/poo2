package br.com.apirest.vetshop.service;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import br.com.apirest.vetshop.model.Fornecedor;

@Service
public class FornecedorService extends BaseBreadService<Fornecedor> {
    
    public FornecedorService(JpaRepository<Fornecedor, Long> repository) {
        super(repository);
    }

    @Override
    public Optional<Fornecedor> edit(long id, Fornecedor object) {
        Optional<Fornecedor> old = this.repo.findById(id);
        if(!old.isPresent()) return old;
        Fornecedor entity = old.get();

        entity.setRazaoSocial(object.getRazaoSocial());
        entity.setNomeFantasia(object.getNomeFantasia());
        entity.setCnpj(object.getCnpj());
        entity.setEmail(object.getEmail());
        entity.setTelefone(object.getTelefone());
        
        return Optional.of(repo.save(entity));
    }
}
