
# Projeto Java - Classe Computador com Menu Interativo

Este projeto demonstra como criar e gerenciar objetos de uma classe `Computador` em Java, utilizando **VS Code**.  
Agora com um **menu interativo** para cadastrar, listar, buscar e excluir computadores.

## ✅ Estrutura do Projeto
```
java-computador-vscode-v2/
├── .vscode/
│   ├── launch.json
│   ├── tasks.json
├── src/
│   └── br/com/codeplus/
│       ├── Computador.java
│       ├── AppComputador.java
├── .gitignore
└── README.md
```

## ✅ Funcionalidades
- Criar computadores com **construtor default** ou **construtor com parâmetros**  
- **Cadastrar** computadores dinamicamente (ArrayList)  
- **Listar** todos os computadores cadastrados  
- **Buscar** um computador pelo par (marca + modelo)  
- **Excluir** um computador pelo par (marca + modelo)  
- Menu interativo no console

## ✅ Como Executar
1. Abra o projeto no **VS Code**  
2. Certifique-se de ter o **Java instalado** e configurado no PATH  
3. Compile os arquivos:
```
javac src/br/com/codeplus/*.java
```
4. Execute a aplicação:
```
java -cp src br.com.codeplus.AppComputador
```

## ✅ Explicação Linha a Linha (Resumo)
- `ArrayList<Computador> listaComputadores = new ArrayList<>();` → Armazena dinamicamente os computadores
- `do { ... } while(opcao != 0);` → Laço do menu interativo
- `switch(opcao)` → Escolhe a ação do usuário
- Opção 1 → Cadastra um novo computador
- Opção 2 → Lista todos os computadores
- Opção 3 → Busca por marca e modelo
- Opção 4 → Exclui por marca e modelo

---

### Exemplo de Execução:
```
=== MENU ===
1 - Cadastrar computador
2 - Listar computadores
3 - Verificar computador
4 - Excluir computador
0 - Sair
Escolha uma opção:
```
