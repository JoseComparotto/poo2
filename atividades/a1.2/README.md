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
|  [7](#questao-q7)  |              |	
|  [8](#questao-q8)  |              | 
|  [9](#questao-q9)  |              | 
| [10](#questao-q10) |              | 
| [11](#questao-q11) |              | 
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

<h2 id="questoes">Questões</h2>
  
<h3 id="questao-q1">Questão 01</h3>

Qual das seguintes afirmativas sobre o protocolo HTTP (Hypertext Transfer Protocol) está correta?

<h4 id="alternativas-q1">Alternativas</h4>

- (A) HTTP é um protocolo de comunicação que funciona apenas na camada de rede do modelo OSI.

- (B) O HTTP permite a comunicação entre cliente e servidor usando pacotes de dados criptografados por padrão.

- ***(C) O HTTP utiliza o modelo cliente-servidor para a troca de mensagens e opera tipicamente na camada de aplicação do modelo OSI.***

- (D) O HTTP é um protocolo que requer uma conexão constante e de longa duração entre cliente e servidor.

- (E) O HTTP é um protocolo orientado à conexão que garante a entrega de pacotes na ordem correta.

<h4 id="resposta-q1">Resposta</h4>

```palin
(C) O HTTP utiliza o modelo cliente-servidor para a troca de mensagens e opera tipicamente na camada de aplicação do modelo OSI.
```

<h4 id="justificativa-q1">Justificativa</h4>

```plain
De acordo com a documentação da MDN Web Docs (2023), o HTTP (Hypertext Transfer Protocol) opera na camada de aplicação do modelo OSI e utiliza o modelo cliente-servidor para a troca de mensagens.
```

<h3 id="questao-q2">Questão 02</h3>

Qual dos seguintes cabeçalhos HTTP é usado para especificar o tipo de mídia do corpo da resposta, informando ao cliente o formato dos dados recebidos?

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
De acordo com a MDN Web Docs, "Em respostas, o Content-Type diz para o cliente qual é o tipo de conteúdo que a resposta, de fato, tem" (Mozilla Contributors, 2023).
```

<h3 id="questao-q3">Questão 03</h3>

Qual das seguintes afirmações sobre HTTPS (Hypertext Transfer Protocol Secure) é verdadeira?

<h4 id="alternativas-q3">Alternativas</h4>

- (A) HTTPS é uma extensão do HTTP que utiliza a criptografia AES para proteger a comunicação, mas não fornece autenticação do servidor.

- ***(B) HTTPS opera sobre a camada de transporte do modelo OSI e utiliza criptografia SSL/TLS para garantir a segurança da comunicação entre cliente e servidor.***

- (C) HTTPS é um protocolo que utiliza a criptografia somente para o armazenamento de dados no servidor, e não para a transmissão de dados entre cliente e servidor.

- (D) HTTPS é um protocolo de comunicação que é mais rápido que HTTP porque elimina a necessidade de criptografia e autenticação.

- (E) HTTPS não é compatível com certificados digitais e, portanto, não pode validar a identidade do servidor.

<h4 id="resposta-q3">Resposta</h4>

```palin
(B) HTTPS opera sobre a camada de transporte do modelo OSI e utiliza criptografia SSL/TLS para garantir a segurança da comunicação entre cliente e servidor.
```

<h4 id="justificativa-q3">Justificativa</h4>

```plain
Embora o HTTP opere na camada de aplicação, o HTTPS utiliza TLS/SSL para garantir a segurança da comunicação, e esse processo ocorre entre a camada de transporte (TCP) e a camada de aplicação. De acordo com a MDN Web Docs, "HTTPS (HTTP Secure) é uma versão do protocolo HTTP criptografado. É normalmente usado SSL ou TLS para criptografar toda a comunicação entre um cliente e um servidor" (Mozilla Contributors, 2023).
```

<h3 id="questao-q4">Questão 04</h3>

Qual dos seguintes códigos de status HTTP indica que a solicitação foi bem-sucedida e que a resposta contém a representação solicitada do recurso?

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
De acordo com a MDN Web Docs, "O código HTTP 200 OK é a resposta de status de sucesso que indica que a requisição foi bem sucedida." (Mozilla Contributors, 2023).
```

<h3 id="questao-q5">Questão 05</h3>

Qual dos seguintes códigos de status HTTP é apropriado para uma resposta quando um cliente envia uma solicitação que está faltando dados essenciais, e o servidor não pode processar a solicitação devido a essa falta de informações?

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
O código de status HTTP 400 Bad Request é apropriado quando a solicitação do cliente está malformada ou falta dados essenciais, e o servidor não consegue processar a solicitação devido a essas falhas. Segundo a MDN Web Docs, "O código de status HTTP 400 Bad Request indica que o servidor não pode ou não irá processar a solicitação devido a um erro do cliente" (Mozilla Contributors, 2023).
```

<h3 id="questao-q6">Questão 06</h3>

Em um cenário onde um cliente tenta acessar um recurso que foi removido e o servidor deseja informar ao cliente que o recurso foi movido permanentemente para uma nova URL, qual código de status HTTP deve ser retornado?

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
Segundo a MDN Web Docs, "O código de resposta de status de redirecionamento 301 Moved Permanently do protocolo HTTP indica que o recurso requisitado foi movido permanentemente para a URL dada pelo cabeçalho Localização headers." (Mozilla Contributors, 2023).
```

