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
| [10](#questao-q10) | **N.D.A.**   | <p>A RFC 5789, na seção 2, especifica que:</p><blockquote>The PATCH method requests that a set of changes described in the request entity be applied to the resource identified by the Request-URI. The set of changes is represented in a format called a 'patch document' identified by a media type. [...] PATCH is neither safe nor idempotent as defined by [RFC2616], Section 9.1. A PATCH request can be issued in such a way as to be idempotent, which also helps prevent bad outcomes from collisions between two PATCH requests on the same resource in a similar time frame.</blockquote><p>Portanto, a afirmação correta seria: <p>**PATCH** é utilizado para aplicar modificações parciais a um recurso. Apesar de não ser garantidamente idempotente, o método pode ser implementado de forma a ser idempotente, mas isso não é uma exigência obrigatória.</p><p>**PUT** é utilizado para substituir um recurso inteiro e é garantidamente idempotente, significando que múltiplas requisições PUT idênticas terão o mesmo efeito que uma única requisição.</p><p> Logo, com base na descrição fornecida, **nenhuma das alternativas é completamente correta.** A questão pode ser considerada ambígua e pode precisar ser revisada ou anulada, pois a descrição se refere a um comportamento de PATCH que não é garantido por padrão.</p>
| [11](#questao-q11) | C            | De acordo com a MDN Web Docs, "O método de requisição HTTP PATCH aplica modificações parciais a um recurso. O método HTTP PUT permite apenas substituições completas de um documento."(Mozilla Contributors, 2023).
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

- Mozilla Contributors. (2023). HTTP. MDN Web Docs. Disponível em: <[https://developer.mozilla.org/pt-BR/docs/Web/HTTP](https://developer.mozilla.org/pt-BR/docs/Web/HTTP)>. Acesso em 24 de Agosto de 2024.
- Mozilla Contributors. (2023). Content-Type. MDN Web Docs. Disponível em: <[https://developer.mozilla.org/pt-BR/docs/Web/HTTP/Headers/Content-Type](https://developer.mozilla.org/pt-BR/docs/Web/HTTP/Headers/Content-Type)>. Acesso em 24 de Agosto de 2024.
- Mozilla Contributors. (2023). HTTPS. MDN Web Docs. Disponível em: <[https://developer.mozilla.org/pt-BR/docs/Glossary/HTTPS](https://developer.mozilla.org/pt-BR/docs/Glossary/HTTPS)>. Acesso em 24 de Agosto de 2024.
- Mozilla Contributors. (2023). HTTP Status 200. MDN Web Docs. Disponível em: <[https://developer.mozilla.org/pt-BR/docs/Web/HTTP/Status/200](https://developer.mozilla.org/pt-BR/docs/Web/HTTP/Status/200)>. Acesso em 24 de Agosto de 2024.
- Mozilla Contributors. (2023). HTTP Status 400. MDN Web Docs. Disponível em: <[https://developer.mozilla.org/pt-BR/docs/Web/HTTP/Status/400](https://developer.mozilla.org/pt-BR/docs/Web/HTTP/Status/400)>. Acesso em 24 de Agosto de 2024.
- Mozilla Contributors. (2023). HTTP Status 301. MDN Web Docs. Disponível em: <[https://developer.mozilla.org/pt-BR/docs/Web/HTTP/Status/301](https://developer.mozilla.org/pt-BR/docs/Web/HTTP/Status/301)>. Acesso em 24 de Agosto de 2024.
- Mozilla Contributors. (2023). HTTP Method PUT. MDN Web Docs. Disponível em: <[https://developer.mozilla.org/pt-BR/docs/Web/HTTP/Methods/PUT](https://developer.mozilla.org/pt-BR/docs/Web/HTTP/Methods/PUT)>. Acesso em 24 de Agosto de 2024.
- Mozilla Contributors. (2023). HTTP Method HEAD. MDN Web Docs. Disponível em: <[https://developer.mozilla.org/pt-BR/docs/Web/HTTP/Methods/HEAD](https://developer.mozilla.org/pt-BR/docs/Web/HTTP/Methods/HEAD)>. Acesso em 24 de Agosto de 2024.
- Mozilla Contributors. (2023). HTTP Method POST. MDN Web Docs. Disponível em: <[https://developer.mozilla.org/pt-BR/docs/Web/HTTP/Methods/POST](https://developer.mozilla.org/pt-BR/docs/Web/HTTP/Methods/POST)>. Acesso em 24 de Agosto de 2024.
- RFC 5789 - PATCH Method for HTTP. (2010): Semantics and Content. Section 2.
Disponível em: <[https://datatracker.ietf.org/doc/html/rfc5789#section-2](https://datatracker.ietf.org/doc/html/rfc5789#section-2)>. Acesso em 24 de Agosto de 2024.
- Mozilla Contributors. (2023). HTTP Method PATCH. MDN Web Docs. Disponível em: <[https://developer.mozilla.org/pt-BR/docs/Web/HTTP/Methods/PATCH](https://developer.mozilla.org/pt-BR/docs/Web/HTTP/Methods/PATCH)>. Acesso em 26 de Agosto de 2024.

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

Conclusão:

Com base na descrição fornecida, nenhuma das alternativas é completamente
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

- (C) O método PUT substitui completamente o recurso existente com uma nova
representação fornecida pelo cliente, enquanto o método PATCH aplica
alterações parciais ao recurso existente.

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