package poo2.estoque.service;

import java.time.LocalDate;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import poo2.estoque.domain.Fornecedor;

@Service
public class FornecedorService extends BaseBreadService<Fornecedor> {

    public FornecedorService(JpaRepository<Fornecedor, Long> repo){
        super(repo);
    }

    @Override
    public Fornecedor edit(long id, Fornecedor object) {
        Optional<Fornecedor> old = this.repo.findById(id);
        if(!old.isPresent()) return null;
        Fornecedor entity = old.get();

        entity.setCnpj(object.getCnpj());
        entity.setNome(object.getNome());
        entity.setEmail(object.getEmail());
        entity.setTelefone(object.getTelefone());
        entity.setCep(object.getCep());
        entity.setEndereco(object.getEndereco());
        entity.setCidade(object.getCidade());
        entity.setEstado(object.getEstado());

        entity.setDataAlteracao(LocalDate.now());
        
        return repo.save(entity);
    }

}
