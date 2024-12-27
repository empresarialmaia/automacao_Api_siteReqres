# Automação de Testes de API com RestAssured, Java e JUnit

Este projeto utiliza RestAssured, Java, JUnit e Jackson Databind para a automação de testes de APIs RESTful com base no site [Reqres](https://reqres.in/) de APIs RESTful. 
O principal objetivo é validar os endpoints da aplicação, assegurando que funcionem conforme o esperado.


## Tecnologias utilizadas
- **Java:** Linguagem de programação utilizada para desenvolver os scripts de teste e interagir com a aplicação web.
- **RestAssured:** Biblioteca para automação de testes de APIs RESTful, que facilita a escrita de testes em Java.
- **JUnit:** Framework para testes unitários em Java, utilizado para estruturar e executar testes que verificam partes específicas do código.
- **Jackson Databind:**  Biblioteca utilizada para serializar e desserializar objetos Java para JSON e vice-versa, facilitando o manuseio de dados em APIs RESTful.

## Tecnologias necessárias
Este projeto de automação requer as seguintes tecnologias:
- **Git:** Sistema de controle de versão utilizado para gerenciar o código fonte do projeto.
- **Java:** Linguagem de programação.
- **Maven:** Ferramenta de automação de construção e gerenciamento de dependências, essencial para organizar, compilar, testar e construir projetos de software, incluindo projetos de automação.

## Clonando o repositório
Abra o terminal ou prompt de comando em seu computador, e utilize o comando **git clone** seguido da **URL** do repositório.
- **git clone https://github.com/empresarialmaia/automacao_Api_siteReqres.git**
- **cd automacao_Api_siteReqres**

## Como executar os testes
Após clonar o repositório, instale as dependências e execute os testes.
- **mvn clean install**

Para rodar todos os testes:
- **mvn test**
  
Para rodar testes específicos, use o comando:
- **mvn test -Dtest=NomeDaClasseDeTeste**

Os testes definidos serão executados, e você poderá ver o resultado diretamente no terminal.

