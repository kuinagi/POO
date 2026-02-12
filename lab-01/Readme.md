# Sistema de Controle de Versão
## Configuração inicial para o uso de Git
### Configuração de nome de usuário e e-mail no Git
Para fazer alterações em um repositório é necessário se identificar através do seu email e do seu usuário GitHub, para que todos saibam quem fez cada commit em um projeto.


``` bash
git config --global user.name "Seu Nome Completo"
git config --global user.email "seu.email@exemplo.com"
```
### Criando Personal Access Token (PAT) no GitHub
Um Personal Access Token, ou PAT, é como uma senha para dar um push de forma mais segura em um projeto.

1. Entre em sua conta GitHub
2. Acesse https://github.com/settings/tokens para ir para a criação de tokens
3. Clique em 'Tokens (Classic)'
4. Clique em Generate New Token
5. Ao gerar o Token, marque a permissão 'repo'
### Salvar em cache as credenciais do PAT

## Qual a diferença entre git merge e git rebase?