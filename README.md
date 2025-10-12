# Cadastro de corridas
Pequeno sistema para cadastro de algumas informações de corridas

## Tarefas 
<ol>
  <li>Edição das corridas ocultas</li>
  <li>Alguma função de relacionamento</li>
  <li>Adição de usuario</li>
  <li>Login e cadastro de usuario</li>
  <li>* Segurança: administrador</li>
</ol>

```mermaid
classDiagram
    class Usuario {
        -int id
        -String nome
        -String email
        -String senha
        -String perfil
        +login(email, senha)
        +logout()
    }

    class Roteiro {
        -int id
        -String titulo
        -String descricao
        -Usuario autor
        +criarRoteiro()
        +editarRoteiro()
        +excluirRoteiro()
    }

    class PontoTuristico {
        -int id
        -String nome
        -String descricao
        -String localizacao
        +adicionarPonto()
        +removerPonto()
    }

    class Interceptador {
        +preHandle()
    }

    Usuario "1" -- "0..*" Roteiro : cria
    Roteiro "1" -- "1..*" PontoTuristico : contém
    Interceptador -- Usuario : verificaAutenticacao
```
