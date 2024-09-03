package poo2.estoque.domain;

import java.time.LocalDate;
import jakarta.persistence.Entity;

@Entity
public class Fornecedor extends BasePessoa {
    
    private String cnpj;

    public Fornecedor(long id, LocalDate dataInclusao, LocalDate dataAlteracao, String nome, String endereco,
            String cidade, String estado, String cep, String telefone, String email, String cnpj) {
        super(id, dataInclusao, dataAlteracao, nome, endereco, cidade, estado, cep, telefone, email);
        this.cnpj = cnpj;
    }

    public Fornecedor() {
        super();
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

}
