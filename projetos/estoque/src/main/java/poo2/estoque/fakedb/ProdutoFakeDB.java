package poo2.estoque.fakedb;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

import poo2.estoque.domain.Produto;

@Component
public class ProdutoFakeDB extends BaseFakeDB<Produto> {
    
    public ProdutoFakeDB(){
        super();
    }

    @Override
    protected void preencherLista() {
        this.lista.add(new Produto(1L, LocalDate.now(), LocalDate.now(), "Picanha", 1L, 79.90)); // Relacionado à Subclasse "Carne Bovina"
        this.lista.add(new Produto(2L, LocalDate.now(), LocalDate.now(), "Peito de Frango", 2L, 19.90)); // Relacionado à Subclasse "Carne de Aves"
        this.lista.add(new Produto(3L, LocalDate.now(), LocalDate.now(), "Costela Suína", 3L, 29.90)); // Relacionado à Subclasse "Carne Suína"
        this.lista.add(new Produto(4L, LocalDate.now(), LocalDate.now(), "Vodka", 4L, 49.90)); // Relacionado à Subclasse "Destilados"
        this.lista.add(new Produto(5L, LocalDate.now(), LocalDate.now(), "Cerveja Pilsen", 5L, 4.99)); // Relacionado à Subclasse "Cervejas"
        this.lista.add(new Produto(6L, LocalDate.now(), LocalDate.now(), "Leite Integral", 6L, 3.49)); // Relacionado à Subclasse "Leites"
        this.lista.add(new Produto(7L, LocalDate.now(), LocalDate.now(), "Queijo Muçarela", 7L, 24.90)); // Relacionado à Subclasse "Queijos"
        this.lista.add(new Produto(8L, LocalDate.now(), LocalDate.now(), "Biscoito Recheado", 8L, 2.99)); // Relacionado à Subclasse "Biscoitos Doces"
        this.lista.add(new Produto(9L, LocalDate.now(), LocalDate.now(), "Água Sanitária", 9L, 5.99)); // Relacionado à Subclasse "Desinfetantes"
        this.lista.add(new Produto(10L, LocalDate.now(), LocalDate.now(), "Sabão em Pó", 10L, 12.90)); // Relacionado à Subclasse "Detergentes"
    }

}
