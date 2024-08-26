# Atividade A1 - Parte 2

| Academico:    | [José A. Q. C. Gomes <code>@JoseComparotto</code>](https://github.com/JoseComparotto) | RA: 398439413098     |
| ------------- | ------------------------------------------------------------------------------------- | :------------------: |
| Curso:        | Ciência da Computação                                                                 | Noturno              |
| Professor:    | [Luiz Augusto Rodrigues <code>@profluizao</code>](https://github.com/profluizao)      |                      |
| Disciplina:   | Programação Orientada a Objetos II                                                    | 2024.2 - 6º Semestre |
| Universidade: | [Anhanguera-Uniderp - Matriz](https://www.uniderp.com.br/)                            | Campo Grande, MS     |
| Atividade:    | [Atividade A1 - Parte 2](docs/POO2%20-%20Atividade%20A1-2.pdf)                        | Data: 19/08/2024     |

<h2 id="gabarito">Gabarito</h2>

| **Questão**        | **Resposta** | **Justificativa** 
| :----------------: | :----------: | :----------------
|  [1](#questao-q1)  | C            | De acordo com a documentação da MDN Web Docs (2023), o HTTP (Hypertext Transfer Protocol) opera na camada de aplicação do modelo OSI e utiliza o modelo cliente-servidor para a troca de mensagens.
|  [2](#questao-q2)  | C            | De acordo com a MDN Web Docs, "Em respostas, o Content-Type diz para o cliente qual é o tipo de conteúdo que a resposta, de fato, tem" (Mozilla Contributors, 2023).
|  [3](#questao-q3)  | B            | Embora o HTTP opere na camada de aplicação, o HTTPS utiliza TLS/SSL para garantir a segurança da comunicação, e esse processo ocorre entre a camada de transporte (TCP) e a camada de aplicação. De acordo com a MDN Web Docs, "HTTPS (HTTP Secure) é uma versão do protocolo HTTP criptografado. É normalmente usado SSL ou TLS para criptografar toda a comunicação entre um cliente e um servidor" (Mozilla Contributors, 2023).
|  [4](#questao-q4)  | D            | De acordo com a MDN Web Docs, "O código HTTP 200 OK é a resposta de status de sucesso que indica que a requisição foi bem sucedida." (Mozilla Contributors, 2023).
|  [5](#questao-q5)  | A            | O código de status HTTP 400 Bad Request é apropriado quando a solicitação do cliente está malformada ou falta dados essenciais, e o servidor não consegue processar a solicitação devido a essas falhas. Segundo a MDN Web Docs, "O código de status HTTP 400 Bad Request indica que o servidor não pode ou não irá processar a solicitação devido a um erro do cliente" (Mozilla Contributors, 2023).
|  [6](#questao-q6)  | B            | Segundo a MDN Web Docs, "O código de resposta de status de redirecionamento 301 Moved Permanently do protocolo HTTP indica que o recurso requisitado foi movido permanentemente para a URL dada pelo cabeçalho Localização headers." (Mozilla Contributors, 2023).
|  [7](#questao-q7)  | A            | O método HTTP PUT é utilizado para enviar uma nova representação de um recurso existente ou criar um novo recurso em uma URL específica, substituindo a representação anterior. Por outro lado, o método POST é utilizado para criar um novo recurso no servidor, geralmente enviando dados que serão processados para criar uma nova entrada. De acordo com a MDN Web Docs, "O método de requisição HTTP PUT cria um novo recurso ou substitui uma representação do recurso de destino com os novos dados. A diferença entre PUT e POST é que PUT é idempotente, ou seja, chamá-lo várias vezes terá o mesmo efeito" (Mozilla Contributors, 2023).
|  [8](#questao-q8)  | D            | De acordo com a MDN Web Docs, "O método HTTP HEAD solicita os cabeçalhos retornados de um recurso específico que foi requisitado por um método HTTP GET. Tal solicitação pode ser feita antes de baixar um grande recurso para economizar largura de banda, por exemplo. Uma resposta para um método HEAD não deve ter um corpo. Se tiver, deve ser ignorado." (Mozilla Contributors, 2023).
|  [9](#questao-q9)  | D            | De acordo com a MDN Web Docs, "O método HTTP POST envia dados ao servidor. [...] Uma solicitação POST geralmente é enviada por meio de um formulário HTML e resulta em uma alteração no servidor." (Mozilla Contributors, 2023).
| [10](#questao-q10) | **N.D.A.**   | <p>A RFC 5789 especifica que:</p><blockquote>The PATCH method requests that a set of changes described in the request entity be applied to the resource identified by the Request-URI. The set of changes is represented in a format called a 'patch document' identified by a media type. [...] PATCH is neither safe nor idempotent as defined by [RFC2616], Section 9.1. A PATCH request can be issued in such a way as to be idempotent, which also helps prevent bad outcomes from collisions between two PATCH requests on the same resource in a similar time frame. (RFC 5789, Section 2).</blockquote><p>Portanto, a afirmação correta seria: <p>**PATCH** é utilizado para aplicar modificações parciais a um recurso. Apesar de não ser garantidamente idempotente, o método pode ser implementado de forma a ser idempotente, mas isso não é uma exigência obrigatória.</p><p>**PUT** é utilizado para substituir um recurso inteiro e é garantidamente idempotente, significando que múltiplas requisições PUT idênticas terão o mesmo efeito que uma única requisição.</p><p> Logo, com base na descrição fornecida, **nenhuma das alternativas é completamente correta.** A questão pode ser considerada ambígua e pode precisar ser revisada ou anulada, pois a descrição se refere a um comportamento de PATCH que não é garantido por padrão.</p>
| [11](#questao-q11) | C            | De acordo com a MDN Web Docs, "O método de requisição HTTP PATCH aplica modificações parciais a um recurso. O método HTTP PUT permite apenas substituições completas de um documento."(Mozilla Contributors, 2023).
| [12](#questao-q12) | B            | <p>Segundo Fielding (2000), no estilo arquitetural "client-stateless-server" (CSS), que é derivado do modelo cliente-servidor, o servidor não armazena o  estado da sessão entre as requisições. Isso significa que cada solicitação  enviada pelo cliente ao servidor deve conter todas as informações necessárias para ser processada, sem depender de qualquer contexto previamente armazenado no servidor. O estado da sessão é mantido exclusivamente no lado do cliente.</p><p>Fielding explica:</p><blockquote>The client-stateless-server style derives from client-server with the additional constraint that no session state is allowed on the server component. Each request from client to server must contain all of the information necessary to understand the request, and cannot take advantage of any stored context on the server. Session state is kept entirely on the client. (Fielding, 2000, p. 47)</blockquote>
| [13](#questao-q13) | A & C           | <p>Ao projetar endpoints para uma API RESTful, é crucial seguir práticas que assegurem uma arquitetura clara e eficiente, conforme os princípios estabelecidos por Roy Fielding em sua dissertação. Fielding define um recurso como um "mapeamento conceitual para um conjunto de entidades", e a semântica desse mapeamento deve permanecer constante para garantir a distinção entre recursos (Fielding, 2000).</p><p>Neste contexto, a utilização de métodos HTTP distintos para operações CRUD em um único endpoint (Alternativa A) e a adoção de URLs hierárquicas para representar recursos e suas coleções (Alternativa C) são práticas que alinham-se com as diretrizes de Fielding. O uso de métodos HTTP apropriados para diferentes operações permite uma interação clara e semântica com os recursos, enquanto URLs hierárquicas proporcionam uma estrutura organizada e intuitiva para a identificação dos recursos e suas coleções.</p>
| [14](#questao-q14) | C            | De acordo com o Modelo de Maturidade de Richardson (2008), APIs no Nível 1 são caracterizadas por utilizar um único método HTTP, frequentemente POST, e um único endpoint para todas as operações. Nesse nível, a API não explora amplamente o uso dos métodos HTTP para diferenciar operações (como GET, PUT, DELETE) nem adota URLs hierárquicas para representar diferentes recursos. Essas práticas são desenvolvidas nos níveis seguintes do modelo, que introduzem uma estrutura mais detalhada e uma representação mais clara dos recursos.
| [15](#questao-q15) | D            | A limitação das APIs no Nível 1 do Modelo de Maturidade de Richardson (2008) está no uso inadequado dos métodos HTTP e das URLs para representar operações em recursos. Nessa abordagem, é comum que as operações de CRUD sejam realizadas utilizando um único método HTTP (como POST) para todas as ações,  ou que diferentes operações sejam mapeadas para diferentes URLs (exemplo: /produtos/update para atualização), o que viola as práticas RESTful.
| [16](#questao-q16) | C            | O Nível 2 do Modelo de Maturidade de Richardson se distingue do Nível 1 pela adoção correta dos métodos HTTP (GET, POST, PUT, DELETE) para suas respectivas operações e pelo uso de códigos de status HTTP adequados. No Nível 1, as APIs podem até usar diferentes métodos HTTP, mas geralmente de forma inconsistente ou inadequada, e com URLs que não seguem padrões RESTful. No Nível 2, essas práticas são ajustadas para aderir aos princípios REST, proporcionando uma interface mais clara e semântica.
| [17](#questao-q17) |              | 
| [18](#questao-q18) |              | 
| [19](#questao-q19) |              | 
| [20](#questao-q20) |              | 

<h2 id="referencias">Referências</h2>

- Mozilla Contributors. (2023). HTTP. MDN Web Docs. Disponível em: <[https://developer.mozilla.org/pt-BR/docs/Web/HTTP](https://developer.mozilla.org/pt-BR/docs/Web/HTTP)>. Acesso em 24 de Agosto de 2024.
- Mozilla Contributors. (2023). Content-Type. MDN Web Docs. Disponível em: <[https://developer.mozilla.org/pt-BR/docs/Web/HTTP/Headers/Content-Type](https://developer.mozilla.org/pt-BR/docs/Web/HTTP/Headers/Content-Type)>. Acesso em 24 de Agosto de 2024.
- Mozilla Contributors. (2023). HTTPS. MDN Web Docs. Disponível em: <[https://developer.mozilla.org/pt-BR/docs/Glossary/HTTPS](https://developer.mozilla.org/pt-BR/docs/Glossary/HTTPS)>. Acesso em 24 de Agosto de 2024.
- Mozilla Contributors. (2023). HTTP Status 200. MDN Web Docs. Disponível em: <[https://developer.mozilla.org/pt-BR/docs/Web/HTTP/Status/200](https://developer.mozilla.org/pt-BR/docs/Web/HTTP/Status/200)>. Acesso em 24 de Agosto de 2024.
- Mozilla Contributors. (2023). HTTP Status 400. MDN Web Docs. Disponível em: <[https://developer.mozilla.org/pt-BR/docs/Web/HTTP/Status/400](https://developer.mozilla.org/pt-BR/docs/Web/HTTP/Status/400)>. Acesso em 24 de Agosto de 2024.
- Mozilla Contributors. (2023). HTTP Status 301. MDN Web Docs. Disponível em: <[https://developer.mozilla.org/pt-BR/docs/Web/HTTP/Status/301](https://developer.mozilla.org/pt-BR/docs/Web/HTTP/Status/301)>. Acesso em 24 de Agosto de 2024.
- Mozilla Contributors. (2023). HTTP Method PUT. MDN Web Docs. Disponível em: <[https://developer.mozilla.org/pt-BR/docs/Web/HTTP/Methods/PUT](https://developer.mozilla.org/pt-BR/docs/Web/HTTP/Methods/PUT)>. Acesso em 24 de Agosto de 2024.
- Mozilla Contributors. (2023). HTTP Method HEAD. MDN Web Docs. Disponível em: <[https://developer.mozilla.org/pt-BR/docs/Web/HTTP/Methods/HEAD](https://developer.mozilla.org/pt-BR/docs/Web/HTTP/Methods/HEAD)>. Acesso em 24 de Agosto de 2024.
- Mozilla Contributors. (2023). HTTP Method POST. MDN Web Docs. Disponível em: <[https://developer.mozilla.org/pt-BR/docs/Web/HTTP/Methods/POST](https://developer.mozilla.org/pt-BR/docs/Web/HTTP/Methods/POST)>. Acesso em 24 de Agosto de 2024.
- RFC 5789 - PATCH Method for HTTP. (2010). Disponível em: <[https://datatracker.ietf.org/doc/html/rfc5789#section-2](https://datatracker.ietf.org/doc/html/rfc5789#section-2)>. Acesso em 24 de Agosto de 2024.
- Mozilla Contributors. (2023). HTTP Method PATCH. MDN Web Docs. Disponível em: <[https://developer.mozilla.org/pt-BR/docs/Web/HTTP/Methods/PATCH](https://developer.mozilla.org/pt-BR/docs/Web/HTTP/Methods/PATCH)>. Acesso em 26 de Agosto de 2024.
- Fielding, Roy Thomas. Architectural Styles and the Design of Network-based Software Architectures. Doctoral dissertation, University of California, Irvine, 2000. Disponível em: <[https://www.ics.uci.edu/~fielding/pubs/dissertation/fielding_dissertation.pdf](https://www.ics.uci.edu/~fielding/pubs/dissertation/fielding_dissertation.pdf)>. Acesso em 26 de Agosto de 2024.
- Richardson, Leonard (2008). "Justice Will Take Us Millions of Intricate Moves". Act Three: The Maturity Heuristic. Disponível em: <[https://www.crummy.com/writing/speaking/2008-QCon/act3.html](https://www.crummy.com/writing/speaking/2008-QCon/act3.html)>. Acesso em 26 de Agosto de 2024.

<h2 id="questoes">Questões</h2>
  
<h3 id="questao-q1">Questão 01</h3>

Qual das seguintes afirmativas sobre o protocolo HTTP (Hypertext Transfer
Protocol) está correta?

<h4 id="alternativas-q1">Alternativas</h4>

- (A) HTTP é um protocolo de comunicação que funciona apenas na camada de rede
do modelo OSI.

- (B) O HTTP permite a comunicação entre cliente e servidor usando pacotes de
dados criptografados por padrão.

- ***(C) O HTTP utiliza o modelo cliente-servidor para a troca de mensagens e
opera tipicamente na camada de aplicação do modelo OSI.***

- (D) O HTTP é um protocolo que requer uma conexão constante e de longa duração
entre cliente e servidor.

- (E) O HTTP é um protocolo orientado à conexão que garante a entrega de
pacotes na ordem correta.

<h4 id="resposta-q1">Resposta</h4>

```palin
(C) O HTTP utiliza o modelo cliente-servidor para a troca de mensagens e opera
tipicamente na camada de aplicação do modelo OSI.
```

<h4 id="justificativa-q1">Justificativa</h4>

```plain
De acordo com a documentação da MDN Web Docs (2023), o HTTP (Hypertext Transfer
Protocol) opera na camada de aplicação do modelo OSI e utiliza o modelo
cliente-servidor para a troca de mensagens.
```

<h3 id="questao-q2">Questão 02</h3>

Qual dos seguintes cabeçalhos HTTP é usado para especificar o tipo de mídia do
corpo da resposta, informando ao cliente o formato dos dados recebidos?

<h4 id="alternativas-q2">Alternativas</h4>

- (A) Content-Length

- (B) Accept

- ***(C) Content-Type***

- (D) Authorization

- (E) Location

<h4 id="resposta-q2">Resposta</h4>

```palin
(C) Content-Type
```

<h4 id="justificativa-q2">Justificativa</h4>

```plain
De acordo com a MDN Web Docs, "Em respostas, o Content-Type diz para o cliente
qual é o tipo de conteúdo que a resposta, de fato, tem" (Mozilla Contributors,
2023).
```

<h3 id="questao-q3">Questão 03</h3>

Qual das seguintes afirmações sobre HTTPS (Hypertext Transfer Protocol Secure)
é verdadeira?

<h4 id="alternativas-q3">Alternativas</h4>

- (A) HTTPS é uma extensão do HTTP que utiliza a criptografia AES para proteger
a comunicação, mas não fornece autenticação do servidor.

- ***(B) HTTPS opera sobre a camada de transporte do modelo OSI e utiliza
criptografia SSL/TLS para garantir a segurança da comunicação entre cliente e
servidor.***

- (C) HTTPS é um protocolo que utiliza a criptografia somente para o
armazenamento de dados no servidor, e não para a transmissão de dados entre
cliente e servidor.

- (D) HTTPS é um protocolo de comunicação que é mais rápido que HTTP porque
elimina a necessidade de criptografia e autenticação.

- (E) HTTPS não é compatível com certificados digitais e, portanto, não pode
validar a identidade do servidor.

<h4 id="resposta-q3">Resposta</h4>

```palin
(B) HTTPS opera sobre a camada de transporte do modelo OSI e utiliza
criptografia SSL/TLS para garantir a segurança da comunicação entre cliente e
servidor.
```

<h4 id="justificativa-q3">Justificativa</h4>

```plain
Embora o HTTP opere na camada de aplicação, o HTTPS utiliza TLS/SSL para
garantir a segurança da comunicação, e esse processo ocorre entre a camada de
transporte (TCP) e a camada de aplicação. De acordo com a MDN Web Docs, "HTTPS
(HTTP Secure) é uma versão do protocolo HTTP criptografado. É normalmente usado
SSL ou TLS para criptografar toda a comunicação entre um cliente e um servidor"
(Mozilla Contributors, 2023).
```

<h3 id="questao-q4">Questão 04</h3>

Qual dos seguintes códigos de status HTTP indica que a solicitação foi
bem-sucedida e que a resposta contém a representação solicitada do recurso?

<h4 id="alternativas-q4">Alternativas</h4>

- (A) 301 Moved Permanently

- (B) 404 Not Found

- (C) 500 Internal Server Error

- ***(D) 200 OK***

- (E) 401 Unauthorized

<h4 id="resposta-q4">Resposta</h4>

```palin
(D) 200 OK
```

<h4 id="justificativa-q4">Justificativa</h4>

```plain
De acordo com a MDN Web Docs, "O código HTTP 200 OK é a resposta de status de
sucesso que indica que a requisição foi bem sucedida." (Mozilla Contributors,
2023).
```

<h3 id="questao-q5">Questão 05</h3>

Qual dos seguintes códigos de status HTTP é apropriado para uma resposta quando
um cliente envia uma solicitação que está faltando dados essenciais, e o
servidor não pode processar a solicitação devido a essa falta de informações?

<h4 id="alternativas-q5">Alternativas</h4>

- ***(A) 400 Bad Request***

- (B) 403 Forbidden

- (C) 422 Unprocessable Entity

- (D) 405 Method Not Allowed

- (E) 409 Conflict

<h4 id="resposta-q5">Resposta</h4>

```palin
(A) 400 Bad Request
```

<h4 id="justificativa-q5">Justificativa</h4>

```plain
O código de status HTTP 400 Bad Request é apropriado quando a solicitação do
cliente está malformada ou falta dados essenciais, e o servidor não consegue
processar a solicitação devido a essas falhas. Segundo a MDN Web Docs, "O
código de status HTTP 400 Bad Request indica que o servidor não pode ou não irá
processar a solicitação devido a um erro do cliente" (Mozilla Contributors,
2023).
```

<h3 id="questao-q6">Questão 06</h3>

Em um cenário onde um cliente tenta acessar um recurso que foi removido e o
servidor deseja informar ao cliente que o recurso foi movido permanentemente
para uma nova URL, qual código de status HTTP deve ser retornado?

<h4 id="alternativas-q6">Alternativas</h4>

- (A) 410 Gone

- ***(B) 301 Moved Permanently***

- (C) 302 Found

- (D) 307 Temporary Redirect

- (E) 403 Forbidden 

<h4 id="resposta-q6">Resposta</h4>

```palin
(B) 301 Moved Permanently
```

<h4 id="justificativa-q6">Justificativa</h4>

```plain
Segundo a MDN Web Docs, "O código de resposta de status de redirecionamento 301
Moved Permanently do protocolo HTTP indica que o recurso requisitado foi movido
permanentemente para a URL dada pelo cabeçalho Localização headers."
(Mozilla Contributors, 2023).
```

<h3 id="questao-q7">Questão 07</h3>

No contexto do protocolo HTTP, qual das seguintes afirmações é verdadeira sobre
os métodos de requisição e suas respectivas semânticas?

<h4 id="alternativas-q7">Alternativas</h4>

- ***(A) O método HTTP PUT é utilizado para enviar uma nova representação de um
recurso existente, e o método POST é utilizado para criar um novo recurso no
servidor.***

- (B) O método HTTP GET é usado para enviar dados ao servidor, enquanto o
método DELETE é utilizado para recuperar informações de um recurso especificado

- (C) O método HTTP PATCH é utilizado para substituir completamente o recurso
de destino, enquanto o método OPTIONS é usado para modificar parcialmente um
recurso.

- (D) O método HTTP HEAD é semelhante ao método GET, mas não retorna o corpo da
resposta, enquanto o método PUT é utilizado para atualizar parcialmente um
recurso no servidor.

- (E) O método HTTP TRACE é utilizado para depurar a comunicação entre cliente
e servidor, retornando o conteúdo da requisição no corpo da resposta, enquanto
o método PUT é usado para enviar uma nova representação de um recurso ao
servidor.

<h4 id="resposta-q7">Resposta</h4>

```palin
(A) O método HTTP PUT é utilizado para enviar uma nova representação de um
recurso existente, e o método POST é utilizado para criar um novo recurso no 
servidor.
```

<h4 id="justificativa-q7">Justificativa</h4>

```plain
O método HTTP PUT é utilizado para enviar uma nova representação de um recurso
existente ou criar um novo recurso em uma URL específica, substituindo a
representação anterior. Por outro lado, o método POST é utilizado para criar um
novo recurso no servidor, geralmente enviando dados que serão processados para
criar uma nova entrada. De acordo com a MDN Web Docs, "O método de requisição
HTTP PUT cria um novo recurso ou substitui uma representação do recurso de
destino com os novos dados. A diferença entre PUT e POST é que PUT é
idempotente, ou seja, chamá-lo várias vezes terá o mesmo efeito"(Mozilla
Contributors, 2023).
```

<h3 id="questao-q8">Questão 08</h3>

Qual dos seguintes métodos HTTP é utilizado para obter informações sobre um 
recurso sem modificar seu estado e é semelhante ao método GET, mas não inclui o
corpo da resposta?

<h4 id="alternativas-q8">Alternativas</h4>

- (A) PUT

- (B) POST

- (C) OPTIONS

- ***(D) HEAD***

- (E) PATCH

<h4 id="resposta-q8">Resposta</h4>

```palin
(D) HEAD
```

<h4 id="justificativa-q8">Justificativa</h4>

```plain
De acordo com a MDN Web Docs, "O método HTTP HEAD solicita os cabeçalhos
retornados de um recurso específico que foi requisitado por um método HTTP GET.
Tal solicitação pode ser feita antes de baixar um grande recurso para
economizar largura de banda, por exemplo. Uma resposta para um método HEAD não
deve ter um corpo. Se tiver, deve ser ignorado." (Mozilla Contributors, 2023).
```

<h3 id="questao-q9">Questão 09</h3>

Qual dos seguintes métodos HTTP é projetado para enviar dados ao servidor para
criar um novo recurso e, geralmente, deve ser usado quando se deseja submeter
dados para processamento, como em um formulário de web?

<h4 id="alternativas-q9">Alternativas</h4>

- (A) GET

- (B) DELETE

- (C) PUT

- ***(D) POST*** 

- (E) OPTIONS

<h4 id="resposta-q9">Resposta</h4>

```palin
(D) POST
```

<h4 id="justificativa-q9">Justificativa</h4>

```plain
De acordo com a MDN Web Docs, "O método HTTP POST envia dados ao servidor.
[...] Uma solicitação POST geralmente é enviada por meio de um formulário HTML
e resulta em uma alteração no servidor." (Mozilla Contributors, 2023).
```

<h3 id="questao-q10">Questão 10</h3>

Considere os seguintes métodos HTTP. Qual deles é corretamente descrito pela
seguinte afirmação: "Este método é utilizado para aplicar modificações parciais
a um recurso existente e deve ser idempotente, significando que realizar a
mesma operação múltiplas vezes deve resultar no mesmo estado final do recurso"?

<h4 id="alternativas-q10">Alternativas</h4>

- (A) PUT

- (B) POST

- (C) DELETE

- (D) PATCH

- (E) OPTIONS

<h4 id="resposta-q10">Resposta</h4>

```palin
(N.D.A.) Nenhuma das Alternativas
```

<h4 id="justificativa-q10">Justificativa</h4>

```plain
A RFC 5789 especifica que:

    "The PATCH method requests that a set of changes described in the request
    entity be applied to the resource identified by the Request-URI. The set of
    changes is represented in a format called a 'patch document' identified by
    a media type. [...] PATCH is neither safe nor idempotent as defined by
    [RFC2616], Section 9.1. A PATCH request can be issued in such a way as to
    be idempotent, which also helps prevent bad outcomes from collisions
    between two PATCH requests on the same resource in a similar time frame."
    (RFC 5789, Section 2).

Portanto, a afirmação correta seria:

    PATCH é utilizado para aplicar modificações parciais a um recurso. Apesar
    de não ser garantidamente idempotente, o método pode ser implementado de
    forma a ser idempotente, mas isso não é uma exigência obrigatória.

    PUT é utilizado para substituir um recurso inteiro e é garantidamente
    idempotente, significando que múltiplas requisições PUT idênticas terão o
    mesmo efeito que uma única requisição.

Logo, com base na descrição fornecida, nenhuma das alternativas é completamente 
correta. A questão pode ser considerada ambígua e pode precisar ser revisada ou 
anulada, pois a descrição se refere a um comportamento de PATCH que não é
garantido por padrão.
```

<h3 id="questao-q11">Questão 11</h3>

Considere os métodos HTTP a seguir e suas descrições. Qual afirmação 
corretamente descreve a diferença entre os métodos PUT e PATCH em termos de
suas operações e características?

<h4 id="alternativas-q11">Alternativas</h4>

- (A) O método PUT é usado para criar um novo recurso em uma localização
especificada, enquanto o método PATCH substitui completamente o recurso
existente com uma nova representação.

- (B) O método PATCH é utilizado para substituir um recurso completo no
servidor, enquanto o método PUT é usado para enviar uma modificação parcial ao
recurso existente.

- ***(C) O método PUT substitui completamente o recurso existente com uma nova
representação fornecida pelo cliente, enquanto o método PATCH aplica
alterações parciais ao recurso existente.***

- (D) O método PATCH cria um novo recurso no servidor com base nos dados 
enviados, enquanto o método PUT é usado para recuperar informações sobre um
recurso sem alterá-lo.

- (E) O método PUT retorna o estado atual do recurso após a modificação,
enquanto o método PATCH não fornece nenhum feedback sobre o estado do recurso
após a operação.

<h4 id="resposta-q11">Resposta</h4>

```palin
(C) O método PUT substitui completamente o recurso existente com uma nova
representação fornecida pelo cliente, enquanto o método PATCH aplica
alterações parciais ao recurso existente.
```

<h4 id="justificativa-q11">Justificativa</h4>

```plain
De acordo com a MDN Web Docs, "O método de requisição HTTP PATCH aplica
modificações parciais a um recurso.O método HTTP PUT permite apenas
substituições completas de um documento."(Mozilla Contributors, 2023).
```

<h3 id="questao-q12">Questão 12</h3>

Qual das seguintes afirmações descreve corretamente o conceito de "stateless"
em uma API RESTful?

<h4 id="alternativas-q12">Alternativas</h4>

- (A) Em uma API RESTful, "stateless" significa que o servidor armazena o
estado da sessão do cliente entre diferentes requisições.

- ***(B) Em uma API RESTful, "stateless" implica que o cliente deve enviar 
todas as informações necessárias para processar a requisição em cada 
solicitação, pois o servidor não armazena nenhum estado entre as
requisições.***

- (C) Em uma API RESTful, "stateless" significa que o servidor mantém o estado
global da aplicação, mas não o estado específico do cliente.

- (D) Em uma API RESTful, "stateless" permite que o servidor armazene dados
temporários para melhorar o desempenho das requisições frequentes do mesmo
cliente.

- (E) Em uma API RESTful, "stateless" indica que a comunicação entre cliente e
servidor é realizada usando uma conexão persistente durante a duração da
sessão.

<h4 id="resposta-q12">Resposta</h4>

```palin
(B) Em uma API RESTful, "stateless" implica que o cliente deve enviar todas as
informações necessárias para processar a requisição em cada solicitação,
pois o servidor não armazena nenhum estado entre as requisições.
```

<h4 id="justificativa-q12">Justificativa</h4>

```plain
Segundo Fielding (2000), no estilo arquitetural "client-stateless-server" 
(CSS), que é derivado do modelo cliente-servidor, o servidor não armazena o 
estado da sessão entre as requisições. Isso significa que cada solicitação 
enviada pelo cliente ao servidor deve conter todas as informações necessárias 
para ser processada, sem depender de qualquer contexto previamente armazenado 
no servidor. O estado da sessão é mantido exclusivamente no lado do cliente. 
Fielding explica: 
    "The client-stateless-server style derives from client-server with the 
    additional constraint that no session state is allowed on the server 
    component. Each request from client to server must contain all of the 
    information necessary to understand the request, and cannot take 
    advantage of any stored context on the server. Session state is kept 
    entirely on the client." (Fielding, 2000, p. 47)
```

<h3 id="questao-q13">Questão 13</h3>

Qual das seguintes características é uma boa prática recomendada ao projetar 
endpoints em uma API RESTful?

<h4 id="alternativas-q13">Alternativas</h4>

- ***(A) Utilizar métodos HTTP diferentes para operações CRUD em um único 
endpoint.***

- (B) Usar URLs dinâmicas e variáveis de consulta para criar endpoints de 
recursos, permitindo flexibilidade ilimitada na estrutura dos recursos.

- ***(C) Projetar endpoints que representam recursos e suas coleções usando 
URLs hierárquicas e manter a consistência no uso dos métodos HTTP.***

- (D) Permitir que todos os endpoints aceitem e retornem todos os formatos de 
dados possíveis, sem especificar um formato padrão.

- (E) Implementar um sistema de autenticação e autorização dentro dos 
próprios endpoints de recursos, ao invés de utilizar um mecanismo 
centralizado.

<h4 id="resposta-q13">Resposta</h4>

```palin
(A) Utilizar métodos HTTP diferentes para operações CRUD em um único 
endpoint.
(C) Projetar endpoints que representam recursos e suas coleções usando URLs 
hierárquicas e manter a consistência no uso dos métodos HTTP.
```

<h4 id="justificativa-q13">Justificativa</h4>

```plain
Ao projetar endpoints para uma API RESTful, é crucial seguir práticas que 
assegurem uma arquitetura clara e eficiente, conforme os princípios 
estabelecidos por Roy Fielding em sua dissertação. Fielding define um recurso 
como um "mapeamento conceitual para um conjunto de entidades", e a semântica 
desse mapeamento deve permanecer constante para garantir a distinção entre 
recursos (Fielding, 2000).

Neste contexto, a utilização de métodos HTTP distintos para operações CRUD em 
um único endpoint (Alternativa A) e a adoção de URLs hierárquicas para 
representar recursos e suas coleções (Alternativa C) são práticas que 
alinham-se com as diretrizes de Fielding. O uso de métodos HTTP apropriados 
para diferentes operações permite uma interação clara e semântica com os 
recursos, enquanto URLs hierárquicas proporcionam uma estrutura organizada e 
intuitiva para a identificação dos recursos e suas coleções.
```

<h3 id="questao-q14">Questão 14</h3>

No contexto do Modelo de Maturidade de Richardson, qual das seguintes 
características é típica de uma API que está no Nível 1 de maturidade?

<h4 id="alternativas-q14">Alternativas</h4>

- (A) A API utiliza múltiplos métodos HTTP (GET, POST, PUT, DELETE) e fornece 
URLs hierárquicas para representar diferentes recursos.

- (B) A API retorna códigos de status HTTP apropriados para indicar o 
resultado das operações e utiliza URLs para representar recursos e suas 
coleções.

- ***(C) A API faz uso de um único método HTTP (geralmente POST) e um único 
endpoint para todas as operações, sem distinguir entre diferentes tipos de 
operações.***

- (D) A API implementa HATEOAS, fornecendo links dinâmicos que permitem ao 
cliente descobrir e navegar entre diferentes recursos e operações.

- (E) A API permite a autenticação e autorização baseada em tokens e 
implementa suporte para consultas avançadas e paginação de resultados.

<h4 id="resposta-q14">Resposta</h4>

```palin
(C) A API faz uso de um único método HTTP (geralmente POST) e um único 
endpoint para todas as operações, sem distinguir entre diferentes tipos de 
operações.
```

<h4 id="justificativa-q14">Justificativa</h4>

```plain
De acordo com o Modelo de Maturidade de Richardson (2008), APIs no Nível 1 
são caracterizadas por utilizar um único método HTTP, frequentemente POST,
para todas as operações. Nesse nível, a API não explora amplamente o uso dos 
métodos HTTP para diferenciar operações (como GET, PUT, DELETE) nem adota 
URLs hierárquicas para representar diferentes recursos. Essas práticas são 
desenvolvidas nos níveis seguintes do modelo, que introduzem uma estrutura 
mais detalhada e uma representação mais clara dos recursos.
```

<h3 id="questao-q15">Questão 15</h3>

Qual é uma limitação comum das APIs que operam no Nível 1 do Modelo de 
Maturidade de Richardson?

<h4 id="alternativas-q15">Alternativas</h4>

- (A) Falta de suporte para operações de CRUD (Criar, Ler, Atualizar, 
Excluir) através de métodos HTTP distintos e URLs específicas.

- (B) Implementação de HATEOAS, fornecendo links dinâmicos que permitem ao 
cliente navegar entre diferentes recursos e operações.

- (C) Uso de múltiplos métodos HTTP para operações diferentes e fornecimento 
de URLs hierárquicas para representar recursos e suas coleções.

- ***(D) Utilização de URLs genéricas e um único método HTTP para todas as 
operações, que pode dificultar a identificação e a manipulação específica dos 
recursos.***

- (E) Retorno de códigos de status HTTP apropriados e consistentes para 
indicar o resultado das operações.

<h4 id="resposta-q15">Resposta</h4>

```palin
(D) Utilização de URLs genéricas e um único método HTTP para todas as 
operações, que pode dificultar a identificação e a manipulação específica dos 
recursos.
```

<h4 id="justificativa-q15">Justificativa</h4>

```plain
A limitação das APIs no Nível 1 do Modelo de Maturidade de Richardson (2008) 
está no uso inadequado dos métodos HTTP e das URLs para representar operações 
em recursos. Nessa abordagem, é comum que as operações de CRUD sejam 
realizadas utilizando um único método HTTP (como POST) para todas as ações, 
ou que diferentes operações sejam mapeadas para diferentes URLs (exemplo: 
/produtos/update para atualização), o que viola as práticas RESTful.
```

<h3 id="questao-q16">Questão 16</h3>

No Modelo de Maturidade de Richardson para APIs RESTful, qual é a principal 
característica que distingue o Nível 2 do Nível 1?

<h4 id="alternativas-q16">Alternativas</h4>

- (A) No Nível 2, a API usa URLs bem definidas para recursos e métodos HTTP, 
enquanto no Nível 1 a API utiliza URLs genéricas e um único método HTTP.

- (B) No Nível 2, a API implementa autenticação e autorização baseada em 
tokens, enquanto no Nível 1 a API não utiliza nenhum mecanismo de segurança.

- ***(C) No Nível 2, a API utiliza métodos HTTP corretamente (GET, POST, PUT,
DELETE) e usa códigos de status HTTP apropriados para indicar o resultado das
operações, enquanto no Nível 1 a API faz uso de um único método HTTP para 
todas as operações.***

- (D) No Nível 2, a API utiliza apenas um formato de resposta, enquanto no
Nível 1 a API é capaz de lidar com múltiplos formatos de resposta, como JSON 
e XML.

- (E) No Nível 2, a API implementa suporte para consultas avançadas e paginação
de resultados, enquanto
no Nível 1 a API não oferece suporte a essas funcionalidades.

<h4 id="resposta-q16">Resposta</h4>

```palin
(C) No Nível 2, a API utiliza métodos HTTP corretamente (GET, POST, PUT,
DELETE) e usa códigos de status HTTP apropriados para indicar o resultado das
operações, enquanto no Nível 1 a API faz uso de um único método HTTP para 
todas as operações.
```

<h4 id="justificativa-q16">Justificativa</h4>

```plain
O Nível 2 do Modelo de Maturidade de Richardson se distingue do Nível 1 pela 
adoção correta dos métodos HTTP (GET, POST, PUT, DELETE) para suas 
respectivas operações e pelo uso de códigos de status HTTP adequados. No 
Nível 1, as APIs podem até usar diferentes métodos HTTP, mas geralmente de 
forma inconsistente ou inadequada, e com URLs que não seguem padrões RESTful. 
No Nível 2, essas práticas são ajustadas para aderir aos princípios REST, 
proporcionando uma interface mais clara e semântica.
```
