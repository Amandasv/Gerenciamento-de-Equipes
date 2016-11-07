#Sistema de Gerenciamento de Equipes por Competências


## Objetivo:

O objetivo deste sistema é criar um sistema para gerenciamento dos projetos de uma empresa, associando funcionários e suas competências às necessidades dos projetos.


## Tarefas:

Desenvolver, utilizando a linguagem de programação Java, um sistema que permita:

- [x] Ler os dados sobre os funcionários e projetos, a partir de arquivos, na inicialização do sistema.
- [x] Permitir ao usuário criar novos projetos, definindo para cada projeto, o seu nome, datas de inicio e fim, e as competências necessárias ao projeto.
- [x] Permitir ao usuário cadastrar novos funcionário, incluindo seu nome, salário e competências.
- [x] Permitir que se exclua projetos.
- [x] Permitir que se exclua funcionários.
- [x] Permitir ao usuário cadastrar novas competências.
- [ ] Permitir ao usuário consultar os projetos ativos.
- [ ] Permitir ao usuário associar funcionários aos projetos.
- [ ] Permitir ao usuário consultar os projetos criados que tem pendências com relação às competências necessárias.
- [ ] Fornecer ao usuário uma sugestão de funcionários para preencher as competências de um projeto com os funcionários disponíveis.
- [ ] Garantir que nenhum funcionário trabalhe em mais de dois projetos ao mesmo tempo.


## Regras para Implementação:

- Nenhuma classe do pacote java.util pode ser utilizada, com excessão da classe Scanner;
- As datas devem ser declaradas utilizando a classe java.time.LocalDate.

## Orientações:
- Lembre-se que é importante implementar corretamente as tarefas. Talvez mais do que implementar todas.
- Lembre-se que cada classe deve ter uma única resposabilidade no sistema.

## Arquivos CSV:

> - competencias.csv: Arquivo que lista as competencias já cadastradas, sendo uma por linha.
> - funcionarios.csv: Arquivo que lista os funcionarios da empresa e seus dados no formato CSV. O terceiro campo contem o número de competencias daquele funcionario.
> - projetos.csv: Arquivo que lista os dados dos projetos existentes na empresa. O quarto campo mostra o numero de competencias requeridas pelo projeto.
> - colaboradores.csv: Arquivo que lista os colaboradores associados a um projeto, e qual a competencia que este colaborador esta associado.

##

*Amanda Silva Vieira*

*Análise e Desenvolvimento de Sistemas - Faculdade SENAC/RS*
