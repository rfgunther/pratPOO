# ![MIT](https://img.shields.io/badge/MIT-_-green)![LICENSE](https://img.shields.io/badge/LICENSE-_-blueviolet)


# Sistema de Controle de Versão
## Treino de POO para Avaliação 1
### Treino de Git, .gitignore, LICENSE e vários comandos


# 🛠️ 1. Configuração inicial do Git
```
git config --global user.name "Seu Nome"     # Define o nome do autor dos commits
git config --global user.email "seu@email"   # Define o email associado aos commits
git config --global core.editor "code --wait"  # Define o editor padrão (VSCode, Notepad, etc.)
git config --global core.editor true         # Ignora abertura de editor ao fazer merge
git config --global alias.tree "log --oneline --graph --decorate --all"  # Cria atalho `git tree`
git config --global --list                   # Lista todas as configs globais do Git
```

# 📁 2. Criação e inicialização do projeto
```
mkdir nome-do-projeto                        # Cria uma pasta para o repositório
cd nome-do-projeto                           # Entra na pasta
git init                                     # Inicializa o repositório Git local
touch README.md                              # Cria arquivo README vazio
nano README.md                               # Edita o README no terminal
code README.md                               # Edita o README no VSCode
```
# 📝 3. Criação e edição de arquivos úteis

```
touch .gitignore                             # Cria o arquivo .gitignore
nano .gitignore                              # Edita o .gitignore
curl -L https://... -o .gitignore            # Baixa conteúdo gerado no site gitignore.io
touch LICENSE                                # Cria o arquivo de licença
nano LICENSE                                 # Edita a licença
code LICENSE                                 # Abre a licença no VSCode
```

# 📦 4. Controle de versões
```
git add .                                    # Adiciona todos os arquivos ao staging
git commit -m "Mensagem"                     # Cria um commit com a mensagem
git status                                   # Mostra o status dos arquivos no repositório
git log                                      # Mostra o histórico de commits
git tree                                     # Mostra o histórico em árvore (alias criado)
```


# 🌐 5. Conexão com o GitHub
```
git remote add origin https://github.com/... # Conecta o repositório local ao GitHub
git remote -v                                # Mostra os repositórios remotos configurados

```

# 🚀 6. Enviando e atualizando repositórios remotos
```
git push -u origin main                      # Primeiro push: envia e vincula a branch `main`
git push                                     # Próximos pushes: só isso já basta
git pull origin main --allow-unrelated-histories --no-edit  # Puxa alterações mesmo com histórico diferente
git merge --abort                            # Cancela um merge em andamento

```
# 🧼 7. Diagnóstico e limpeza
```
git rev-parse --show-toplevel                # Mostra onde está a raiz do repositório Git
rm -rf .git                                  # Remove o controle Git do repositório (com cautela!)

```

# 🧪 8. Comandos úteis extras
ls -la                                       # Lista arquivos ocultos e visíveis na pasta
cat nome-do-arquivo                          # Exibe o conteúdo de um arquivo no terminal

```
```

# Criando Personal Access Token (PAT) no GitHub

```
Um Personal Access Token (PAT) é uma alternativa mais segura ao uso de senha para autenticar ações no GitHub, como git push e git pull.

📸 Etapas para criar um PAT:
Acesse https://github.com/settings/tokens

Clique em "Generate new token"

Selecione o escopo (geralmente repo e workflow são suficientes)

Defina uma validade para o token

Copie o token gerado e salve-o em lugar seguro (ele só aparece uma vez!)

Exemplos visuais:

⚠️ Dica: crie uma pasta imagens/ dentro de lab-01/ e salve suas capturas de tela lá.

Salvar em cache as credenciais do PAT
Ao usar o PAT com HTTPS, o Git solicitará autenticação. Para evitar digitar o token toda vez, é possível armazenar as credenciais em cache.

Isso é especialmente útil para repositórios privados ou uso frequente.

Você pode configurar assim:

bash
Copiar
Editar
git config --global credential.helper cache
O Git irá armazenar suas credenciais em memória por 15 minutos (por padrão). Se quiser alterar o tempo:

bash
Copiar
Editar
git config --global credential.helper 'cache --timeout=3600'
⏳ Isso configura o cache para 1 hora (3600 segundos).
```
