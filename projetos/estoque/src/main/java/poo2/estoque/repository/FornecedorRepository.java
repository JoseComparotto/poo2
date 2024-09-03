package poo2.estoque.repository;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import poo2.estoque.domain.Fornecedor;
import poo2.estoque.fakedb.BaseFakeDB;

@Repository
public class FornecedorRepository extends BaseRepository<Fornecedor> {

    public FornecedorRepository(@Autowired BaseFakeDB<Fornecedor> db) {
        super(db);
    }

    @Override
    public Fornecedor create(Fornecedor object) {
        long nextId = getNextId();

        object.setId(nextId);
        object.setDataInclusao(LocalDate.now());
        object.setDataAlteracao(LocalDate.now());

        boolean added = this.storage.add(object);
        return added ? object : null;
    }

    @Override
    public Fornecedor update(long id, Fornecedor object) {
        Fornecedor existing = read(id);
        if(existing == null) return null;

        existing.setCnpj(object.getCnpj());
        existing.setNome(object.getNome());
        existing.setEndereco(object.getEndereco());
        existing.setCidade(object.getCidade());
        existing.setEstado(object.getEstado());
        existing.setCep(object.getCep());
        existing.setTelefone(object.getTelefone());
        existing.setEmail(object.getEmail());
        
        existing.setDataAlteracao(LocalDate.now());

        return existing;
    }
    
}
