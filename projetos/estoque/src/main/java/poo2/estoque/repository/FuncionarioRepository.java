package poo2.estoque.repository;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import poo2.estoque.domain.Funcionario;
import poo2.estoque.fakedb.BaseFakeDB;

@Repository
public class FuncionarioRepository extends BaseListRepository<Funcionario> {

    public FuncionarioRepository(@Autowired BaseFakeDB<Funcionario> db) {
        super(db);
    }

    @Override
    public Funcionario create(Funcionario object) {
        long nextId = getNextId();

        object.setId(nextId);
        object.setDataInclusao(LocalDate.now());
        object.setDataAlteracao(LocalDate.now());

        boolean added = this.storage.add(object);
        return added ? object : null;
    }

    @Override
    public Funcionario update(long id, Funcionario object) {
        Funcionario existing = read(id);
        if(existing == null) return null;

        existing.setNome(object.getNome());
        existing.setEndereco(object.getEndereco());
        existing.setCidade(object.getCidade());
        existing.setEstado(object.getEstado());
        existing.setCep(object.getCep());
        existing.setTelefone(object.getTelefone());
        existing.setEmail(object.getEmail());
        existing.setIdTipoFuncionario(object.getIdTipoFuncionario());
        existing.setSenha(object.getSenha());
        
        existing.setDataAlteracao(LocalDate.now());

        return existing;
    }
    
}
