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
Pode ser incoveniente ter que digitar o PAT toda vez que for se autenticar, por ser um grande token, por isso, é possível usar o credential helper do git.
``` bash
# Irá armazenar as credenciais na memória por 15 minutos
git config −−global credential.helper cache

# Caso queira armazenar por mais tempo, use (irá armazenar por 1 hora)
git config −−global credential.helper 'cache −−timeout=3600'
```


## Qual a diferença entre git merge e git rebase?
A principal diferença é que o git merge junta branches preservando o histórico original e criando um novo commit de fusão, resultando em uma estrutura ramificada (melhor uso em branches compartilhadas). O git rebase reescreve o histórico, movendo os commits da sua branch para o topo da branch principal, criando um histórico linear e limpo (melhor uso em branches locais/privadas).
