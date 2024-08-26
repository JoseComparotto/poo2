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
        this.lista.add(new SubclasseProduto(1L, LocalDate.now(), LocalDate.now(), "Carnes Bovinas", 1L));
        this.lista.add(new SubclasseProduto(2L, LocalDate.now(), LocalDate.now(), "Carnes Suínas", 1L));
        this.lista.add(new SubclasseProduto(3L, LocalDate.now(), LocalDate.now(), "Refrigerantes", 2L));
        this.lista.add(new SubclasseProduto(4L, LocalDate.now(), LocalDate.now(), "Sucos", 2L));
        this.lista.add(new SubclasseProduto(5L, LocalDate.now(), LocalDate.now(), "Queijos", 3L));
        this.lista.add(new SubclasseProduto(6L, LocalDate.now(), LocalDate.now(), "Leite", 3L));
        this.lista.add(new SubclasseProduto(7L, LocalDate.now(), LocalDate.now(), "Biscoitos Doces", 4L));
        this.lista.add(new SubclasseProduto(8L, LocalDate.now(), LocalDate.now(), "Biscoitos Salgados", 4L));
        this.lista.add(new SubclasseProduto(9L, LocalDate.now(), LocalDate.now(), "Detergentes", 5L));
        this.lista.add(new SubclasseProduto(10L, LocalDate.now(), LocalDate.now(), "Sabão em Pó", 5L));
    }

}
