package poo2.estoque.fakedb;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

import poo2.estoque.domain.SubclasseProduto;

@Component
public class SubclasseProdutoFakeDB extends BaseFakeDB<SubclasseProduto> {
    
    public SubclasseProdutoFakeDB(){
        super();
    }

    @Override
    protected void preencherLista() {
        this.lista.add(new SubclasseProduto(1L, 1L, "Carnes Bovinas", LocalDate.now()));
        this.lista.add(new SubclasseProduto(2L, 1L, "Carnes Suínas", LocalDate.now()));
        this.lista.add(new SubclasseProduto(3L, 2L, "Refrigerantes", LocalDate.now()));
        this.lista.add(new SubclasseProduto(4L, 2L, "Sucos", LocalDate.now()));
        this.lista.add(new SubclasseProduto(5L, 3L, "Queijos", LocalDate.now()));
        this.lista.add(new SubclasseProduto(6L, 3L, "Leite", LocalDate.now()));
        this.lista.add(new SubclasseProduto(7L, 4L, "Biscoitos Doces", LocalDate.now()));
        this.lista.add(new SubclasseProduto(8L, 4L, "Biscoitos Salgados", LocalDate.now()));
        this.lista.add(new SubclasseProduto(9L, 5L, "Detergentes", LocalDate.now()));
        this.lista.add(new SubclasseProduto(10L, 5L, "Sabão em Pó", LocalDate.now()));
    }

}
