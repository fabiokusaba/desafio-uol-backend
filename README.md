## Desafio Backend UOL - Java & SpringBoot

Projeto desenvolvido para atender os requisitos do desafio Backend UOL, foram utilizadas as seguintes tecnologias:
* Java
* Spring Web
* Spring Data JPA
* Lombok
* Validation
* H2 Database - Banco de dados em memória

## Modo de uso
* Clone o repositório no Github
* Abra a pasta na IDE de sua preferência
* Acesse: `http://localhost:8080/players`

## Rotas disponíveis
* GET: listar todos os usuários cadastrados
* POST: cadastrar um novo usuário passando no corpo da requisição os seguintes dados: nome e email como campos obrigatórios, telefone, tipo de grupo (JUSTICE_LEAGUE, AVENGERS)

## Considerações
O projeto foi desenvolvido seguindo as boas práticas de desenvolvimento e padrões de projeto com divisão em camadas, foi feita a tratativa de erro quando o grupo estiver totalmente preenchido e ainda foi utilizado handler para acessar um link externo e assim obter informações do codinome dos heróis de cada grupo.
