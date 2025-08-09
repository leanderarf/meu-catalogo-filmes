# Explicação dos Diagramas

## 1. Diagrama de Casos de Uso
Este diagrama mostra as interações entre os atores (Usuário e Administrador) e o sistema de Catálogo de Filmes.

### Atores:
- **Usuário**: Pode buscar títulos, listar títulos, efetuar login, registrar-se e recuperar senha.
- **Administrador**: Possui todas as funções do usuário e também pode cadastrar títulos, excluir títulos e excluir usuários.

### Casos de uso:
- **Buscar título**: Permite procurar um filme específico pelo nome.
- **Lista títulos**: Exibe todos os títulos disponíveis no catálogo.
- **Recuperar senha**: Processo para redefinir senha esquecida.
- **Efetua login**: Necessário para acessar funções internas.
- **Registrar-se**: Cria um novo usuário no sistema.
- **Cadastrar título (somente administrador)**: Adiciona um novo filme ao catálogo.
- **Excluir título (somente administrador)**: Remove um filme existente.
- **Excluir usuário (somente administrador)**: Remove um usuário do sistema.

Relações:
- `<<extend>>` indica que uma função estende outra, como "Buscar título" estendendo "Lista títulos".
- `<<include>>` indica que uma função inclui outra obrigatoriamente, como "Efetua login" sendo parte do fluxo de "Tela inicial".

---

## 2. Diagrama de Classes
Este diagrama representa a estrutura estática do sistema e os relacionamentos entre as classes.

### Classes:

#### **Filme**
- **Atributos**: idFilme, título, anoLancamento, avaliacao, duracao, genero, sinopse, classificacao.
- **Métodos**: mostraFilme().

#### **Catalogo**
- **Atributos**: filmes (lista de objetos Filme).
- **Métodos**: reproduzirFilme(), listaFilmes(), buscaFilme(), filtrarFilmes().

#### **Usuario**
- **Atributos**: idUsuario, nome, dataNascimento, email, senha, telefone, catalogo.
- **Métodos**: mostraUsuario(), registraUsuario(), efetuaLogin(), recuperarSenha().

#### **Administrador (herda de Usuario)**
- **Métodos**: cadastraFilme(), excluiFilme(), excluiUsuario().

### Relacionamentos:
- Um catálogo pode conter de 0 a vários filmes (0..n).
- Um usuário possui exatamente um catálogo (1..1).
- Administrador herda de Usuário, possuindo todos os atributos e métodos, além de métodos adicionais para administração.

---

## Observações de implementação:
- Encapsular atributos com modificadores de acesso apropriados.
- Métodos administrativos devem verificar permissões antes da execução.
- Possível separação em camadas (entidade, serviço, interface) para maior modularidade.
