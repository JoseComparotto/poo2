package poo2.estoque.fakedb;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

import poo2.estoque.domain.ClasseProduto;

@Component
public class ClasseProdutoFakeDB extends BaseFakeDB<ClasseProduto> {
    
    public ClasseProdutoFakeDB(){
        super();
    }

    @Override
    protected void preencherLista() {
        this.lista.add(new ClasseProduto(1L, LocalDate.now(), LocalDate.now(), "Carnes"));
        this.lista.add(new ClasseProduto(2L, LocalDate.now(), LocalDate.now(), "Bebidas"));
        this.lista.add(new ClasseProduto(3L, LocalDate.now(), LocalDate.now(), "Laticínios"));
        this.lista.add(new ClasseProduto(4L, LocalDate.now(), LocalDate.now(), "Biscoitos"));
        this.lista.add(new ClasseProduto(5L, LocalDate.now(), LocalDate.now(), "Limpeza"));
    }

}
