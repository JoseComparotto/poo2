# Atividade A1 - Parte 1

| Academico:    | [José A. Q. C. Gomes <code>@JoseComparotto</code>](https://github.com/JoseComparotto) | RA: 398439413098     |
| ------------- | ------------------------------------------------------------------------------------- | :------------------: |
| Curso:        | Ciência da Computação                                                                 | Noturno              |
| Professor:    | [Luiz Augusto Rodrigues <code>@profluizao</code>](https://github.com/profluizao)      |                      |
| Disciplina:   | Programação Orientada a Objetos II                                                    | 2024.2 - 6º Semestre |
| Universidade: | [Anhanguera-Uniderp - Matriz](https://www.uniderp.com.br/)                            | Campo Grande, MS     |
| Atividade:    | [Atividade A1 - Pate 1](docs/POO2%20-%20Atividade%20A1-1.pdf)                         | Data: 05/08/2024     |

<h2 id="gabarito">Gabarito</h2>

| **Questão**        | **Resposta** | **Justificativa** 
| :----------------: | :----------: | :----------------
|  [1](#questao-q1)  | E            | A afirmação da alternativa (E) é incorreta pois apesar da linguagem C++ permitir o uso do paradigma Orientado a Objetos, ela também suporta a utilização do paradigma estruturado como na linguagem C. Conforme especificado na página inicial do guia de referência da linguagem C++ (Cplusplus.com).
|  [2](#questao-q2)  | B            | 
|  [3](#questao-q3)  | D            | 
|  [4](#questao-q4)  | A            | 
|  [5](#questao-q5)  | C            | Apenas a primeira asserção é verdadeira. As II e III estão invertidas.
|  [6](#questao-q6)  | A            | 
|  [7](#questao-q7)  | C            | 
|  [8](#questao-q8)  | C            | A afirmação “I” é incorreta por causa do termo “utilizar amplamente os tipos abstratos de dados”, que é uma característica das LOO e não das linguagens procedurais. <br/> A afirmação “III” é incorreta pois as linguagens citadas são reconhecidas por serem Orientadas a Objetos, por mais que permita o uso de blocos procedurais em suas partes.
|  [9](#questao-q9)  | C            | 
| [10](#questao-q10) | B            | 
| [11](#questao-q11) | C            | 
| [12](#questao-q12) |              | 
| [13](#questao-q13) |              | 
| [14](#questao-q14) |              | 
| [15](#questao-q15) |              |  
| [16](#questao-q16) |              | 
| [17](#questao-q17) |              | 
| [18](#questao-q18) |              | 
| [19](#questao-q19) |              | 
| [20](#questao-q20) |              | 

<h2 id="referencias">Referências</h2>

- Cplusplus.com. (n.d.). Standard C++ Library reference. Disponível em: <[https://cplusplus.com/reference/](https://cplusplus.com/reference/)>.
- Booch, G., Rumbaugh, J., & Jacobson, I. (2006). UML - Guia do Usuário (tradução de Fábio Freitas da Silva e Cristina de Amorim Machado. – Rio de Janeiro: Elsevier, 2012. – 12ª reimpressão.). Página 117.
 
<h2 id="questoes">Questões</h2>
  
<h3 id="questao-q1">Questão 01</h3>

Sobre programação estruturada e programação orientada a objetos, marque a afirmação incorreta.</summary>

<h4 id="alternativas-q1">Alternativas</h4>

- (A) Existem vários paradigmas de programação, dentre eles o estruturado e o orientado a objetos.

- (B) No paradigma de programação estruturado, qualquer problema pode ser dividido em problemas menores, chamados de funções.

- (C) A linguagem de programação C é um exemplo de linguagem de programação estruturada, compilada e procedural.

- (D) O paradigma orientado a objetos entende o problema como um conjunto de objetos interagindo por meio de troca de mensagens.

- ***(E) A linguagem de programação C++ é um exemplo de linguagem orientada a objetos, que não permite a utilização do paradigma estruturado na solução de um problema.***

<h4 id="resposta-q1">Resposta</h4>

```palin
(E) A linguagem de programação C++ é um exemplo de linguagem orientada a objetos, que não permite a utilização do paradigma estruturado na solução de um problema.
```

<h4 id="justificativa-q1">Justificativa</h4>

```palin
A afirmação é incorreta pois apesar da linguagem C++ permitir o uso do paradigma Orientado a Objetos, ela também suporta a utilização do paradigma estruturado como na linguagem C.
Conforme especificado na página inicial do guia de referência da linguagem C++ (Cplusplus.com).
```

<h3 id="questao-q2">Questão 02</h3>

"Em um programa que utiliza linguagem orientada a objetos, podemos ter um objeto que realiza ações diferentes, ou seja, a mesma operação pode atuar de modos diversos em classes diferentes". Observando a afirmação, podemos ver que se trata de um aspecto muito importante da POO.
Marque qual afirmação explica este aspecto.

<h4 id="alternativas-q2">Alternativas</h4>

- (A) Herança múltipla.

- ***(B) Polimorfismo.***

- (C) Caso de uso de engenharia reversa.

- (D) Atributo multivalorado.

- (E) Superclasse.

<h4 id="resposta-q2">Resposta</h4>

```palin
(B) Polimorfismo.
```

<h4 id="justificativa-q2">Justificativa</h4>

```palin
O polimorfismo permite que um método com o mesmo nome seja implementado de maneiras diferentes em classes distintas, dependendo do objeto que o invoca.
Conforme explicado em "UML: Guia do Usuário" de BOOCH, RUMBAUGH e JACOBSON. Página 117.
```

<h3 id="questao-q3">Questão 03</h3>

Dentro do paradigma de programação orientada a objetos (POO), há um mecanismo utilizado para impedir o acesso direto ao estado de um objeto, restando apenas os métodos externos que podem alterar esses estados. Marque a alternativa que apresenta o nome deste mecanismo.

<h4 id="alternativas-q3">Alternativas</h4>

- (A) Mensagem.

- (B) Herança.

- (C) Polimorfismo.

- ***(D) Encapsulamento.***

- (E) Subclasse.

<h4 id="resposta-q3">Resposta</h4>

```palin
(D) Encapsulamento.
```

<h4 id="justificativa-q3">Justificativa</h4>

```palin
Encapsulamento é o mecanismo que protege o estado interno de um objeto, permitindo que ele seja acessado e modificado apenas através de métodos específicos, evitando o acesso direto às variáveis internas.
Conforme explicado em "UML: Guia do Usuário" de BOOCH, RUMBAUGH e JACOBSON. Página 307.
```

<h3 id="questao-q4">Questão 04</h3>

Dentro do paradigma de programação orientada a objetos (POO), há um mecanismo pelo qual uma classe pode estender outra classe, aproveitando seus métodos e atributos. Marque a alternativa que apresenta o nome deste mecanismo.

<h4 id="alternativas-q4">Alternativas</h4>

- ***(A) Herança.***

- (B) Mensagem.

- (C) Encapsulamento.

- (D) Polimorfismo.

- (E) Subclasse.

<h4 id="resposta-q4">Resposta</h4>

```palin
(A) Herança.
```

<h4 id="justificativa-q4">Justificativa</h4>

```palin
Herança é o mecanismo pelo qual uma classe (subclasse) pode estender outra classe (superclasse), reutilizando e especializando seus métodos e atributos.
Conforme explicado em "UML: Guia do Usuário" de BOOCH, RUMBAUGH e JACOBSON. Página 118.
```

<h3 id="questao-q5">Questão 05</h3>

Sobre Programação Orientada a Objetos, considere:

I. O encapsulamento garante que apenas as interfaces necessárias para interação com o objeto estejam visíveis, e atributos internos não sejam acessíveis.

II. O polimorfismo garante que objetos possam herdar métodos e atributos de uma superclasse para a geração de uma nova classe.

III. A herança possibilita que distintas operações na mesma classe tenham o mesmo nome, desde que alterada a assinatura.
Marque a alternativa que representa corretamente as definições acima.

<h4 id="alternativas-q5">Alternativas</h4>

- (A) III, apenas.

- (D) II, apenas.

- ***(C) I, apenas.***

- (D) II e III, apenas.

- (E) I, II e III.

<h4 id="resposta-q5">Resposta</h4>

```palin
(C) I, apenas.
```

<h4 id="justificativa-q5">Justificativa</h4>

```plain
Apenas a primeira asserção é verdadeira. As II e III estão invertidas.
```

<h3 id="questao-q6">Questão 06</h3>

"É o mecanismo pelo qual uma classe pode estender outra classe, aproveitando seus comportamentos e variáveis possíveis". Considerando os conceitos de Programação Orientada a Objetos, marque a alternativa que representa essa afirmação.

<h4 id="alternativas-q6">Alternativas</h4>

- ***(A) Trata-se dos conceitos de herança, métodos e atributos.***

- (B) subclasse, instância e associação.

- (C) subclasse, encapsulamento e abstração.

- (D) herança, abstração e associação.

- (E) encapsulamento, polimorfismo e interface.

<h4 id="resposta-q6">Resposta</h4>

```palin
(A) Trata-se dos conceitos de herança, métodos e atributos.
```

<h4 id="justificativa-q6">Justificativa</h4>

```plain

```

<h3 id="questao-q7">Questão 07</h3>

Analise as afirmações a seguir, sobre a programação orientada a objetos.

I. Neste tipo de programação, objetos executam ações, mas não suportam propriedades ou atributos.

II. Uma classe especifica o formato geral de seus objetos.

III. As propriedades e ações disponíveis para um objeto não dependem de sua classe.

IV. A tecnologia orientada a objetos permite que classes projetadas adequadamente sejam reutilizáveis em vários projetos.

Marque a alternativa que representa corretamente as definições acima.

<h4 id="alternativas-q7">Alternativas</h4>

- (A) II, III e IV, apenas.

- (B) I e II, apenas.

- ***(C) II e IV, apenas.***

- (D) I, II e III, apenas.

- (E) I, II, III e IV.

<h4 id="resposta-q7">Resposta</h4>

```palin
(C) II e IV, apenas.
```

<h4 id="justificativa-q7">Justificativa</h4>

```plain

```

<h3 id="questao-q8">Questão 08</h3>

Observe as afirmações abaixo.

I. As linguagens procedimentais que dominaram o mercado antes da programação estruturada, tal como o COBOL, caracterizaram-se por utilizar amplamente os tipos abstratos de dados.

II. Entre os paradigmas de programação, estão a programação imperativa, a programação funcional, a programação embasada em lógica e a programação orientada por objetos.

III. O Java, bem como o C#, é considerado uma linguagem procedural segmentada em corpo e variáveis.

IV. A programação estruturada é uma filosofia de projeto procedimental que restringe o número e o tipo de construções lógicas usadas para representar o detalhe do algoritmo.

Marque Verdadeiro ou Falso nas afirmações abaixo.

<h4 id="alternativas-q8">Alternativas</h4>

- (A) II, III e IV, apenas.

- (B) I e II, apenas.

- ***(C) II e IV, apenas.***

- (D) I, II e III, apenas.

- (E) I, II, III e IV.

<h4 id="resposta-q8">Resposta</h4>

```palin
(C) II e IV, apenas.
```

<h4 id="justificativa-q8">Justificativa</h4>

```plain
  A afirmação “I” é incorreta por causa do termo “utilizar amplamente os tipos abstratos de dados”, que é uma característica das LOO e não das linguagens procedurais.
  A afirmação “III” é incorreta pois as linguagens citadas são reconhecidas por serem Orientadas a Objetos, por mais que permita o uso de blocos procedurais em suas partes.
```

<h3 id="questao-q9">Questão 09</h3>

Observe a afirmação a seguir, considerando os conceitos de Programação Orientada a Objetos.
"Nos conceitos de orientação a objetos, ..... é uma estrutura composta por ..... que descrevem suas propriedades e também por ..... que moldam seu comportamento ..... são ..... dessa estrutura e só existem em tempo de execução".
Marque a alternativa que representa as lacunas a serem preenchidas.

<h4 id="alternativas-q9">Alternativas</h4>

- (A) objeto, métodos, assinaturas, Classes, cópias.

- (B) polimorfismo, funções, métodos, Herança, cópias.

- ***(C) classe, atributos, operações, Objetos, instâncias.***

- (D) multiplicidade, símbolos, números, Classes, herdeiros.

- (E) domínio, diagramas, casos de caso, Diagramas de classe, exemplos.

<h4 id="resposta-q9">Resposta</h4>

```palin
(C) classe, atributos, operações, Objetos, instâncias.
```

<h4 id="justificativa-q9">Justificativa</h4>

```plain

```

<h3 id="questao-q10">Questão 10</h3>

No contexto de programação orientada a objetos, considere as afirmativas abaixo, e marque a alternativa correta.

I. Objetos são instâncias de classes.

II. Herança é uma relação entre objetos.

III. Mensagens são formas de executar métodos.

IV. Classes são apenas agrupamentos de métodos.

V. Ocorre herança múltipla quando mais de um método é herdado.

VI. Herança é uma relação entre classes.

<h4 id="alternativas-q10">Alternativas</h4>

- (A) I, III e IV.

- ***(B) I, III e VI.***

- (C) III, IV e VI.

- (D) II, III e V.

- (E) II, IV e V.

<h4 id="resposta-q10">Resposta</h4>

```plain
(B) I, III e VI.
```

<h4 id="justificativa-q10">Justificativa</h4>

```plain
A afirmação “II” é incorreta pois Herança é uma relação entre classes e não entre objetos. A afirmação “IV” é incorreta pois classe são mais do que agrupamento de métodos. São definições da estrutura de objetos, que podem conter métodos.
```

<h3 id="questao-q11">Questão 11</h3>

Classes  e  objetos  são  dois  conceitos-chave  da  programação  orientada  a  objetos.  Com  relação  a  estes conceitos, marque a alternativa correta.

<h4 id="alternativas-q11">Alternativas</h4>

- (A) uma classe é uma descrição de um ou mais objetos por meio de um conjunto uniforme de atributos e serviços. Além disso, pode conter uma descrição de como criar novos objetos na classe.

- (B) uma classe é capaz de armazenar estados através de seus atributos e reagir a mensagens enviadas a ela, assim como se relacionar e enviar mensagens a outras classes.

- ***(C) uma classe é uma abstração de alguma coisa no domínio de um problema ou na sua implementação, refletindo a capacidade de um sistema para manter informações sobre ela, interagir com ela ou ambos.***

- (D) um objeto em uma classe é apenas uma definição, pois a ação só ocorre quando o objeto é invocado através de um método.

- (E) herança  é  o  mecanismo  pelo  qual  um  objeto  pode  estender  outro  objeto,  aproveitando  seus comportamentos e variáveis possíveis.

<h4 id="resposta-q11">Resposta</h4>

```plain
(C) uma classe é uma abstração de alguma coisa no domínio de um problema ou na sua implementação, refletindo a capacidade de um sistema para manter informações sobre ela, interagir com ela ou ambos.
```

<h4 id="justificativa-q11">Justificativa</h4>

```plain

```

<h3 id="questao-q12">Questão 12</h3>

Considerando a definição teórica de OBJETO, na Programação Orientada a Objetos, marque a alternativa que explica corretamente a definição.

<h4 id="alternativas-q12">Alternativas</h4>

- (A) Um objeto é uma rotina de programação contida em uma classe que pode ser chamada diversas vezes possibilitando assim reuso de código de programação.

- (B) Um objeto é um conjunto de atributos primitivos tipados contido em uma classe.

- (C) Um objeto é uma entidade que possui um estado e um conjunto definido de operações definidas para funcionar nesse estado.

- (D) Um objeto é um elemento de uma classe que representa uma operação (a implementação de uma operação).

- (E) Um objeto é uma porção de código que resolve um problema muito específico, parte de um problema maior.

<h4 id="resposta-q12">Resposta</h4>

```plain

```

<h4 id="justificativa-q12">Justificativa</h4>

```plain

```

<h3 id="questao-q13">Questão 13</h3>

“O aumento da produtividade de desenvolvimento e a capacidade de compartilhar o conhecimento 
adquirido, representa uma vantagem no uso de projetos orientados a objeto.”

Marque a alternativa que explica a afirmação.

<h4 id="alternativas-q13">Alternativas</h4>

- (A) um objeto pode ser chamado por objetos de classe diferente da sua.

- (B) as classes podem ser potencialmente reutilizáveis.

- (C) as classes devem ser concretas ou abstratas.

- (D) todo método pode ser derivado naturalmente das operações de sua classe.

- (E) o encapsulamento impossibilita equívocos de código.

<h4 id="resposta-q13">Resposta</h4>

```plain

```

<h4 id="justificativa-q13">Justificativa</h4>

```plain

```

<h3 id="questao-q14">Questão 14</h3>

Observe as considerações a seguir.

I. Os objetos têm seu estado definido pelos métodos e seu comportamento definido nas variáveis de instância.

II. A classe é constituída por atributos que representam os dados e operações que representam os métodos que podem ser executados.

III. Um objeto é capaz de armazenar estados através de seus atributos e reagir a mensagens enviadas a ele, assim como se relacionar e enviar mensagens a outros objetos.

IV. Uma classe pode ser vista como uma descrição generalizada de uma coleção de objetos semelhantes.
 
Considere as afirmativas acima, e marque a alternativa correta.

<h4 id="alternativas-q14">Alternativas</h4>

- (A) II, III e IV, apenas.

- (B) I e II, apenas.

- (C) II e IV, apenas.

- (D) I, II e III, apenas.

- (E) I, II, III e IV.

<h4 id="resposta-q14">Resposta</h4>

```plain

```

<h4 id="justificativa-q14">Justificativa</h4>

```plain

```

<h3 id="questao-q15">Questão 15</h3>

Observe as considerações a seguir.

I. Objetos com os mesmos atributos e operações possuem a mesma identidade, podendo ser referenciados por outros objetos.

II. Uma classe especifica uma estrutura de dados e os métodos operacionais permissíveis que se aplicam a cada um de seus objetos. Pode ter sua própria estrutura de dados e métodos, bem como pode herdá-la de sua superclasse.

III. As variáveis de uma classe só podem ser alteradas por métodos definidos nos seus objetos.

IV. Um construtor visa inicializar os atributos e pode ser executado automaticamente sempre que um novo objeto é criado.

Considere as afirmativas acima, e marque a alternativa correta.

<h4 id="alternativas-q15">Alternativas</h4>

- (A)  II, III e IV, apenas.

- (B) I e II, apenas.

- (C) II e IV, apenas.

- (D) I, II e III, apenas.

- (E) I, II, III e IV.

<h4 id="resposta-q15">Resposta</h4>

```plain

```

<h4 id="justificativa-q15">Justificativa</h4>

```plain

```

<h3 id="questao-q16">Questão 16</h3>

Na programação orientada a objetos, é o princípio que oferece a capacidade de um método poder ser implementado de diferentes formas, ou mesmo de realizar coisas diferentes, ou seja, um único serviço pode oferecer variações, conforme se aplique a diferentes subclasses de uma superclasse

Marque a alternativa correta que cujo texto explica esse recurso.

<h4 id="alternativas-q16">Alternativas</h4>

- (A) No contexto, o termo método é o mecanismo pelo qual um objeto utiliza os recursos de outro.

- (B) No contexto, o termo método é uma instância de uma classe.

- (C) No contexto, o termo método é o elemento que define as habilidades do objeto.

- (D) No contexto, o termo método é uma chamada a um objeto para invocar uma classe.

- (E) No contexto, o termo método é um objeto capaz de armazenar estados através de seus atributos.

<h4 id="resposta-q16">Resposta</h4>

```plain

```

<h4 id="justificativa-q16">Justificativa</h4>

```plain

```

<h3 id="questao-q17">Questão 17</h3>

Na programação orientada a objetos, as classes podem conter, dentre outros elementos, métodos e atributos. Marque a alternativa correta nas afirmações abaixo.

<h4 id="alternativas-q17">Alternativas</h4>

- (A) Os métodos devem receber apenas parâmetros do mesmo tipo.

- (B) Os métodos não podem ser sobrecarregados em uma mesma classe.

- (C) Os métodos precisam possuir corpo em interfaces e classes abstratas.

- (D) Os métodos podem ser sobrescritos em aplicações que possuem relação de herança.

- (E) Os métodos definidos como private só podem ser acessados de classes do mesmo pacote.

<h4 id="resposta-q17">Resposta</h4>

```plain

```

<h4 id="justificativa-q17">Justificativa</h4>

```plain

```

<h3 id="questao-q18">Questão 18</h3>

Sobre Interfaces, considere as afirmações abaixo.

I. Os métodos públicos de uma classe definem a interface da classe.

II. Os métodos privativos de uma classe não fazem parte da interface da classe.

III. Interfaces são usadas para implementar ou não seus métodos em classes filhas.

IV. Na programação orientada a objetos, as classes podem conter, dentre outros elementos, métodos e atributos. Os métodos precisam possuir corpo em interfaces e classes abstratas.

Marque a alternativa correta nas afirmações a seguir.

<h4 id="alternativas-q18">Alternativas</h4>

- (A) II, III e IV, apenas.

- (B) I e II, apenas.

- (C) II e IV, apenas.

- (D) I, II e III, apenas.

- (E) I, II, III e IV.

<h4 id="resposta-q18">Resposta</h4>

```plain

```

<h4 id="justificativa-q18">Justificativa</h4>

```plain

```

<h3 id="questao-q19">Questão 19</h3>

Sobre a visibilidade dos métodos na orientação a objetos considere:

I. Os métodos públicos de uma classe definem a interface da classe.

II. Os métodos privativos de uma classe não fazem parte da interface da classe.

III. O nome dos métodos é a informação reconhecida como a assinatura dos métodos.

Marque a alternativa correta nas afirmações abaixo.

<h4 id="alternativas-q19">Alternativas</h4>

- (A) Está correto o que consta APENAS em I e II.

- (B) Está correto o que consta APENAS em I e III.

- (C) Está correto o que consta APENAS em II e III.

- (D) Está correto o que consta APENAS em II.

- (E) Está correto o que consta APENAS em I.

<h4 id="resposta-q19">Resposta</h4>

```plain

```

<h4 id="justificativa-q19">Justificativa</h4>

```plain

```

<h3 id="questao-q20">Questão 20</h3>

Considere o texto abaixo.

> “A classe Pedido contém um método chamado obter Produtos() que retorna uma lista de produtos 
> pertencentes a um determinado pedido. O código que usa esta classe desconhece completamente como 
> esta lista de produtos é montada. Tudo que interessa é a lista de produtos que o método retorna.”

Na essência, o texto explica um dos fundamentos das linguagens Orientado a Objeto. Marque a alternativa 
correta nas afirmações a seguir
<h4 id="alternativas-q20">Alternativas</h4>

- (A) Trata-se de polimorfismo.

- (B) Trata-se de encapsulamento.

- (C) Trata-se de dependência.

- (D) Trata-se de herança múltipla.

- (E) Trata-se de estereotipagem.

<h4 id="resposta-q20">Resposta</h4>

```plain

```

<h4 id="justificativa-q20">Justificativa</h4>

```plain

```

